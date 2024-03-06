package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DocumentInfo;
import com.example.demo.model.PassportDetails;
import com.example.demo.model.VisaDetails;
import com.example.demo.repository.DocumentInfoRepo;
import com.example.demo.repository.PassportDetailRepo;
import com.example.demo.repository.VisaDetailsRepo;

@Service
public class DocumentInfoService {

	@Autowired
	
	private DocumentInfoRepo documentInfoRepo;
	

	@Autowired
	
	private PassportDetailRepo passportDetailRepo;
	
	@Autowired
	
	private VisaDetailsRepo visaDetailsRepo;
	
	public List<DocumentInfo> getAllDoc()
	{
		return documentInfoRepo.findAll();
	}
	
	public DocumentInfo addDocument(DocumentInfo documentInfo, int passid, int visaid )
	{
		PassportDetails pass = passportDetailRepo.findById(passid).get();
		documentInfo.setPassportDetails(pass);

		VisaDetails visa = visaDetailsRepo.findById(visaid).get();
		documentInfo.setVisaDetails(visa);
		
		return documentInfoRepo.save(documentInfo);
	}
	
	public void deleteDoc(int id)
	{
		documentInfoRepo.deleteById(id);
	}
}
