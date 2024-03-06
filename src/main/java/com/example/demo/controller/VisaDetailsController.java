package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.VisaDetails;
import com.example.demo.service.VisaDetailsService;
@RestController
@RequestMapping("/visa")
public class VisaDetailsController {

	@Autowired
	private VisaDetailsService visaDetailsService;
	
	@GetMapping("/getallvisa")
	public List<VisaDetails> getAllVisa()
	{
		return visaDetailsService.getAllVisa();
	}
	
	@PostMapping("/addvisa")
	public VisaDetails addVisa(@RequestBody VisaDetails visaDetails)
	{
		return visaDetailsService.addVisa(visaDetails); 
	}
	
	@DeleteMapping("/deletevisa/{id}")
	public void deleteVisa(@PathVariable int id)
	{
		visaDetailsService.deleteVisa(id);
	}
	
}
