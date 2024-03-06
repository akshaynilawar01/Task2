package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FrequentFilters;

public interface FrequentFiltersRepo extends JpaRepository<FrequentFilters, Integer> {

}
