package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.VendorList;

@Repository("vendorListRepository")
public interface VendorListRepository extends JpaRepository<VendorList, Long> {

	List<VendorList> findByBusinessId(long businessId);
	
	long deleteByBusinessId(long businessId);

	@Query("select v from VendorList v where v.businessId = :businessId and v.batteryId = :batteryId")
	VendorList findByBusinessIdAndBatteryId(@Param("businessId") long businessId,@Param("batteryId") long batteryId);
}
