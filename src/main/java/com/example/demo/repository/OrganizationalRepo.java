package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.OrganizationalDetails;

public interface OrganizationalRepo extends JpaRepository<OrganizationalDetails, Integer> {

	
}
