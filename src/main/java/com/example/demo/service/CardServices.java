package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CardDetails;

import com.example.demo.repository.CardRepo;

@Service
public class CardServices {

	@Autowired
	
	private CardRepo cardRepo;
	
	public List<CardDetails> getAllCardDetails()
	{
		return cardRepo.findAll();
	}
	
	public CardDetails addCardDetails(CardDetails cardDetails)
	{
		return cardRepo.save(cardDetails);
	}
	
	public CardDetails updateCardDetails(CardDetails cardDetails, int id)
	{
		CardDetails card = cardRepo.findById(id).get();
			
			if (Objects.nonNull(cardDetails.getBankname())
		            && !"".equalsIgnoreCase(
		            		cardDetails.getBankname())) {
				card.setBankname(
						cardDetails.getBankname());
		        }
		 
		        if (Objects.nonNull(
		        		cardDetails.getCardtype())
		            && !"".equalsIgnoreCase(
		            		cardDetails.getCardtype())) {
		        	card.setCardtype(
		        			cardDetails.getCardtype());
		        }
		return cardRepo.save(cardDetails);
	}
	
	public void deleteCardDetails(int id)
	{
		cardRepo.deleteById(id);
	}
}
