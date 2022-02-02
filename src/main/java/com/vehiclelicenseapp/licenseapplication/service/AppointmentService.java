package com.vehiclelicenseapp.licenseapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicenseapp.licenseapplication.entity.Appointment;
import com.vehiclelicenseapp.licenseapplication.repo.AppointmentRepository;

@Service
public class AppointmentService {
	@Autowired
	AppointmentRepository appointmentRepository;

	public Appointment createAppointment(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}

	public List<Appointment> getAppointments() {
			return appointmentRepository.findAll();
		}

	public boolean deleteAllAppointment() {
		try {
			appointmentRepository.deleteAll();
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}

	public Appointment updateAppointment(int appointmentId, Appointment obj) {
		Optional<Appointment> addContainer=appointmentRepository.findById(appointmentId);
		if(addContainer.isPresent())
		{
			Appointment oldObj=addContainer.get();
			oldObj.setAppointmentNumber(obj.getAppointmentNumber());
			oldObj.setTestDate(obj.getTestDate());
			System.out.println("Successfully updated");
			return appointmentRepository.saveAndFlush(oldObj);
		}
		System.out.println("Successfully Inserted");
		return appointmentRepository.save(obj);
	}
}