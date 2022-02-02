package com.vehiclelicenseapp.licenseapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicenseapp.licenseapplication.entity.RTOOfficer;
import com.vehiclelicenseapp.licenseapplication.repo.RTOOfficerRepository;

@Service
public class RTOOfficerService {
	@Autowired
	RTOOfficerRepository rtoofficerRepository;
	
	public RTOOfficer createRTOOfficer(RTOOfficer rtoofficer) {
		return rtoofficerRepository.save(rtoofficer) ;
	}

	public List<RTOOfficer> getRTOOfficer() {
		return rtoofficerRepository.findAll();
	}
	public boolean deleteAllRTOOfficer() {
		try {
				rtoofficerRepository.deleteAll();
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}

		public RTOOfficer updateRTOOfficer(int rtoofficerId, RTOOfficer obj) {
			Optional<RTOOfficer> addContainer=rtoofficerRepository.findById(rtoofficerId);
			if(addContainer.isPresent())
			{
				RTOOfficer oldObj=addContainer.get();
				oldObj.setUsername(obj.getUsername());
				oldObj.setPassword(obj.getPassword());
				System.out.println("Successfully updated");
				return rtoofficerRepository.saveAndFlush(oldObj);
			}
			System.out.println("Successfully Inserted");
			return rtoofficerRepository.save(obj);
		}
}
