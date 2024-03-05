package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CarLoyalty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clid;

    private String program;
	
	private long membershipnumber;
	
	private boolean ispreferred;
	
	private Date dateofexpiry;

	public CarLoyalty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarLoyalty(int clid, String program, long membershipnumber, boolean ispreferred, Date dateofexpiry) {
		super();
		this.clid = clid;
		this.program = program;
		this.membershipnumber = membershipnumber;
		this.ispreferred = ispreferred;
		this.dateofexpiry = dateofexpiry;
	}

	public int getClid() {
		return clid;
	}

	public void setClid(int clid) {
		this.clid = clid;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public long getMembershipnumber() {
		return membershipnumber;
	}

	public void setMembershipnumber(long membershipnumber) {
		this.membershipnumber = membershipnumber;
	}

	public boolean isIspreferred() {
		return ispreferred;
	}

	public void setIspreferred(boolean ispreferred) {
		this.ispreferred = ispreferred;
	}

	public Date getDateofexpiry() {
		return dateofexpiry;
	}

	public void setDateofexpiry(Date dateofexpiry) {
		this.dateofexpiry = dateofexpiry;
	}
	
}
