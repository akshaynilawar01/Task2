package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PassportDetails;
import com.example.demo.repository.PassportDetailRepo;

@Service
public class PassportDetailsService {
	
	@Autowired
	
	private PassportDetailRepo passportDetailRepo;
	
	public  List<PassportDetails> getAllPassport()
	{
		return passportDetailRepo.findAll();
	}
	
	public PassportDetails addPassport(PassportDetails passportDetails)
	{
		return passportDetailRepo.save(passportDetails);
	}
	
	public void deletePassport(int id)
	{
		passportDetailRepo.deleteById(id);
	}
	
	

}
