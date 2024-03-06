package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.HotelLoyalty;

import com.example.demo.repository.HotelLoyaltyRepo;
@Service
public class HotelLoyaltyService {

	

	@Autowired
	
	private HotelLoyaltyRepo hotelLoyaltyRepo;
	
	public List<HotelLoyalty> getAllHotelLoyalty()
	{
		return hotelLoyaltyRepo.findAll();
	}
	
	public HotelLoyalty addHotelLoyalty(HotelLoyalty hotelLoyalty)
	{
		return hotelLoyaltyRepo.save(hotelLoyalty);
	}
	
	public HotelLoyalty updatHotelLoyalty(HotelLoyalty hotelLoyalty, int id)
	{
		HotelLoyalty hotel = hotelLoyaltyRepo.findById(id).get();
			
			if (Objects.nonNull(hotelLoyalty.getProgram())
		            && !"".equalsIgnoreCase(
		            		hotelLoyalty.getProgram())) {
				hotel.setProgram(
						hotelLoyalty.getProgram());
		        }
		 
		       return hotelLoyaltyRepo.save(hotel);
	}
	
	public void deleteHotelLoyalty(int id)
	{
		hotelLoyaltyRepo.deleteById(id);
	}
}
