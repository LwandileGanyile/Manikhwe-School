package com.manikhweschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.StudentActedOnPartRepository;
import com.manikhweschool.model.StudentActedOnPart;

@Service
public class StudentActedOnPartService {

	@Autowired
	private StudentActedOnPartRepository repository;

	public List<StudentActedOnPart> findByTimeSpentInSecondsGreaterThan(int timeSpentInSeconds){return (List<StudentActedOnPart>) repository.findByTimeSpentInSecondsGreaterThan(timeSpentInSeconds);}
	public List<StudentActedOnPart> findByTimeSpentInSecondsLessThan(int timeSpentInSeconds){return (List<StudentActedOnPart>) repository.findByTimeSpentInSecondsLessThan(timeSpentInSeconds);}
	
	public void save(StudentActedOnPart studentActedOnPart) {
		repository.save(studentActedOnPart);
	}
	
	public List<StudentActedOnPart> findAll(){
		return repository.findAll();
	}
}
