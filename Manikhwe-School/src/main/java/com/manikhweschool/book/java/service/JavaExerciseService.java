package com.manikhweschool.book.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.ExerciseRepository;
import com.manikhweschool.model.Exercise;

@Service
public class JavaExerciseService{

	@Autowired
	private ExerciseRepository repository;
	
	public JavaExerciseService() {
		
	}
	
	public List<Exercise> findByExerciseNumberGreaterThan(String exerciseNumber){ return repository.findByExerciseNumberGreaterThan(exerciseNumber);}
	public List<Exercise> findByExerciseNumberLessThan(String exerciseNumber){return repository.findByExerciseNumberLessThan(exerciseNumber);}
	
	
	public Optional<Exercise> findById(String exerciseNumber){
		
		return repository.findById(exerciseNumber);
	}
	
	public Exercise save(Exercise exercise) { return repository.save(exercise);}
	
	public void saveAll(List<Exercise> exercises) {
		
		repository.saveAll(exercises);
	}
	
	public List<Exercise> findAll(){ return repository.findAll();}
}
