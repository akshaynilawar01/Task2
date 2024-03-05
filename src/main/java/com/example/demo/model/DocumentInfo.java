package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class DocumentInfo {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="passid")
	private PassportDetails passportDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="visaid")
	private VisaDetails visaDetails;

	public DocumentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DocumentInfo(int docid, PassportDetails passportDetails, VisaDetails visaDetails) {
		super();
		this.docid = docid;
		this.passportDetails = passportDetails;
		this.visaDetails = visaDetails;
	}

	public int getDocid() {
		return docid;
	}

	public void setDocid(int docid) {
		this.docid = docid;
	}

	public PassportDetails getPassportDetails() {
		return passportDetails;
	}

	public void setPassportDetails(PassportDetails passportDetails) {
		this.passportDetails = passportDetails;
	}

	public VisaDetails getVisaDetails() {
		return visaDetails;
	}

	public void setVisaDetails(VisaDetails visaDetails) {
		this.visaDetails = visaDetails;
	}

}
