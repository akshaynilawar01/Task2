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

import com.example.demo.model.OrganizationalDetails;
import com.example.demo.service.OrganizationalServices;

@RestController
@RequestMapping("/org")
public class OrgnizationalDetailsContoller {
	
	@Autowired
	private OrganizationalServices organizationalServices;

	@GetMapping("/getallorg")
	public List<OrganizationalDetails> getAllOrgDetails()
	{
		return organizationalServices.getAllOrgDetails();
	}
	
	@PostMapping("/addorgdetails")
	public OrganizationalDetails addOrgDetails(@RequestBody OrganizationalDetails organizationalDetails)
	{
		return organizationalServices.addOrgDetails(organizationalDetails);
	}
	
	@PutMapping("/editorgdetails{id}")
	public OrganizationalDetails updateOrgDetails(@RequestBody OrganizationalDetails organizationalDetails, @PathVariable int id)
	{
		return organizationalServices.updateOrgDetails(organizationalDetails, id);
	}
	@DeleteMapping("/deleteorgdetails/{id}")
	public void deleteOrgDetails(@PathVariable int id)
	{
		organizationalServices.deleteOrgDetails(id);
	}
}
