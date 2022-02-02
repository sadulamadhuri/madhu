package com.vehiclelicenseapp.licenseapplication.entity;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="User_TB")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@NotNull(message="Email should not be null")
	@NotNull(message="Invalid Email")
	private String email;
	
	@NotNull(message="Password should be mandatory")
	@Pattern(regexp="^[A-Za-z]{5}[@,$,#,!]{1}[0-9]{2}$",message="Password should be with numbers and characters")
	private String password;

	public User() {
		super();
	}

	public User(int userId, String email, String password) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password=" + password + "]";
	}

}