package com.busData.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.busData.DTO.BusDataDTO_ForDataInsertion;
import com.busData.DTO.BusDataDTO_ForPassengers;
import com.busData.entity.BusDataEntity;
import com.busData.exception.BusAlreadyExist;
import com.busData.exception.BusNotFound;
import com.busData.repository.BusDataRepo;
import com.busData.utils.ValidationConstants;

@Service
@PropertySource("classpath:ValidationMessages.properties")
public class BusDataService {

	@Autowired
	BusDataRepo busDataRepo;

	@Autowired
	Environment environment;

	// Testing method
	public String testMethod() {
		return "Hi Bro, test run successful";
	}

	// Shows all bus data
	public List<BusDataDTO_ForPassengers> showAllData() {

		List<BusDataEntity> allBusData = busDataRepo.findAll();
		List<BusDataDTO_ForPassengers> busDataDTO_ForPassengerslist = new ArrayList<>();

		for (BusDataEntity busDataEntity : allBusData) {
			BusDataDTO_ForPassengers busDataDTO_ForPassengers = new BusDataDTO_ForPassengers();
			BeanUtils.copyProperties(busDataEntity, busDataDTO_ForPassengers);
			busDataDTO_ForPassengerslist.add(busDataDTO_ForPassengers);
		}
		return busDataDTO_ForPassengerslist;
	}

	// Insert bus data into the database
	public BusDataDTO_ForDataInsertion insertBusData(BusDataDTO_ForDataInsertion busDataDTO_ForDataInsertion)
			throws BusAlreadyExist {

		Optional<BusDataEntity> existedBusNumber = busDataRepo.findById(busDataDTO_ForDataInsertion.getBusNumber());
		BusDataEntity busDataEntity = new BusDataEntity();
		if (existedBusNumber.isEmpty()) {

			BeanUtils.copyProperties(busDataDTO_ForDataInsertion, busDataEntity);
			busDataRepo.save(busDataEntity);
			return busDataDTO_ForDataInsertion;
		} else {
			throw new BusAlreadyExist(environment.getProperty(ValidationConstants.BUS_ALREADY_EXIST.toString()));
		}

	}

	// Update bus data by bus number
	public BusDataDTO_ForDataInsertion updateBusData(String busNumber,
			BusDataDTO_ForDataInsertion busDataDTO_ForDataInsertion) throws BusNotFound {
		BusDataEntity busDataEntity = new BusDataEntity();
		if (busDataRepo.findById(busNumber).isPresent()) {

			BeanUtils.copyProperties(busDataDTO_ForDataInsertion, busDataEntity);
			busDataRepo.save(busDataEntity);
			return busDataDTO_ForDataInsertion;
		} else {

			throw new BusNotFound(environment.getProperty(ValidationConstants.BUS_NOT_FOUND.toString()));
		}
	}

	// Delete bus data by bus number
	public String deleteBusData(String busNumber) throws BusNotFound {
		if (busDataRepo.findById(busNumber).isPresent()) {

			busDataRepo.deleteById(busNumber);
			return "Bus Number: " + busNumber + " deleted successfully";
		} else {
			throw new BusNotFound(environment.getProperty(ValidationConstants.BUS_NOT_FOUND.toString()));
		}
	}

	// Shows bus data by bus number
	public BusDataDTO_ForPassengers showBusDataByBusID(String busNumber) throws BusNotFound {
		BusDataDTO_ForPassengers busDataDTO_ForPassengers = new BusDataDTO_ForPassengers();
		Optional<BusDataEntity> busDataFromRepo = busDataRepo.findById(busNumber);
		if (busDataFromRepo.isPresent()) {
			BusDataEntity busDataEntity = busDataFromRepo.get();
			BeanUtils.copyProperties(busDataEntity, busDataDTO_ForPassengers);
			return busDataDTO_ForPassengers;
		} else {
			throw new BusNotFound(environment.getProperty(ValidationConstants.BUS_NOT_FOUND.toString()));
		}
	}

	// Search Bus data by source and destination with streams 
	public List<BusDataDTO_ForPassengers> getBusDataBySourceAndDestination(String source, String destination) {
		List<BusDataEntity> busDataEntities = busDataRepo.findBySourceAndDestinationIgnoreCase(source, destination);
		return busDataEntities.stream().map(busDataEntity -> {
			BusDataDTO_ForPassengers busDataDTO = new BusDataDTO_ForPassengers();
			BeanUtils.copyProperties(busDataEntity, busDataDTO);
			return busDataDTO;
		}).collect(Collectors.toList());
		
	}
	// Search Bus data by source and destination without streams 
	public List<BusDataDTO_ForPassengers> getBusDataBySourceAndDestinationWithoutLambdaExpressions(String source, String destination) {
        List<BusDataEntity> busDataEntities = busDataRepo.findBySourceAndDestinationIgnoreCase(source, destination);
        
        List<BusDataDTO_ForPassengers> busDataDTOList = new ArrayList<>();
        for (BusDataEntity busDataEntity : busDataEntities) {
            BusDataDTO_ForPassengers busDataDTO = new BusDataDTO_ForPassengers();
            BeanUtils.copyProperties(busDataEntity, busDataDTO);
            busDataDTOList.add(busDataDTO);
        }
        
        return busDataDTOList;
    }
}
