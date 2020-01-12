package com.manikhweschool.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikhweschool.model.Exercise;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, String>{

	public List<Exercise> findByExerciseNumberGreaterThan(String exerciseNumber);
	public List<Exercise> findByExerciseNumberLessThan(String exerciseNumber);
	
}
