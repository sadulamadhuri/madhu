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

import com.vehiclelicenseapp.licenseapplication.entity.Address;
import com.vehiclelicenseapp.licenseapplication.service.AddressService;


	@RestController
	public class AddressController  {
		@Autowired
		AddressService addressService;
		
		@PostMapping("/addresses")
		public Address createAddress(@Valid @RequestBody Address address) 
		{
			return addressService.createAddress(address);
		}
		@GetMapping("/addresses")
		public List<Address>getAddresses()
		{
			return addressService.getAddresses();
		}
		@DeleteMapping("/addresses")
		public boolean deleteAllAddress()
		{
			return addressService.deleteAllAddress();
		}
		@PutMapping("/addresses/{addressId}")
		public Address updateAddress(@PathVariable int addressId, @RequestBody Address obj)
		{
			return addressService.updateAddress(addressId,obj);
		}
	}