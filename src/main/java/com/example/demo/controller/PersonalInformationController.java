package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PersonalInformation;
import com.example.demo.service.PersonalInformationService;

@RestController
@RequestMapping("/personal")
public class PersonalInformationController {

	@Autowired
	
	private PersonalInformationService personalInformationService;
	
	@GetMapping("/getllpersonalinfo")
	public List<PersonalInformation> getAllPersonalInfo()
	{
		return personalInformationService.getAllPersonalInfo();
	}

	@PostMapping("/addpersonalinfo")
	public PersonalInformation addPersonalInfo(@RequestBody PersonalInformation personalInformation)
	{
		return personalInformationService.addPersonalInfo(personalInformation);
	}
	
	@PutMapping("/editpersonalinfo/{id}")
	public PersonalInformation updatePersonalInfo(@RequestBody PersonalInformation personalInformation, int id)
	{
		return personalInformationService.updatePersonalInfo(personalInformation, id);
	}
	
	@DeleteMapping("/deletepersonalinfo/{id}")
	public void deletePersonalInfo(int id)
	{
		personalInformationService.deletePersonalInfo(id);
	}
	
	
	}
