package com.manikhweschool.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikhweschool.model.StudentSharedExercise;

@Repository
public interface StudentSharedExerciseRepository extends JpaRepository<StudentSharedExercise,Integer>{
	
	public List<StudentSharedExercise> findByFinishedWatching(String title);
	public List<StudentSharedExercise> findByVideoExerciseNumberOfSharing(int videoExerciseNumberOfSharing);
	public List<StudentSharedExercise> findByVideoExerciseNumberOfSharingGreaterThan(int videoExerciseNumberOfSharing);
	public List<StudentSharedExercise> findByVideoExerciseNumberOfSharingLessThan(int videoExerciseNumberOfSharing);
}
