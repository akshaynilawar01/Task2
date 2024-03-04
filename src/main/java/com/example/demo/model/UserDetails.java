package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDetails {
    @Column(name="USER_ID")
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
	private int userid;
    
    @Column(name="SALUTATION")
	private String salutation;
	
    @Column(name="FIRST_NAME")
	private String firstname;
	
    @Column(name="MIDDLE_NAME")
	private String middlename;
	
    @Column(name="LAST_NAME")
	private String lastname;
	
    @Column(name="STATUS")
	private String status;

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetails(String salutation, String firstname, String middlename, String lastname, String status) {
		super();
		this.salutation = salutation;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.status = status;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
