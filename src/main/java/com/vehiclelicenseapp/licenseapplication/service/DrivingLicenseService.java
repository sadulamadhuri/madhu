package com.vehiclelicenseapp.licenseapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicenseapp.licenseapplication.entity.DrivingLicense;
import com.vehiclelicenseapp.licenseapplication.repo.DrivingLicenseRepository;
@Service
public class DrivingLicenseService {
	@Autowired
	DrivingLicenseRepository drivinglicenseRepository;
	
	public DrivingLicense createDrivingLicense(DrivingLicense drivinglicense) {
	return drivinglicenseRepository.save(drivinglicense);
	}
	
	public List<DrivingLicense> getDrivingLicense(){
	return drivinglicenseRepository.findAll();
	}
	
	public boolean deleteAllDrivingLicense() {
	try {
		drivinglicenseRepository.deleteAll();
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

public DrivingLicense updateDrivingLicense(int drivinglicenseId, DrivingLicense obj) {
	Optional<DrivingLicense> addContainer=drivinglicenseRepository.findById(drivinglicenseId);
	if(addContainer.isPresent())
	{
		DrivingLicense oldObj=addContainer.get();
		oldObj.setDrivingLicenseNumber(obj.getDrivingLicenseNumber());
		oldObj.setDateOfIssue(obj.getDateOfIssue());
		System.out.println("Successfully updated");
		return drivinglicenseRepository.saveAndFlush(oldObj);
	}
	System.out.println("Successfully Inserted");
	return drivinglicenseRepository.save(obj);
	}
}

