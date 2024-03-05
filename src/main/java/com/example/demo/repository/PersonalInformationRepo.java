package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PersonalInformation;

public interface PersonalInformationRepo extends JpaRepository<PersonalInformation, Integer> {

}
