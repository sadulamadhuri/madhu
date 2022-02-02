package com.vehiclelicenseapp.licenseapplication.entity;

import javax.persistence.Entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Application {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int applicationId;
	
	@Enumerated(value=EnumType.STRING)
	private ApplicationType applicationType;
	
	@NotNull(message="ApplicationNumber should not be null")
	private String applicationNumber;
	
	@NotNull(message="ApplicationDate should not be null")
	private String applicationDate;
	
	@NotNull(message="Mode of payment should not be null")
	private String modeOfPayment;
	
	@NotNull(message="Amount paid should not be null")
	private double amountPaid;
	
	@NotNull(message="Payment status should not be null")
	private String paymentStatus;
	
	@Enumerated(value=EnumType.STRING)
	private ApplicationStatus applicationStatus;
	
	@NotNull(message="Remarks should not be null")
	private String remarks;
	
	public Application() {
		super();
	}

	public Application(int applicationId, String applicationNumber, String applicationDate, String modeOfPayment,
			double amountPaid, String paymentStatus, String remarks) {
		super();
		this.applicationId = applicationId;
		this.applicationNumber = applicationNumber;
		this.applicationDate = applicationDate;
		this.modeOfPayment = modeOfPayment;
		this.amountPaid = amountPaid;
		this.paymentStatus = paymentStatus;
		this.remarks = remarks;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", applicationNumber=" + applicationNumber
				+ ", applicationDate=" + applicationDate + ", modeOfPayment=" + modeOfPayment + ", amountPaid="
				+ amountPaid + ", paymentStatus=" + paymentStatus + ", remarks=" + remarks + "]";
	}
}
