package com.vehiclelicenseapp.licenseapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicenseapp.licenseapplication.entity.Applicant;
import com.vehiclelicenseapp.licenseapplication.repo.ApplicantRepository;

@Service
public class ApplicantService {
	
	@Autowired
	ApplicantRepository applicantRepository;

	public Applicant createAddress(Applicant applicant) {
		return applicantRepository.save(applicant);
	}

	public List<Applicant> getApplicants() {
			return applicantRepository.findAll();
		}

	public boolean deleteAllApplicant() {
		try {
			applicantRepository.deleteAll();
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}

	public Applicant updateApplicant(int applicantId, Applicant obj) {
		Optional<Applicant> addContainer=applicantRepository.findById(applicantId);
		if(addContainer.isPresent())
		{
			Applicant oldObj=addContainer.get();
			oldObj.setFirstName(obj.getFirstName());
			oldObj.setLastName(obj.getLastName());
			System.out.println("Successfully updated");
			return applicantRepository.saveAndFlush(oldObj);
		}
		System.out.println("Successfully Inserted");
		return applicantRepository.save(obj);
	}

}
