package com.busData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.busData.entity.BusDataEntity;

@Repository
public interface BusDataRepo extends JpaRepository<BusDataEntity, String>{

	List<BusDataEntity> findBySourceAndDestinationIgnoreCase(String source, String destination);
	
}
