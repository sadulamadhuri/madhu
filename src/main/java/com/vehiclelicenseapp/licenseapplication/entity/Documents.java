package com.vehiclelicenseapp.licenseapplication.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Documents {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int documentsId;
	
	@NotNull(message="PhotoId should not be null")
	private String photo;
	
	@NotNull(message="IdProof should not be null")
	private String idProof;
	
	@NotNull(message="AddressProof should not be null")
	private String addressProof;
	
	public Documents() {
	super();
	}

	public Documents(int documentsId, String photo, String idProof, String addressProof) {
		super();
		this.documentsId = documentsId;
		this.photo = photo;
		this.idProof = idProof;
		this.addressProof = addressProof;
	}

	public int getDocumentsId() {
		return documentsId;
	}

	public void setDocumentsId(int documentsId) {
		this.documentsId = documentsId;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getAddressProof() {
		return addressProof;
	}

	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}

	@Override
	public String toString() {
		return "Documents [documentsId=" + documentsId + ", photo=" + photo + ", idProof=" + idProof + ", addressProof="
				+ addressProof + "]";
	}
}