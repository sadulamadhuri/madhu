package com.vehiclelicenseapp.licenseapplication.ctrl;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehiclelicenseapp.licenseapplication.entity.Applicant;
import com.vehiclelicenseapp.licenseapplication.service.ApplicantService;

@RestController
public class ApplicantController {
	
		@Autowired
		ApplicantService applicantService;
		@PostMapping("/applicants")
		public Applicant createApplicant(@Valid @RequestBody Applicant  applicant) {
			return applicantService.createAddress(applicant);
		}
		@GetMapping("/applicants")
		public List<Applicant>getApplicants(){
			return applicantService.getApplicants();
		}
		@DeleteMapping("/applicants")
		public boolean deleteAllApplicant()
		{
			return applicantService.deleteAllApplicant();
		}
		@PutMapping("/applicants/{applicantId}")
		public Applicant updateApplicant(@PathVariable int applicantId, @RequestBody Applicant obj)
		{
			return applicantService.updateApplicant(applicantId,obj);
		}
}

