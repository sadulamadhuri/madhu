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

import com.vehiclelicenseapp.licenseapplication.entity.DrivingLicense;
import com.vehiclelicenseapp.licenseapplication.service.DrivingLicenseService;

@RestController
public class DrivingLicenseController {
	@Autowired
	DrivingLicenseService drivinglicenseService;
	@PostMapping("/drivers")
	public DrivingLicense createDrivingLicense(@Valid @RequestBody DrivingLicense drivinglicense) {
		return drivinglicenseService.createDrivingLicense(drivinglicense);
	}
	@GetMapping("/drivers")
	public List<DrivingLicense>getDrivingLicense(){
		return drivinglicenseService.getDrivingLicense();
	}
	@DeleteMapping("/drivers")
	public boolean deleteAllDocuments()
	{
		return drivinglicenseService.deleteAllDrivingLicense();
	}
	@PutMapping("/drivers/{drivinglicenseId}")
	public DrivingLicense updateDrivingLicense(@PathVariable int drivinglicenseId, @RequestBody DrivingLicense obj)
	{
		return drivinglicenseService.updateDrivingLicense(drivinglicenseId,obj);
	}
}


