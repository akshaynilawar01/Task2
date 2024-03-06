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

import com.example.demo.model.FLmembers;
import com.example.demo.model.FrequentFilters;
import com.example.demo.service.FLmembersService;

@RestController
@RequestMapping("/flmembers")
public class FLmemberController {

	 @Autowired
		
		private FLmembersService fLmembersService;
		
		@GetMapping("/getallflm")
		public List<FLmembers> getAllFLmembers()
		{
			return fLmembersService.getAllFLmembers();
		}
		
		@PostMapping("/addflm/{cid}/{hid}/{ffid}")
		public FLmembers addFLmembers(@RequestBody FLmembers fLmembers, @PathVariable int cid, @PathVariable int hid, @PathVariable int ffid)
		{
			return fLmembersService.addFLmembers(fLmembers, cid, hid, ffid);
		}
		
	
		
		@DeleteMapping("/deleteflm/{id}")
		public void deleteFlmembers(@PathVariable int id)
		{
			fLmembersService.deleteFlmembers(id);
		}
}
