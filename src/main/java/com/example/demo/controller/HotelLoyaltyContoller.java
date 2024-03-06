package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.HotelLoyalty;


import com.example.demo.service.HotelLoyaltyService;
@RestController
@RequestMapping("/hotelloyalty")
public class HotelLoyaltyContoller {

	
    @Autowired
	
	private HotelLoyaltyService hotelLoyaltyService;
	
	@GetMapping("/getallhotelloyalty")
	public List<HotelLoyalty> getAllHotelLoyalty()
	{
		return hotelLoyaltyService.getAllHotelLoyalty();
	}
	
	@PostMapping("/addhotelloyalty")
	public HotelLoyalty addHotelLoyalty(@RequestBody HotelLoyalty hotelLoyalty)
	{
		return hotelLoyaltyService.addHotelLoyalty(hotelLoyalty);
	}
	
	@PutMapping("/edithotelloyalty/{id}")
	public HotelLoyalty updatHotelLoyalty(@RequestBody HotelLoyalty hotelLoyalty, @PathVariable int id)
	{
		return hotelLoyaltyService.updatHotelLoyalty(hotelLoyalty, id);
	}
	
	@DeleteMapping("/deletehotelloyalty/{id}")
	public void deleteCarLoyalty(@PathVariable int id)
	{
		hotelLoyaltyService.deleteHotelLoyalty(id);
	}
}
