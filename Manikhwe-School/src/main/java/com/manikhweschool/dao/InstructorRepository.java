package com.manikhweschool.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikhweschool.model.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor,String>{
	
	public List<Instructor> findByInstructorFirstName(String firstName);
	public List<Instructor> findByInstructorLastName(String lastName);
	public List<Instructor> findByInstructorGender(String gender);
	
	
	public List<Instructor> findByJoiningDate(Date joinedDate);
	public List<Instructor> findByJoiningDateGreaterThan(Date joinedDate);
	public List<Instructor> findByJoiningDateLessThan(Date joinedDate);

}
