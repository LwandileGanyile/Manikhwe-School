package com.manikhweschool.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.manikhweschool.model.Student;
import com.manikhweschool.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private static StudentService service;
				
	@RequestMapping("/addStudent")
	public static void addStudent(Student newStudent) {
		
		service.addStudent(newStudent);
	}
	
	@RequestMapping("findStudent")
	public static Optional<Student> findStudent(@RequestParam("id") String email) {
		
		return service.findStudent(email);
	}
	
	public static void deleteStudent(String email) {
		
		service.deleteStudent(email);
	}
	
	public static List<Student> findAllStudents() {
		return service.findAllStudents();
	}
	
	public static List<Student> findByFirstName(String firstName){return service.findByFirstName(firstName);}
	public static List<Student> findByLastName(String lastName){ return service.findByLastName(lastName);}
	public static List<Student> findByGender(String gender){ return service.findByGender(gender);}
	
	public static List<Student> findByJoinedDate(Date joinedDate){return service.findByJoinedDate(joinedDate);}
	public static List<Student> findByJoinedDateGreaterThan(Date joinedDate){return service.findByJoinedDateGreaterThan(joinedDate);}
	public static List<Student> findByJoinedDateLessThan(Date joinedDate){ return service.findByJoinedDateLessThan(joinedDate);}

	public static boolean studentExist(Student student){
		
        return findStudent(student.getEmail()) != null;
    }
    
}
