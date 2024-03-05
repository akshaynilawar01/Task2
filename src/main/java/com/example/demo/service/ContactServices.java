package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ContactDetails;

import com.example.demo.repository.ContactRepo;

@Service
public class ContactServices {

	@Autowired
	
	private ContactRepo contactRepo;
	
	
	public List<ContactDetails> getAllContacts()
	{
		return contactRepo.findAll();
	}
	
	public ContactDetails addContact(ContactDetails contactDetails)
	{
		return contactRepo.save(contactDetails);
	}
	
	public void  deleteContact(int id)
	{
		contactRepo.deleteById(id);
	}
	
	public ContactDetails updateContact(ContactDetails contactDetails, int id)
	{

	       ContactDetails contact = contactRepo.findById(id).get();
			
			if (Objects.nonNull(contactDetails.getCity())
		            && !"".equalsIgnoreCase(
		            		contactDetails.getCity())) {
				contact.setCity(
						contactDetails.getCity());
		        }
		 
		        if (Objects.nonNull(
		        		contactDetails.getCountry())
		            && !"".equalsIgnoreCase(
		            		contactDetails.getCountry())) {
		        	contact.setCountry(
		        			contactDetails.getCountry());
		        }
		        
		      return contactRepo.save(contact);
	}
}
