package com.vehiclelicenseapp.licenseapplication.entity;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int appointmentId;
	
	@NotNull(message="AppointmentNumber should not be null")
	@Length(min=5,max=9)
	private String appointmentNumber;
	
	@Temporal(value=TemporalType.DATE)
	@NotNull(message="TestDate should not be null")
	private Date testDate;
	
	@NotNull(message="TimeSlot should not be null")
	private String timeSlot;
	
	@NotNull(message="TestResult should not be null")
	private String testResult;
	
	public Appointment() {
		super();
	}

	public Appointment(int appointmentId, String appointmentNumber, Date testDate, String timeSlot, String testResult) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentNumber = appointmentNumber;
		this.testDate = testDate;
		this.timeSlot = timeSlot;
		this.testResult = testResult;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getAppointmentNumber() {
		return appointmentNumber;
	}

	public void setAppointmentNumber(String appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentNumber=" + appointmentNumber
				+ ", testDate=" + testDate + ", timeSlot=" + timeSlot + ", testResult=" + testResult + "]";
	}
}