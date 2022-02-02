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

import com.vehiclelicenseapp.licenseapplication.entity.RTOOfficer;
import com.vehiclelicenseapp.licenseapplication.service.RTOOfficerService;

@RestController
public class RTOOfficerController {
	@Autowired
	RTOOfficerService rtoofficerService;
	
	@PostMapping("/rtos")
	public RTOOfficer createRTOOfficer(@Valid @RequestBody RTOOfficer rtoofficer) {
		return rtoofficerService.createRTOOfficer(rtoofficer);
	}
	@GetMapping("/rtos/{rtoofficerId}")
	public List<RTOOfficer>getRTOOfficers(){
		return rtoofficerService.getRTOOfficer();
	}
	@DeleteMapping("/rtos/{rtoofficerId}")
	public boolean deleteAllRTOOfficer()
	{
		return rtoofficerService.deleteAllRTOOfficer();
	}
	@PutMapping("/rtos/{rtoofficerId}")
	public RTOOfficer updateRTOOfficer(@PathVariable int rtoofficerId, @RequestBody RTOOfficer obj)
	{
		return rtoofficerService.updateRTOOfficer(rtoofficerId,obj);
	}
}
