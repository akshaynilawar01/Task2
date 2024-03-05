package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ContactDetails;

public interface ContactRepo extends JpaRepository<ContactDetails, Integer>{

}
