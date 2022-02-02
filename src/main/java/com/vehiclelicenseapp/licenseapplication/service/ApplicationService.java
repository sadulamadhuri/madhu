package com.vehiclelicenseapp.licenseapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicenseapp.licenseapplication.entity.Application;
import com.vehiclelicenseapp.licenseapplication.repo.ApplicationRepository;

@Service
public class ApplicationService {
	
	@Autowired
	ApplicationRepository applicationRepository;

	public Application createApplication(Application application) {
		return applicationRepository.save(application);
	}

	public List<Application> getApplications() {
			return applicationRepository.findAll();
		}

	public boolean deleteAllApplication() {
		try {
			applicationRepository.deleteAll();
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}

	public Application updateApplication(int applicationId, Application obj) {
		Optional<Application> addContainer=applicationRepository.findById(applicationId);
		if(addContainer.isPresent())
		{
			Application oldObj=addContainer.get();
			oldObj.setApplicationNumber(obj.getApplicationNumber());
			oldObj.setApplicationDate(obj.getApplicationDate());
			System.out.println("Successfully updated");
			return applicationRepository.saveAndFlush(oldObj);
		}
		System.out.println("Successfully Inserted");
		return applicationRepository.save(obj);
	}
}