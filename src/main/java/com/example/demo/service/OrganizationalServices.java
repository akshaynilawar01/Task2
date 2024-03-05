package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.OrganizationalDetails;

import com.example.demo.repository.OrganizationalRepo;

@Service
public class OrganizationalServices {

	@Autowired
	
	private OrganizationalRepo organizationalRepo;
	
	public List<OrganizationalDetails> getAllOrgDetails()
	{
		return organizationalRepo.findAll();
	}
	
	public OrganizationalDetails addOrgDetails(OrganizationalDetails organizationalDetails)
	{
		
		return organizationalRepo.save(organizationalDetails);
	}
	
	public void deleteOrgDetails(int id)
	{
		organizationalRepo.deleteById(id);
	}
	
	public OrganizationalDetails updateOrgDetails(OrganizationalDetails organizationalDetails, int id)
	{

		OrganizationalDetails org = organizationalRepo.findById(id).get();
			
			if (Objects.nonNull(organizationalDetails.getBillingentity())
		            && !"".equalsIgnoreCase(
		            		organizationalDetails.getBillingentity())) {
				org.setDepartment(
						organizationalDetails.getBillingentity());
		        }
		 
		        if (Objects.nonNull(
		        		organizationalDetails.getDepartment())
		            && !"".equalsIgnoreCase(
		            		organizationalDetails.getDepartment())) {
		        	org.setDepartment(
		        			organizationalDetails.getDepartment());
		        }
		return organizationalRepo.save(organizationalDetails);
	}
	

}
