package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CardDetails;
import com.example.demo.service.CardServices;

@RestController
@RequestMapping("/card")
public class CardDetailsController {

	@Autowired
	
	private CardServices cardServices;
	
	@GetMapping("/getallcards")
	public List<CardDetails> getAllCardDetails()
	{
		return cardServices.getAllCardDetails();
	}
	
	@PostMapping("/addcarddetails")
	public CardDetails addCardDetails(@RequestBody CardDetails cardDetails)
	{
		return cardServices.addCardDetails(cardDetails);
	}
	
	@PutMapping("/editcarddetails")
	public CardDetails updateCardDetail(@RequestBody CardDetails cardDetails, @PathVariable int id)
	{
		return cardServices.addCardDetails(cardDetails);
	}
	
	@DeleteMapping("/deletecarddetails")
	public void deleteCardDeatils(@PathVariable int id)
	{
		cardServices.deleteCardDetails(id);
	}
}
