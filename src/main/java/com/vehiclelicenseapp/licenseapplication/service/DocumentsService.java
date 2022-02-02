package com.vehiclelicenseapp.licenseapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicenseapp.licenseapplication.entity.Documents;
import com.vehiclelicenseapp.licenseapplication.repo.DocumentsRepository;

@Service
public class DocumentsService {
	@Autowired
	DocumentsRepository documentsRepository;
	public Documents createDocuments(Documents docs) {
		return documentsRepository.save(docs);
	}

	public List<Documents> getDocs(){
		return documentsRepository.findAll();
	}
	public boolean deleteAllDocuments() {
		try {
			documentsRepository.deleteAll();
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}

	public Documents updateDocuments(int documentsId, Documents obj) {
		Optional<Documents> addContainer=documentsRepository.findById(documentsId);
		if(addContainer.isPresent())
		{
			Documents oldObj=addContainer.get();
			oldObj.setPhoto(obj.getPhoto());
			oldObj.setIdProof(obj.getIdProof());
			System.out.println("Successfully updated");
			return documentsRepository.saveAndFlush(oldObj);
		}
		System.out.println("Successfully Inserted");
		return documentsRepository.save(obj);
	}
}