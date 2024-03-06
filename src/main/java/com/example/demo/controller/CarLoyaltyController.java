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

import com.example.demo.model.CarLoyalty;
import com.example.demo.service.CarLoyaltyService;

@RestController
@RequestMapping("/carloyalty")
public class CarLoyaltyController {

	@Autowired
	
	private CarLoyaltyService carLoyaltyService;
	
	@GetMapping("/getallcarloyalty")
	public List<CarLoyalty> getAllCarLoyalty()
	{
		return carLoyaltyService.getAllCarLoyalty();
	}
	
	@PostMapping("/addcarloyalty")
	public CarLoyalty addCarLoyalty(@RequestBody CarLoyalty carLoyalty)
	{
		return carLoyaltyService.addCarLoyalty(carLoyalty);
	}
	
	@PutMapping("/editcarloyalty/{id}")
	public CarLoyalty upadateCarLoyalty(@RequestBody CarLoyalty carLoyalty, @PathVariable int id)
	{
		return carLoyaltyService.updatCarLoyalty(carLoyalty, id);
	}
	
	@DeleteMapping("/deletecarloyalty/{id}")
	public void deleteCarLoyalty(@PathVariable int id)
	{
		carLoyaltyService.deleteCarLoyalty(id);
	}
}
