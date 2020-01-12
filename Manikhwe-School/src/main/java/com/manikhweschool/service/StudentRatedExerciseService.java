package com.manikhweschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.StudentRatedExerciseRepository;
import com.manikhweschool.model.StudentRatedExercise;

@Service
public class StudentRatedExerciseService {

	@Autowired
	private StudentRatedExerciseRepository repository;
	
	public List<StudentRatedExercise> findByVideoExerciseLiked(boolean videoExerciseLiked){ return repository.findByVideoExerciseLiked(videoExerciseLiked);}

	public void save(StudentRatedExercise studentRatedExercise) {repository.save(studentRatedExercise);}
}
