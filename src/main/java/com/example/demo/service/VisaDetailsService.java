package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.VisaDetails;
import com.example.demo.repository.VisaDetailsRepo;
@Service
public class VisaDetailsService {

	@Autowired
	
	private VisaDetailsRepo visaDetailsRepo;
	
	public  List<VisaDetails> getAllVisa()
	{
		return visaDetailsRepo.findAll();
	}
	
	public VisaDetails addVisa(VisaDetails visaDetails)
	{
		return visaDetailsRepo.save(visaDetails);
	}
	
	public void deleteVisa(int id)
	{
		visaDetailsRepo.deleteById(id);
	}
}
