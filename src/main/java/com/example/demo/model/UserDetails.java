package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

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
	
    public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	@Column(name="STATUS")
	private String status;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="contactid")
    private ContactDetails contactDetails;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="orgid")
    private OrganizationalDetails organizationalDetails;
    
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="personalid")
    private PersonalInformation personalInformation;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cardid")
    private CardDetails cardDetails;

    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="docid")
    private DocumentInfo documentInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="flid")
    private FLmembers flmembers;



	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CardDetails getCardDetails() {
		return cardDetails;
	}

	public DocumentInfo getDocumentInfo() {
		return documentInfo;
	}

	public void setDocumentInfo(DocumentInfo documentInfo) {
		this.documentInfo = documentInfo;
	}

	public FLmembers getFlmembers() {
		return flmembers;
	}

	public void setFlmembers(FLmembers flmembers) {
		this.flmembers = flmembers;
	}

	public void setCardDetails(CardDetails cardDetails) {
		this.cardDetails = cardDetails;
	}

	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(PersonalInformation personalInformation) {
		this.personalInformation = personalInformation;
	}

	public OrganizationalDetails getOrganizationalDetails() {
		return organizationalDetails;
	}

	public void setOrganizationalDetails(OrganizationalDetails organizationalDetails) {
		this.organizationalDetails = organizationalDetails;
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
