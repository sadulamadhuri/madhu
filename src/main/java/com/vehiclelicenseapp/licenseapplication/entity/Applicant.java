package com.vehiclelicenseapp.licenseapplication.entity;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
public class Applicant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int applicantId;
	
	@Enumerated(value=EnumType.STRING)
	private Gender gender;
	
	@NotNull(message="First name should not be null")
	@Length(min=5,max=10,message="length should be minimum 5 and maximum 10 characters")
	private String firstName;
	
	@NotNull(message="Middle name should not be null")
	private String middleName;
	
	@NotNull(message="Last name should not be null")
	@Length(min=5,max=10,message="length should be minimum 5 and maximum 10 characters")
	private String lastName;
	
	@Temporal(value=TemporalType.DATE)
	@NotNull(message="DOB should not be null")
	//@Pattern(regexp="^[1-9]{2}[A-Z]{1}[a-z]{6}[0-9]{4}$",message="DOB can be with numbers and alphabets")
	private Date dateOfBirth;
	
	@NotNull(message="First name should not be null")
	private String placeOfBirth;
	
	@NotNull(message="Qualification should not be null")
	
	private String qualification;
	
	@NotNull(message="Mobile number can't be blank")
	@Pattern(regexp="^[0-9]{10}$",message="Mobile number should contain digits")
	private String mobile;
	
	@NotNull(message="Email should not be null")
	private String email;
	
	@NotNull(message="Nationality should not be null")
	private String nationality;
	
	@NotNull(message="VehicleType should not be null")
	private String vehicleType;
	
	@NotNull(message="VehicleNumber should be mandatory")
	@Pattern(regexp="^[A-Z]{2}[0-9]{2}[A-Z]{1,2}[0-9]{4}$",message="Vehiclenumber should be with alphabets and numbers")
	private String vehicleNumber;
	
	public Applicant() {
		super();
	}

	public Applicant(int applicantId, String firstName, String middleName, String lastName, Date dateOfBirth,
			String placeOfBirth, String qualification, String mobile, String email, String nationality,
			String vehicleType, String vehicleNumber) {
		super();
		this.applicantId = applicantId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.qualification = qualification;
		this.mobile = mobile;
		this.email = email;
		this.nationality = nationality;
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", placeOfBirth=" + placeOfBirth
				+ ", qualification=" + qualification + ", mobile=" + mobile + ", email=" + email + ", nationality="
				+ nationality + ", vehicleType=" + vehicleType + ", vehicleNumber=" + vehicleNumber + "]";
	}
	
}