package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ContactDetails {
	
	 @Column(name="CONTACT_ID")
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int conatctid;
	
   
	 @Column(name="ADDRESS(STREET)")
	private String street;
	
	 @Column(name="CITY")
	private String city;
	
	 @Column(name="STATE")
	private String state;
	 
	 @Column(name="COUNTRY")
	private String country;
	
	 @Column(name="PINCODE")
	private int pincode;
	
	 @Column(name="MOBILE_NUMBER")
	private long mobile;
	
	 @Column(name="EMAIL")
	private String email;
	
	 @Column(name="IS_CC_EMAIL")
	private boolean ccemail;

	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactDetails(String street, String city, String state, String country, int pincode, long mobile,
			String email, boolean ccemail) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.mobile = mobile;
		this.email = email;
		this.ccemail = ccemail;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isCcemail() {
		return ccemail;
	}

	public void setCcemail(boolean ccemail) {
		this.ccemail = ccemail;
	}
	
}
