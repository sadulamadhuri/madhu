package com.vehiclelicenseapp.licenseapplication.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
public class RTOOfficer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rtoofficerId;
	
	@NotNull(message="User name should not be null")
	@Length(min=6,max=20)
	private String username;
	
	@NotNull(message="Password should be mandatory")
	@Pattern(regexp="^[A-Za-z0-9@*#!]{6}$",message= "password should be mandatory")
	private String password;
	
	@NotNull(message="Email should not be null")
	private String email;
	
	public RTOOfficer() {
		super();
	}

	public RTOOfficer(int rtoofficerId, String username, String password, String email) {
		super();
		this.rtoofficerId = rtoofficerId;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public int getRtoofficerId() {
		return rtoofficerId;
	}

	public void setRtoofficerId(int rtoofficerId) {
		this.rtoofficerId = rtoofficerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "RTOOfficer [rtoofficerId=" + rtoofficerId + ", username=" + username + ", password=" + password
				+ ", email=" + email + "]";
	}
}