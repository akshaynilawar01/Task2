package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.FrequentFilters;

import com.example.demo.repository.FrequentFiltersRepo;
@Service
public class FrequentFilterService {

	@Autowired
     private FrequentFiltersRepo frequentFiltersRepo;
	
	public List<FrequentFilters> getAllFrequentFilters()
	{
		return frequentFiltersRepo.findAll();
	}
	
	public FrequentFilters addFrequentFilters(FrequentFilters frequentFilters)
	{
		return frequentFiltersRepo.save(frequentFilters);
	}
	
	public FrequentFilters updatFrequentFilters(FrequentFilters frequentFilters, int id)
	{
		FrequentFilters filters = frequentFiltersRepo.findById(id).get();
			
			if (Objects.nonNull(frequentFilters.getProgram())
		            && !"".equalsIgnoreCase(
		            		frequentFilters.getProgram())) {
				filters.setProgram(
						frequentFilters.getProgram());
		        }
		 
		       return frequentFiltersRepo.save(filters);
	}
	
	public void deleteFrequentFilters(int id)
	{
		frequentFiltersRepo.deleteById(id);
	}

}
