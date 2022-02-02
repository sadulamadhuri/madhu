package com.vehiclelicenseapp.licenseapplication.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class RTOOffice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rtoId;
	
	@NotNull(message="RtoName should not be null")
	@Length(min=5,max=11)
	private String rtoName;
	
	public RTOOffice() {
		super();
	}

	public RTOOffice(int rtoId, String rtoName) {
		super();
		this.rtoId = rtoId;
		this.rtoName = rtoName;
	}


	public int getRtoId() {
		return rtoId;
	}

	public void setRtoId(int rtoId) {
		this.rtoId = rtoId;
	}

	public String getRtoName() {
		return rtoName;
	}

	public void setRtoName(String rtoName) {
		this.rtoName = rtoName;
	}

	@Override
	public String toString() {
		return "RTOOffice [ rtoId=" + rtoId + ", rtoName=" + rtoName + "]";
	}
	
}