package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CarLoyalty;
import com.example.demo.model.FLmembers;
import com.example.demo.model.FrequentFilters;
import com.example.demo.model.HotelLoyalty;
import com.example.demo.repository.CarLoyaltyRepo;
import com.example.demo.repository.FLmemberRepo;
import com.example.demo.repository.FrequentFiltersRepo;
import com.example.demo.repository.HotelLoyaltyRepo;


@Service
public class FLmembersService {

	
   @Autowired
	
	private FLmemberRepo fLmemberRepo;
   
   @Autowired
	
  	private CarLoyaltyRepo carLoyaltyRepo;
   
   @Autowired
	
 	private HotelLoyaltyRepo hotelLoyaltyRepo;
	
   @Autowired
	
	private FrequentFiltersRepo frequentFiltersRepo;
	
	public List<FLmembers> getAllFLmembers()
	{
		return fLmemberRepo.findAll();
	}
	
	public FLmembers addFLmembers(FLmembers fLmembers, int cid, int hid, int ffid)
	{
		CarLoyalty car = carLoyaltyRepo.findById(cid).get();
		fLmembers.setCarLoyalty(car);
		HotelLoyalty hotel = hotelLoyaltyRepo.findById(hid).get();
		fLmembers.setHoteLoyalty(hotel);
		FrequentFilters filters = frequentFiltersRepo.findById(ffid).get();
		fLmembers.setFrequentFilters(filters);
		return fLmemberRepo.save(fLmembers);
	}
	
	public void deleteFlmembers(int id)
	{
		fLmemberRepo.deleteById(id);
	}
}
