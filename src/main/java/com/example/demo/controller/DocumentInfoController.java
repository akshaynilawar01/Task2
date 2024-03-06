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

import com.example.demo.model.DocumentInfo;
import com.example.demo.service.DocumentInfoService;

@RestController
@RequestMapping("/document")
public class DocumentInfoController {

	@Autowired
	private DocumentInfoService documentInfoService;
	
	@GetMapping("/getalldoc")
	public List<DocumentInfo> getAllDoC()
	{
		return documentInfoService.getAllDoc();
	}
	
	@PostMapping("/adddoc/{passid}/{visaid}")
	public DocumentInfo addDoc(@RequestBody DocumentInfo documentInfo, @PathVariable int passid, @PathVariable int visaid)
	{
		return documentInfoService.addDocument(documentInfo, passid, visaid);
	}
	
	
	@DeleteMapping("/deletedoc/{id}")
	public void deleteDoc(@PathVariable int id)
	{
		documentInfoService.deleteDoc(id);
	}
	
	
}
