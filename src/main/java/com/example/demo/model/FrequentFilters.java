package com.example.demo.model;



import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class FrequentFilters {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ffid;
	
	private String program;
	
	private long membershipnumber;
	
	private boolean ispreferred;
	
	private Date dateofexpiry;

	public FrequentFilters() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FrequentFilters(int ffid, String program, long membershipnumber, boolean ispreferred, Date dateofexpiry) {
		super();
		this.ffid = ffid;
		this.program = program;
		this.membershipnumber = membershipnumber;
		this.ispreferred = ispreferred;
		this.dateofexpiry = dateofexpiry;
	}

	public int getFfid() {
		return ffid;
	}

	public void setFfid(int ffid) {
		this.ffid = ffid;
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
