package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class FLmembers {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ffid")
	private FrequentFilters frequentFilters;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hlid")
	private HotelLoyalty hoteLoyalty;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="clid")
	private CarLoyalty carLoyalty;

	public FLmembers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FLmembers(int flid, FrequentFilters frequentFilters, HotelLoyalty hoteLoyalty, CarLoyalty carLoyalty) {
		super();
		this.flid = flid;
		this.frequentFilters = frequentFilters;
		this.hoteLoyalty = hoteLoyalty;
		this.carLoyalty = carLoyalty;
	}

	public int getFlid() {
		return flid;
	}

	public void setFlid(int flid) {
		this.flid = flid;
	}

	public FrequentFilters getFrequentFilters() {
		return frequentFilters;
	}

	public void setFrequentFilters(FrequentFilters frequentFilters) {
		this.frequentFilters = frequentFilters;
	}

	public HotelLoyalty getHoteLoyalty() {
		return hoteLoyalty;
	}

	public void setHoteLoyalty(HotelLoyalty hoteLoyalty) {
		this.hoteLoyalty = hoteLoyalty;
	}

	public CarLoyalty getCarLoyalty() {
		return carLoyalty;
	}

	public void setCarLoyalty(CarLoyalty carLoyalty) {
		this.carLoyalty = carLoyalty;
	}
	
	
	
	
}
