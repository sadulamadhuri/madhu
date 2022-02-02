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

import com.vehiclelicenseapp.licenseapplication.entity.RTOOffice;
import com.vehiclelicenseapp.licenseapplication.service.RTOOfficeService;

@RestController
public class RTOOfficeController {
	@Autowired
	RTOOfficeService rtoofficeService;
	
	@PostMapping("/rtooffice")
	public RTOOffice createRTOOffice(@Valid @RequestBody RTOOffice rtooffice) {
		return rtoofficeService.createRTOOffice(rtooffice);
	}
	@GetMapping("/rtooffice/{rtoId}")
	public List<RTOOffice>getRTOOffices(){
		return rtoofficeService.getRTOOffices();
	}
	@DeleteMapping("/rtooffice/{rtoId}")
	public boolean deleteAllRTOOffice()
	{
		return rtoofficeService.deleteAllRTOOffice();
	}
	@PutMapping("/rtooffice/{rtoId}")
	public RTOOffice updateRTOOffice(@PathVariable int rtoId, @RequestBody RTOOffice obj)
	{
		return rtoofficeService.updateRTOOffice(rtoId,obj);
	}
}

