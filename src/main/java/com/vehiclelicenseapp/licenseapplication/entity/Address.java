package com.vehiclelicenseapp.licenseapplication.entity;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Address_Id")
	private int addressId;
	@Column(name="State_Name")
	@NotNull(message="State Name should not be null")
	private String state;
	@Column(name="City_Name")
	@NotNull(message="City Name should not be null")
	private String city;
	@Column(name="House_Name")
	@NotNull(message="House Name should not be null")
	private String house;
	@Column(name="Landmark")
	@NotNull(message="Landmark Name should not be null")
	private String landmark;
	@Column(name="Pincode_Number")
	@NotNull(message="pincode can't be null")
	@Pattern(regexp="^[1-9]{1}[0-9]{5}$",message="pin code should not contain letters")
	private String pincode;
	
	public Address() {
		super();
	}
	public Address(int addressId, String state, String city, String house, String landmark, String pincode) {
		super();
		this.addressId=addressId;
		this.state=state;
		this.city=city;
		this.house=house;
		this.landmark=landmark;
		this.pincode=pincode;
	}
	public int getaddressId(){
		return addressId;
	}
	public void setaddressId(int addressId){
		this.addressId=addressId;
	}
	public String getstate() {
		return state;
	}
	public void setstate(String state) {
		this.state=state; 
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city=city;
	}
	public String gethouse() {
		return house;
	}
	public void sethouse(String house) {
		this.house=house;
	}
	public String getlandmark() { 
		return landmark;
	}
	public void setlandmark(String landmark) {
		this.landmark=landmark;
	}
	public String getpincode() {
		return pincode;
	}
	public void setpincode(String pincode) {
		this.pincode=pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", state=" + state + ", city=" + city + ", house=" + house
				+ ", landmark=" + landmark + ", pincode=" + pincode + "]";
	}
}