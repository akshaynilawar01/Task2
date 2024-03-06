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

import com.example.demo.model.FrequentFilters;

import com.example.demo.service.FrequentFilterService;


@RestController
@RequestMapping("/frequentfilter")
public class FrequentFilterController {

	

    @Autowired
	
	private FrequentFilterService frequentFilterService;
	
	@GetMapping("/getallff")
	public List<FrequentFilters> getAllHotelLoyalty()
	{
		return frequentFilterService.getAllFrequentFilters();
	}
	
	@PostMapping("/addff")
	public FrequentFilters addFrequentFilters(@RequestBody FrequentFilters frequentFilters)
	{
		return frequentFilterService.addFrequentFilters(frequentFilters);
	}
	
	@PutMapping("/editff/{id}")
	public FrequentFilters updatFrequentFilters(@RequestBody FrequentFilters frequentFilters, @PathVariable int id)
	{
		return frequentFilterService.updatFrequentFilters(frequentFilters, id);
	}
	
	@DeleteMapping("/deleteff/{id}")
	public void deleteFrequentFilters(@PathVariable int id)
	{
		frequentFilterService.deleteFrequentFilters(id);
	}
}
