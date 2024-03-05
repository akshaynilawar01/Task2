package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.PersonalInformation;
import com.example.demo.repository.PersonalInformationRepo;

@Service
public class PersonalInformationService {

	@Autowired
	private PersonalInformationRepo personalInformationRepo;
	
	
	public List<PersonalInformation> getAllPersonalInfo()
	{
		return personalInformationRepo.findAll();
	}
	
	public PersonalInformation addPersonalInfo(PersonalInformation personalInformation)
	{
		return personalInformationRepo.save(personalInformation);
	}
	
	public void deletePersonalInfo(int id)
	{
		personalInformationRepo.deleteById(id);
	}
	
	public PersonalInformation updatePersonalInfo(PersonalInformation personalInformation, int id)
	{
		PersonalInformation personal = personalInformationRepo.findById(id).get();
			
			if (Objects.nonNull(personalInformation.getNationality())
		            && !"".equalsIgnoreCase(
		            		personalInformation.getNationality())) {
				personal.setNationality(
						personalInformation.getNationality());
		        }
		 
		        if (Objects.nonNull(
		        		personalInformation.getProgfiletype())
		            && !"".equalsIgnoreCase(
		            		personalInformation.getProgfiletype())) {
		        	personal.setProgfiletype(
		        			personalInformation.getProgfiletype());
		        }
		        
		        return personalInformationRepo.save(personalInformation);
	}
}
