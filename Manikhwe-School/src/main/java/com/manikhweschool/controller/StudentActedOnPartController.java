package com.manikhweschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.manikhweschool.model.StudentActedOnPart;
import com.manikhweschool.service.StudentActedOnPartService;

@Controller
public class StudentActedOnPartController {

	@Autowired
	private StudentActedOnPartService service;
	
	public List<StudentActedOnPart> findByTimeSpentInSecondsGreaterThan(int timeSpentInSeconds){return (List<StudentActedOnPart>) service.findByTimeSpentInSecondsGreaterThan(timeSpentInSeconds);}
	public List<StudentActedOnPart> findByTimeSpentInSecondsLessThan(int timeSpentInSeconds){return (List<StudentActedOnPart>) service.findByTimeSpentInSecondsLessThan(timeSpentInSeconds);}
	
	public List<StudentActedOnPart> findAll(){
		return service.findAll();
	}	
	public void save(StudentActedOnPart studentActedOnPart) {
		
		service.save(studentActedOnPart);
	}
}
