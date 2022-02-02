package com.vehiclelicenseapp.licenseapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicenseapp.licenseapplication.entity.Address;
import com.vehiclelicenseapp.licenseapplication.repo.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;

	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}

	public List<Address> getAddresses() {
			return addressRepository.findAll();
		}

	public boolean deleteAllAddress() {
		try {
			addressRepository.deleteAll();
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}

	public Address updateAddress(int addressId, Address obj) {
		Optional<Address> addContainer=addressRepository.findById(addressId);
		if(addContainer.isPresent())
		{
			Address oldObj=addContainer.get();
			oldObj.setcity(obj.getcity());
			oldObj.setstate(obj.getstate());
			System.out.println("Successfully updated");
			return addressRepository.saveAndFlush(oldObj);
		}
		else
		{
			System.out.println("Successfully Inserted");
			return addressRepository.save(obj);
		}
	}

}
