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

import com.example.demo.model.ContactDetails;
import com.example.demo.service.ContactServices;

@RestController
@RequestMapping("/contact")
public class ContactInformationController {

	@Autowired
	
	private ContactServices contactServices;
	
	@GetMapping("/getallcontact")
	public List<ContactDetails> getAllContact()
	{
		return contactServices.getAllContacts();
	}
	
	@PostMapping("/addcontact")
	public ContactDetails addContact(@RequestBody ContactDetails contactDetails)
	{
		return contactServices.addContact(contactDetails);
	}
	
	@DeleteMapping("/deletecontact")
	public void deleteContact(@PathVariable int id)
	{
		contactServices.deleteContact(id);
	}
	
	@PutMapping("/editcontact")
	public ContactDetails updateContact(@RequestBody ContactDetails contactDetails, @PathVariable int id)
	{
		return contactServices.updateContact(contactDetails, id);
	}
}
