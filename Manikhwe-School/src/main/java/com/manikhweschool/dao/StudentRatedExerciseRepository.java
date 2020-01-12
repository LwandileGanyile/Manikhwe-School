package com.manikhweschool.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikhweschool.model.StudentRatedExercise;

@Repository
public interface StudentRatedExerciseRepository  extends JpaRepository<StudentRatedExercise,Integer>{

	public List<StudentRatedExercise> findByFinishedWatching(String title);
	public List<StudentRatedExercise> findByVideoExerciseLiked(boolean videoExerciseLiked);
}
