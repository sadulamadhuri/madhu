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

import com.vehiclelicenseapp.licenseapplication.entity.Appointment;
import com.vehiclelicenseapp.licenseapplication.service.AppointmentService;

@RestController
public class AppointmentController {
	@Autowired
	AppointmentService appointmentService;
	@PostMapping("/appointments")
	public Appointment createAppointment(@Valid @RequestBody Appointment appointment) {
		return appointmentService.createAppointment(appointment);
	}
	@GetMapping("/appointments")
	public List<Appointment>getAppointments(){
		return appointmentService.getAppointments();
	}
	@DeleteMapping("/appointments")
	public boolean deleteAllAppointment()
	{
		return appointmentService.deleteAllAppointment();
	}
	@PutMapping("/appointments/{appointmentId}")
	public Appointment updateAppointment(@PathVariable int appointmentId, @RequestBody Appointment obj)
	{
		return appointmentService.updateAppointment(appointmentId,obj);
	}

}
