package com.manikhweschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.manikhweschool.model.StudentActedOnChapter;
import com.manikhweschool.service.StudentActedOnChapterService;

@Controller
public class StudentActedOnChapterController {

	@Autowired
	private StudentActedOnChapterService service;
	
	public List<StudentActedOnChapter> findByTimeSpentInSecondsGreaterThan(int timeSpentInSeconds){return (List<StudentActedOnChapter>) service.findByTimeSpentInSecondsGreaterThan(timeSpentInSeconds);}
	public List<StudentActedOnChapter> findByTimeSpentInSecondsLessThan(int timeSpentInSeconds){return (List<StudentActedOnChapter>) service.findByTimeSpentInSecondsLessThan(timeSpentInSeconds);}
	
	public void save(StudentActedOnChapter studentActedOnChapter) {
		service.save(studentActedOnChapter);
	}
}
