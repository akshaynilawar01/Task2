package com.example.demo.model;

import java.io.File;
import java.sql.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class VisaDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int visaid;
	
	
	private long visanumber;
	
	private String countryofissue;
	
	private String typeofvisa;
	
	private Date dateofissue;
	
	private Date dateofexpiry;
	
	private String linkedpassport;
	
	private File sacncopy;



	
	public VisaDetails() {
		super();
		// TODO Auto-generated constructor stub
	}




	public VisaDetails(int visaid, long visanumber, String countryofissue, String typeofvisa, Date dateofissue,
			Date dateofexpiry, String linkedpassport, File sacncopy) {
		super();
		this.visaid = visaid;
		this.visanumber = visanumber;
		this.countryofissue = countryofissue;
		this.typeofvisa = typeofvisa;
		this.dateofissue = dateofissue;
		this.dateofexpiry = dateofexpiry;
		this.linkedpassport = linkedpassport;
		this.sacncopy = sacncopy;
	}




	public int getVisaid() {
		return visaid;
	}




	public void setVisaid(int visaid) {
		this.visaid = visaid;
	}




	public long getVisanumber() {
		return visanumber;
	}




	public void setVisanumber(long visanumber) {
		this.visanumber = visanumber;
	}




	public String getCountryofissue() {
		return countryofissue;
	}




	public void setCountryofissue(String countryofissue) {
		this.countryofissue = countryofissue;
	}




	public String getTypeofvisa() {
		return typeofvisa;
	}




	public void setTypeofvisa(String typeofvisa) {
		this.typeofvisa = typeofvisa;
	}




	public Date getDateofissue() {
		return dateofissue;
	}




	public void setDateofissue(Date dateofissue) {
		this.dateofissue = dateofissue;
	}




	public Date getDateofexpiry() {
		return dateofexpiry;
	}




	public void setDateofexpiry(Date dateofexpiry) {
		this.dateofexpiry = dateofexpiry;
	}




	public String getLinkedpassport() {
		return linkedpassport;
	}




	public void setLinkedpassport(String linkedpassport) {
		this.linkedpassport = linkedpassport;
	}




	public File getSacncopy() {
		return sacncopy;
	}




	public void setSacncopy(File sacncopy) {
		this.sacncopy = sacncopy;
	}


	
	
}
