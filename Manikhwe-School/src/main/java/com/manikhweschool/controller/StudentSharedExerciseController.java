package com.manikhweschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.manikhweschool.model.StudentSharedExercise;
import com.manikhweschool.service.StudentSharedExerciseService;

@Controller
public class StudentSharedExerciseController {

	@Autowired
	private StudentSharedExerciseService service;
	
	public List<StudentSharedExercise> findByVideoExerciseNumberOfSharing(int videoExerciseNumberOfSharing){ return service.findByVideoExerciseNumberOfSharing(videoExerciseNumberOfSharing);}
	public List<StudentSharedExercise> findByVideoExerciseNumberOfSharingGreaterThan(int videoExerciseNumberOfSharing){ return service.findByVideoExerciseNumberOfSharingGreaterThan(videoExerciseNumberOfSharing);}
	public List<StudentSharedExercise> findByVideoExerciseNumberOfSharingLessThan(int videoExerciseNumberOfSharing){ return service.findByVideoExerciseNumberOfSharingLessThan(videoExerciseNumberOfSharing);}
	
	public void save(StudentSharedExercise studentSharedExercise) {service.save(studentSharedExercise);}
}
