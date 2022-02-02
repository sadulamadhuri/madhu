package com.vehiclelicenseapp.licenseapplication.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
public class Challan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int challanId;
	
	@NotNull(message="ChallanNumber should  not be null")
	@Length(min=5,max=11)
	private String challanNumber;
	
	@NotNull(message="VehicleNumber should be mandatory")
	@Pattern(regexp="^[A-Z]{2}[0-9]{2}[A-Z]{1,2}[0-9]{4}$")
	private String vehicleNumber;
	
	@NotNull(message="amount should not be null")
	private double amount;
	
	public Challan() {
		super();
	}

	public Challan(int challanId, String challanNumber, String vehicleNumber, double amount) {
		super();
		this.challanId = challanId;
		this.challanNumber = challanNumber;
		this.vehicleNumber = vehicleNumber;
		this.amount = amount;
	}

	public int getChallanId() {
		return challanId;
	}

	public void setChallanId(int challanId) {
		this.challanId = challanId;
	}

	public String getChallanNumber() {
		return challanNumber;
	}

	public void setChallanNumber(String challanNumber) {
		this.challanNumber = challanNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Challan [challanId=" + challanId + ", challanNumber=" + challanNumber + ", vehicleNumber="
				+ vehicleNumber + ", amount=" + amount + "]";
	}
}