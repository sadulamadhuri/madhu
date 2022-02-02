package com.vehiclelicenseapp.licenseapplication.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class DrivingLicense {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int drivinglicenseId;
	
	@NotNull(message="DrivingLicenseNumber should not be null")
	@Pattern(regexp="^[a-zA-Z]{2}-\\d\\d-(19\\d\\d|20[01][0-9])-\\d{7}$")
	@Column(name="Driving_License_Number")
	private String drivingLicenseNumber;
	
	@NotNull(message="DateOfIssue should be mandatory")
	@Temporal(value=TemporalType.DATE)
	@Column(name="Date_Of_Issue")
	private Date dateOfIssue;
	
	@NotNull(message="ValidTill should be mandatory")
	@Temporal(value=TemporalType.DATE)
	@Column(name="Valid_Till")
	private Date validTill;
	
	public DrivingLicense() {
		super();
	}

	public DrivingLicense(int drivinglicenseId, String drivingLicenseNumber, Date dateOfIssue, Date validTill) {
		super();
		this.drivinglicenseId = drivinglicenseId;
		this.drivingLicenseNumber = drivingLicenseNumber;
		this.dateOfIssue = dateOfIssue;
		this.validTill = validTill;
	}

	public int getDrivinglicenseId() {
		return drivinglicenseId;
	}

	public void setDrivinglicenseId(int drivinglicenseId) {
		this.drivinglicenseId = drivinglicenseId;
	}

	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}

	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public Date getValidTill() {
		return validTill;
	}

	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}

	@Override
	public String toString() {
		return "DrivingLicense [drivinglicenseId=" + drivinglicenseId + ", drivingLicenseNumber=" + drivingLicenseNumber
				+ ", dateOfIssue=" + dateOfIssue + ", validTill=" + validTill + "]";
	}
}