package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CardDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CARD_ID")
	private int cardid;
	
	@Column(name="CARD_TYPE")
	private String cardtype;
	
	@Column(name="BANK_NAME")
	private String bankname;
	
	@Column(name="CARD_NUMBER")
	private long cardnumber;
	
	@Column(name="NAME")
	private String nameoncard;
	
	@Column(name="EXPIRY_DATE")
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
