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

import com.vehiclelicenseapp.licenseapplication.entity.Application;
import com.vehiclelicenseapp.licenseapplication.service.ApplicationService;

@RestController
public class ApplicationController {
	@Autowired
	ApplicationService applicationService;
	@PostMapping("/applications")
	public Application createApplication(@Valid @RequestBody Application application) {
		return applicationService.createApplication(application);
	}
	@GetMapping("/applications")
	public List<Application>getApplications(){
		return applicationService.getApplications();
	}
	@DeleteMapping("/applicantions")
	public boolean deleteAllApplication()
	{
		return applicationService.deleteAllApplication();
	}
	@PutMapping("/applicantions/{applicantId}")
	public Application updateApplication(@PathVariable int applicationId, @RequestBody Application obj)
	{
		return applicationService.updateApplication(applicationId,obj);
	}

}