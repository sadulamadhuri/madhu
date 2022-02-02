package com.vehiclelicenseapp.licenseapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicenseapp.licenseapplication.entity.RTOOffice;
import com.vehiclelicenseapp.licenseapplication.repo.RTOOfficeRepository;

@Service
public class RTOOfficeService {
	@Autowired
	RTOOfficeRepository rtoofficeRepository;

	public RTOOffice createRTOOffice(RTOOffice rtooffice) {
		return rtoofficeRepository.save(rtooffice);
	}

	public List<RTOOffice> getRTOOffices() {
		return rtoofficeRepository.findAll();
	}
	
	public boolean deleteAllRTOOffice() {
		try {
				rtoofficeRepository.deleteAll();
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}

		public RTOOffice updateRTOOffice(int rtoofficeId, RTOOffice obj) {
			Optional<RTOOffice> addContainer=rtoofficeRepository.findById(rtoofficeId);
			if(addContainer.isPresent())
			{
				RTOOffice oldObj=addContainer.get();
				oldObj.setRtoId(obj.getRtoId());
				oldObj.setRtoName(obj.getRtoName());
				System.out.println("Successfully updated");
				return rtoofficeRepository.saveAndFlush(oldObj);
			}
			System.out.println("Successfully Inserted");
			return rtoofficeRepository.save(obj);
	}

}
