package com.manikhweschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.manikhweschool.model.Part;
import com.manikhweschool.service.PartService;

@Controller
public class PartController {

	@Autowired
	private PartService partService;
	
	public Part save(Part part) {return partService.save(part);}	
	public void saveAll(List<Part> parts) {partService.saveAll(parts);}
	
	public List<Part> findByPartGreaterThan(byte partNumber){ return partService.findByPartNumberGreaterThan(partNumber);}
	public List<Part> findByPartLessThan(byte partNumber){ return partService.findByPartNumberLessThan(partNumber);}
}
