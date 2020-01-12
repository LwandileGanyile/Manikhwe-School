package com.manikhweschool.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikhweschool.model.Chapter;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, String>{

	public List<Chapter> findByCompleted(String completed);
	
}
