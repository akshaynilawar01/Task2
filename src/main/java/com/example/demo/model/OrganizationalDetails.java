package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrganizationalDetails {
	
	 @Column(name="ORG_ID")
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orgid;
	 
	 @Column(name="BILLING_ENTITY")
	private String billingentity;
	
	 @Column(name="EMPLOYEE_CODE")
	private String employeecode;
	
	 @Column(name="EMAIL")
	private String email;
	
	 @Column(name="STATUS")
	private String status;
	
	 @Column(name="DESIGNATION")
	private String designation;
	
	 @Column(name="COST_CODE")
	private int costcode;
	
	 @Column(name="GRADE")
	private String grade;
	
	 @Column(name="DEPARTMENT")
	private String department;
	
	 @Column(name="LOCATION")
	private String Location;
	
	 @Column(name="DATE_OF_JOINING")
	private Date dateofjoining;
	
	 @Column(name="DATE_OF_TERMINATION")
	private Date dateoftermination;
	
	 @Column(name="IS_ADMIN")
	private boolean isadmin;
	
	 @Column(name="IS_APPROVER")
	private boolean isapprover;

	public OrganizationalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public int getCostcode() {
		return costcode;
	}



	public void setCostcode(int costcode) {
		this.costcode = costcode;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getLocation() {
		return Location;
	}



	public void setLocation(String location) {
		Location = location;
	}



	public Date getDateofjoining() {
		return dateofjoining;
	}



	public void setDateofjoining(Date dateofjoining) {
		this.dateofjoining = dateofjoining;
	}



	public Date getDateoftermination() {
		return dateoftermination;
	}



	public void setDateoftermination(Date dateoftermination) {
		this.dateoftermination = dateoftermination;
	}



	public boolean isIsadmin() {
		return isadmin;
	}



	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}



	public boolean isIsapprover() {
		return isapprover;
	}



	public void setIsapprover(boolean isapprover) {
		this.isapprover = isapprover;
	}



	public OrganizationalDetails(String billingentity, String employeecode, String email, String status,
			String designation, int costcode, String grade, String department, String location, Date dateofjoining,
			Date dateoftermination, boolean isadmin, boolean isapprover) {
		super();
		this.billingentity = billingentity;
		this.employeecode = employeecode;
		this.email = email;
		this.status = status;
		this.designation = designation;
		this.costcode = costcode;
		this.grade = grade;
		this.department = department;
		Location = location;
		this.dateofjoining = dateofjoining;
		this.dateoftermination = dateoftermination;
		this.isadmin = isadmin;
		this.isapprover = isapprover;
	}



	public String getBillingentity() {
		return billingentity;
	}

	public void setBillingentity(String billingentity) {
		this.billingentity = billingentity;
	}

	public String getEmployeecode() {
		return employeecode;
	}

	public void setEmployeecode(String employeecode) {
		this.employeecode = employeecode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
