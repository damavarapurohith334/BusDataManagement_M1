package com.busData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busData.DTO.BusDataDTO_ForDataInsertion;
import com.busData.DTO.BusDataDTO_ForPassengers;
import com.busData.exception.BusAlreadyExist;
import com.busData.exception.BusNotFound;
import com.busData.service.BusDataService;

import jakarta.validation.Valid;

@RequestMapping("/bus_data_controller")
@RestController // @RestController = @Controller + @ResponseBody
@Validated
public class BusDataController {

	@Autowired
	BusDataService busDataService;

	// Test API
	@GetMapping("/test")
	public ResponseEntity<String> createCustomer() {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(busDataService.testMethod());
	}

	// Shows all bus data
	@GetMapping("/show_all_bus_data")
	public ResponseEntity<List<BusDataDTO_ForPassengers>> showAllData() {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(busDataService.showAllData());
	}

	// Insert bus data into the database
	@PostMapping("/insert_Bus_Data")
	public ResponseEntity<BusDataDTO_ForDataInsertion> insertBusData(
			@Valid @RequestBody BusDataDTO_ForDataInsertion busDataDTO_ForDataInsertion) throws BusAlreadyExist {

		BusDataDTO_ForDataInsertion insertedBusData = busDataService.insertBusData(busDataDTO_ForDataInsertion);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(insertedBusData);
	}

	//Update bus data by bus number
	@PutMapping("update_busData_by_busNumber/{busNumber}")
	public ResponseEntity<String> updateBusData(@PathVariable String busNumber,
			@Valid @RequestBody BusDataDTO_ForDataInsertion busDataDTO_ForDataInsertion) throws BusNotFound {
		busDataService.updateBusData(busNumber, busDataDTO_ForDataInsertion);

		return ResponseEntity.status(HttpStatus.ACCEPTED)
				.body("Bus Number: "
						+ busDataService.updateBusData(busNumber, busDataDTO_ForDataInsertion).getBusNumber()
						+ " details updated successfully");
	}
	// Delete bus data by bus number
	@DeleteMapping("delete_busData_by_busNumber/{busNumber}")
	public ResponseEntity<String>  deleteCustomer(@PathVariable String busNumber) throws BusNotFound {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(busDataService.deleteBusData(busNumber));
	}
	
	//Show bus data by bus number
	@GetMapping("get_busData_by_busNumber/{busNumber}") 
	public ResponseEntity<?> showBusDataByBusNumber( @PathVariable String busNumber) throws BusNotFound{
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(busDataService.showBusDataByBusID(busNumber));
	}
	
}
