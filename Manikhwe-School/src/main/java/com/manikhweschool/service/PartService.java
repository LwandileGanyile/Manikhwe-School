package com.manikhweschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.PartRepository;
import com.manikhweschool.model.Part;

@Service
public class PartService {

	@Autowired
	private PartRepository repository;
	
	public Part save(Part part) {return repository.save(part);}	
	public void saveAll(List<Part> parts) {repository.saveAll(parts);}
	
	public List<Part> findByPartNumberGreaterThan(byte partNumber){ return repository.findByPartNumberGreaterThan(partNumber);}
	public List<Part> findByPartNumberLessThan(byte partNumber){ return repository.findByPartNumberLessThan(partNumber);}

}
