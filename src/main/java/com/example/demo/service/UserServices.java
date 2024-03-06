package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CardDetails;
import com.example.demo.model.ContactDetails;
import com.example.demo.model.DocumentInfo;
import com.example.demo.model.FLmembers;
import com.example.demo.model.OrganizationalDetails;
import com.example.demo.model.PersonalInformation;
import com.example.demo.model.UserDetails;
import com.example.demo.repository.CardRepo;
import com.example.demo.repository.ContactRepo;
import com.example.demo.repository.DocumentInfoRepo;
import com.example.demo.repository.FLmemberRepo;
import com.example.demo.repository.OrganizationalRepo;
import com.example.demo.repository.PersonalInformationRepo;
import com.example.demo.repository.UserRepo;

@Service
public class UserServices {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ContactRepo contactRepo;
	
	
	@Autowired
	private OrganizationalRepo organizationalRepo;
	
	@Autowired
	private PersonalInformationRepo personalInformationRepo;
	
	
	@Autowired
	private DocumentInfoRepo documentInfoRepo;
	
	@Autowired
	private FLmemberRepo fLmemberRepo;
	
	@Autowired
	private CardRepo cardRepo;
	
	public List<UserDetails>getAllUsers()
	{
		return userRepo.findAll();
	}
	
	public UserDetails addUser(UserDetails userDetails, int contactid, int orgid, int personalid, int cardid, int docid,int flid)
	{   
		FLmembers fLmembers = fLmemberRepo.findById(flid).get();
		userDetails.setFlmembers(fLmembers);
		DocumentInfo document = documentInfoRepo.findById(docid).get();
		userDetails.setDocumentInfo(document);
		CardDetails card = cardRepo.findById(cardid).get();
		userDetails.setCardDetails(card);
		PersonalInformation personalInformation = personalInformationRepo.findById(personalid).get();
		userDetails.setPersonalInformation(personalInformation);
		OrganizationalDetails organizationalDetails = organizationalRepo.findById(orgid).get();
		userDetails.setOrganizationalDetails(organizationalDetails);
		ContactDetails contactDetails = contactRepo.findById(contactid).get();
		userDetails.setContactDetails(contactDetails);
		return userRepo.save(userDetails);
	}
	
	public void deleteUser(int id)
	{
		userRepo.deleteById(id);
	}
	
	public UserDetails updateUser(UserDetails userDetails, int id)
	{
       UserDetails user = userRepo.findById(id).get();
		
		if (Objects.nonNull(userDetails.getFirstname())
	            && !"".equalsIgnoreCase(
	            		userDetails.getFirstname())) {
			user.setFirstname(
					userDetails.getFirstname());
	        }
	 
	        if (Objects.nonNull(
	        		userDetails.getLastname())
	            && !"".equalsIgnoreCase(
	            		userDetails.getLastname())) {
	        	user.setLastname(
	        			userDetails.getLastname());
	        }
		return userRepo.save(user);
	}
}
