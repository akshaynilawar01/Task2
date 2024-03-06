package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DocumentInfo;

public interface DocumentInfoRepo extends JpaRepository<DocumentInfo, Integer>{
	
	

}
