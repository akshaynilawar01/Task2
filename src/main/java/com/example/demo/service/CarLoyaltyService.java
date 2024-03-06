package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CarLoyalty;

import com.example.demo.repository.CarLoyaltyRepo;

@Service
public class CarLoyaltyService {

	@Autowired
	
	private CarLoyaltyRepo carLoyaltyRepo;
	
	public List<CarLoyalty> getAllCarLoyalty()
	{
		return carLoyaltyRepo.findAll();
	}
	
	public CarLoyalty addCarLoyalty(CarLoyalty carLoyalty)
	{
		return carLoyaltyRepo.save(carLoyalty);
	}
	
	public CarLoyalty updatCarLoyalty(CarLoyalty carLoyalty, int id)
	{
		CarLoyalty car = carLoyaltyRepo.findById(id).get();
			
			if (Objects.nonNull(carLoyalty.getProgram())
		            && !"".equalsIgnoreCase(
		            		carLoyalty.getProgram())) {
				car.setProgram(
						carLoyalty.getProgram());
		        }
		 
		       return carLoyaltyRepo.save(car);
	}
	
	public void deleteCarLoyalty(int id)
	{
		carLoyaltyRepo.deleteById(id);
	}
}
