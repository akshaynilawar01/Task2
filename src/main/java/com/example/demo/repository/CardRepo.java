package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CardDetails;

public interface CardRepo extends JpaRepository<CardDetails, Integer> {

}
