package com.manikhweschool.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.InstructorRepository;
import com.manikhweschool.model.Instructor;

@Service
public class InstructorService {

	@Autowired
	private InstructorRepository repository;
	
	public InstructorService(){
		
	}
	
	public List<Instructor> findByInstructorFirstName(String firstName){ return repository.findByInstructorFirstName(firstName);}
	public List<Instructor> findByInstructorLastName(String lastName){ return repository.findByInstructorLastName(lastName);}
	public List<Instructor> findByInstructorGender(String gender){ return repository.findByInstructorGender(gender);}
	
	public List<Instructor> findByJoiningDate(Date joinedDate){ return repository.findByJoiningDate(joinedDate);}
	public List<Instructor> findByJoiningDateGreaterThan(Date joinedDate){ return repository.findByJoiningDateGreaterThan(joinedDate);}
	public List<Instructor> findByJoiningDateLessThan(Date joinedDate){ return repository.findByJoiningDateLessThan(joinedDate);}

	public void deleteInstructor(String mobileNumber) {
		
		repository.deleteById(mobileNumber);
	}
	
	public List<Instructor> findAllInstructors(){
		
		return repository.findAll();
	}
	
	public Optional<Instructor> findInstructor(String mobileNumber) {
		
		return repository.findById(mobileNumber);
	}
	
	public void addInstructor(Instructor instructor) {
		
		repository.save(instructor);
	}
}
