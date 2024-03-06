package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.HotelLoyalty;

public interface HotelLoyaltyRepo extends JpaRepository<HotelLoyalty, Integer> {

	
}
