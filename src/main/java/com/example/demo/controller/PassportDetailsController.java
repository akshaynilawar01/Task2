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

import com.example.demo.model.PassportDetails;
import com.example.demo.service.PassportDetailsService;

@RestController
@RequestMapping("/passport")
public class PassportDetailsController {
	
	@Autowired
	
	private PassportDetailsService passportDetailsService;
	
	@GetMapping("/getallpassport")
	public List<PassportDetails> getAllPassport()
	{
		return passportDetailsService.getAllPassport();
	}
	
	@PostMapping("/addpassport")
	public PassportDetails addPassport(@RequestBody PassportDetails passportDetails)
	{
		return passportDetailsService.addPassport(passportDetails);
	}
	
	@DeleteMapping("/deletepassport/{id}")
	public void deletePassport(@PathVariable int id)
	{
		passportDetailsService.deletePassport(id);
	}

}
