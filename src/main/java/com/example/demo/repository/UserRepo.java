package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserDetails;

public interface UserRepo extends JpaRepository<UserDetails, Integer>{

}
