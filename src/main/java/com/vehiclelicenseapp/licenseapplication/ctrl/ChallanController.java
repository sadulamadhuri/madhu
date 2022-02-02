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

import com.vehiclelicenseapp.licenseapplication.entity.Challan;
import com.vehiclelicenseapp.licenseapplication.service.ChallanService;

@RestController
public class ChallanController {
	@Autowired
	ChallanService challanService;
	@PostMapping("/challans")
	public Challan createChallan(@Valid @RequestBody Challan challan) {
		return challanService.createChallan(challan);
	}
	@GetMapping("/challans")
	public List<Challan>getChallans(){
		return challanService.getChallans();
	}
	@DeleteMapping("/challans")
	public boolean deleteAllChallan()
	{
		return challanService.deleteAllChallan();
	}
	@PutMapping("/challans/{challanId}")
	public Challan updateChallan(@PathVariable int challanId, @RequestBody Challan obj)
	{
		return challanService.updateChallan(challanId,obj);
	}
}
