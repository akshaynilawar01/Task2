package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CarLoyalty;

public interface CarLoyaltyRepo extends JpaRepository<CarLoyalty, Integer> {

}
