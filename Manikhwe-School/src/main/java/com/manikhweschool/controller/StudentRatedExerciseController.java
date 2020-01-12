package com.manikhweschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.manikhweschool.model.StudentRatedExercise;
import com.manikhweschool.service.StudentRatedExerciseService;

@Controller
public class StudentRatedExerciseController {

	@Autowired
	private StudentRatedExerciseService service;
	
	public List<StudentRatedExercise> findByVideoExerciseLiked(boolean videoExerciseLiked){ return service.findByVideoExerciseLiked(videoExerciseLiked);}

	public void save(StudentRatedExercise studentRatedExercise) {service.save(studentRatedExercise);}
}
