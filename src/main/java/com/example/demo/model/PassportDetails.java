package com.example.demo.model;

import java.io.File;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PassportDetails {
  @Id
  @GeneratedValue(strategy =GenerationType.IDENTITY)
  private int passid;
  
  private String firstname;
  
  private String middlename;
  
  private String lastname;
  
  private long number;
  
  private String Countryofissue;
  
  private Date dateofbirth;
  
  private Date dateofissue;
  
  private Date dateofexpiry;
  
  private String placeofissue;
  
  private File scancopy;

public PassportDetails(int passid, String firstname, String middlename, String lastname, long number,
		String countryofissue, Date dateofbirth, Date dateofissue, Date dateofexpiry, String placeofissue,
		File scancopy) {
	super();
	this.passid = passid;
	this.firstname = firstname;
	this.middlename = middlename;
	this.lastname = lastname;
	this.number = number;
	Countryofissue = countryofissue;
	this.dateofbirth = dateofbirth;
	this.dateofissue = dateofissue;
	this.dateofexpiry = dateofexpiry;
	this.placeofissue = placeofissue;
	this.scancopy = scancopy;
}

public PassportDetails() {
	super();
	// TODO Auto-generated constructor stub
}

public int getPassid() {
	return passid;
}

public void setPassid(int passid) {
	this.passid = passid;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getMiddlename() {
	return middlename;
}

public void setMiddlename(String middlename) {
	this.middlename = middlename;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public long getNumber() {
	return number;
}

public void setNumber(long number) {
	this.number = number;
}

public String getCountryofissue() {
	return Countryofissue;
}

public void setCountryofissue(String countryofissue) {
	Countryofissue = countryofissue;
}

public Date getDateofbirth() {
	return dateofbirth;
}

public void setDateofbirth(Date dateofbirth) {
	this.dateofbirth = dateofbirth;
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

public String getPlaceofissue() {
	return placeofissue;
}

public void setPlaceofissue(String placeofissue) {
	this.placeofissue = placeofissue;
}

public File getScancopy() {
	return scancopy;
}

public void setScancopy(File scancopy) {
	this.scancopy = scancopy;
}
  
  
  
}
