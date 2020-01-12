package com.manikhweschool.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikhweschool.model.StudentActedOnChapter;

@Repository
public interface StudentActedOnChapterRepository extends JpaRepository<StudentActedOnChapter,Integer>{

	public List<StudentActedOnChapter> findByTimeSpentInSeconds(int timeSpentInSeconds);
	public List<StudentActedOnChapter> findByTimeSpentInSecondsGreaterThan(int timeSpentInSeconds);
	public List<StudentActedOnChapter> findByTimeSpentInSecondsLessThan(int timeSpentInSeconds);
}
