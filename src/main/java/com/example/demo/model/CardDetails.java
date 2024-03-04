package com.example.demo.model;

import java.util.Date;

public class CardDetails {
	
	private String cardtype;
	
	private String bankname;
	
	private long cardnumber;
	
	private String nameoncard;
	
	private Date expirydate;

	public CardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CardDetails(String cardtype, String bankname, long cardnumber, String nameoncard, Date expirydate) {
		super();
		this.cardtype = cardtype;
		this.bankname = bankname;
		this.cardnumber = cardnumber;
		this.nameoncard = nameoncard;
		this.expirydate = expirydate;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public long getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getNameoncard() {
		return nameoncard;
	}

	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}

	public Date getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
	
	

}
