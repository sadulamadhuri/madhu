package com.vehiclelicenseapp.licenseapplication.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicenseapp.licenseapplication.entity.Challan;
import com.vehiclelicenseapp.licenseapplication.repo.ChallanRepository;
@Service
public class ChallanService {
	@Autowired
	ChallanRepository challanRepository;

	public Challan createChallan(Challan challan) {
	return challanRepository.save(challan);
}

public List<Challan> getChallans() {
		return challanRepository.findAll();
	}

public boolean deleteAllChallan() {
	try {
		challanRepository.deleteAll();
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

public Challan updateChallan(int challanId, Challan obj) {
	Optional<Challan> addContainer=challanRepository.findById(challanId);
	if(addContainer.isPresent())
	{
		Challan oldObj=addContainer.get();
		oldObj.setChallanNumber(obj.getChallanNumber());
		oldObj.setVehicleNumber(obj.getVehicleNumber());
		System.out.println("Successfully updated");
		return challanRepository.saveAndFlush(oldObj);
	}
	System.out.println("Successfully Inserted");
	return challanRepository.save(obj);
	}
}
