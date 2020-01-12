package com.manikhweschool.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikhweschool.model.StudentActedOnPart;

@Repository
public interface StudentActedOnPartRepository extends JpaRepository<StudentActedOnPart,Integer>{

	public List<StudentActedOnPart> findByTimeSpentInSeconds(int timeSpentInSeconds);
	public List<StudentActedOnPart> findByTimeSpentInSecondsGreaterThan(int timeSpentInSeconds);
	public List<StudentActedOnPart> findByTimeSpentInSecondsLessThan(int timeSpentInSeconds);

}
