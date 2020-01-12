package com.manikhweschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.StudentActedOnChapterRepository;
import com.manikhweschool.model.StudentActedOnChapter;

@Service
public class StudentActedOnChapterService {

	@Autowired
	private StudentActedOnChapterRepository repository;
	
	public List<StudentActedOnChapter> findByTimeSpentInSecondsGreaterThan(int timeSpentInSeconds){return (List<StudentActedOnChapter>) repository.findByTimeSpentInSecondsGreaterThan(timeSpentInSeconds);}
	public List<StudentActedOnChapter> findByTimeSpentInSecondsLessThan(int timeSpentInSeconds){return (List<StudentActedOnChapter>) repository.findByTimeSpentInSecondsLessThan(timeSpentInSeconds);}
	
	public void save(StudentActedOnChapter studentActedOnChapter) {
		repository.save(studentActedOnChapter);
	}
	
}
