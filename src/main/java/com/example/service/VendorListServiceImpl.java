package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.VendorList;
import com.example.repository.VendorListRepository;

@Service("vendorListService")
public class VendorListServiceImpl implements VendorListService {

	@Autowired
	private VendorListRepository vendorListRepository;

	@Override
	public List<VendorList> addItems(List<VendorList> items) {
		
		return vendorListRepository.save(items);
	}

	@Override
	public List<VendorList> getAllItems(long businessId) {
		
		return vendorListRepository.findByBusinessId(businessId);
	}
	
	@Override
	public long deleteItemsByVendorId(long businessId) {
		
		return vendorListRepository.deleteByBusinessId(businessId);
	}

	@Override
	public VendorList addBatteryToList(VendorList vendorList) {
		return vendorListRepository.save(vendorList);
	}

	@Override
	public void deleteBatteryFromList(VendorList vendorList) {
		vendorListRepository.delete(vendorList);
	}

	@Override
	public VendorList getItem(VendorList vendorList) {
		return vendorListRepository.findByBusinessIdAndBatteryId(vendorList.getBusinessId(), vendorList.getBatteryId());
	}
	
	
}
