package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PersonalInformation {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personalid;
	
	private String gender;
	
	private String residency;
	
	private String nationality;
	
	private String dateofbirth;
	
	private String travelcoordinator;
	
	private String travellername;
	
	private String delegetionsupervisorname;
	
	private String progfiletype;

	public PersonalInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalInformation(String gender, String residency, String nationality, String dateofbirth,
			String travelcoordinator, String travellername, String delegetionsupervisorname, String progfiletype) {
		super();
		this.gender = gender;
		this.residency = residency;
		this.nationality = nationality;
		this.dateofbirth = dateofbirth;
		this.travelcoordinator = travelcoordinator;
		this.travellername = travellername;
		this.delegetionsupervisorname = delegetionsupervisorname;
		this.progfiletype = progfiletype;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getResidency() {
		return residency;
	}

	public void setResidency(String residency) {
		this.residency = residency;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getTravelcoordinator() {
		return travelcoordinator;
	}

	public void setTravelcoordinator(String travelcoordinator) {
		this.travelcoordinator = travelcoordinator;
	}

	public String getTravellername() {
		return travellername;
	}

	public void setTravellername(String travellername) {
		this.travellername = travellername;
	}

	public String getDelegetionsupervisorname() {
		return delegetionsupervisorname;
	}

	public void setDelegetionsupervisorname(String delegetionsupervisorname) {
		this.delegetionsupervisorname = delegetionsupervisorname;
	}

	public String getProgfiletype() {
		return progfiletype;
	}

	public void setProgfiletype(String progfiletype) {
		this.progfiletype = progfiletype;
	}
	
	
	
}
