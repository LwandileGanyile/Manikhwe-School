package com.manikhweschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.StudentSharedExerciseRepository;
import com.manikhweschool.model.StudentSharedExercise;

@Service
public class StudentSharedExerciseService {

	@Autowired
	private StudentSharedExerciseRepository repository;
	
	public List<StudentSharedExercise> findByVideoExerciseNumberOfSharing(int videoExerciseNumberOfSharing){ return repository.findByVideoExerciseNumberOfSharing(videoExerciseNumberOfSharing);}
	public List<StudentSharedExercise> findByVideoExerciseNumberOfSharingGreaterThan(int videoExerciseNumberOfSharing){ return repository.findByVideoExerciseNumberOfSharingGreaterThan(videoExerciseNumberOfSharing);}
	public List<StudentSharedExercise> findByVideoExerciseNumberOfSharingLessThan(int videoExerciseNumberOfSharing){ return repository.findByVideoExerciseNumberOfSharingLessThan(videoExerciseNumberOfSharing);}
	
	public void save(StudentSharedExercise studentSharedExercise) {repository.save(studentSharedExercise);}
}
