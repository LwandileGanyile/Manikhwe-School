package com.manikhweschool.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manikhweschool.model.Instructor;
import com.manikhweschool.service.InstructorService;

@Controller
public class InstructorController {

	@Autowired
	private InstructorService service;
	
	@RequestMapping("/instructor/login")
	public String visitLoginPage() {
						
		return "Instructor_Login";
	}
					
	@RequestMapping("/instructor/signin")
	public String visitSignInPage() {
						
		return "Instructor_SignIn";
	}
	
	@RequestMapping("addInstructor")
	public String addInstructor(Instructor instructor) {
		
		service.addInstructor(instructor);
		return "Instructor_Welcome_Page";
	}
	
	@RequestMapping("findInstructor")
	public Optional<Instructor> findInstructor(@RequestParam("id") String mobileNumber) {

		Optional<Instructor> instructor = service.findInstructor(mobileNumber);
		return instructor;
	}
	
	@RequestMapping("showBook")
	public ModelAndView showBook(@RequestParam("id") String mobileNumber) {

		// Show_Instructor is a page name that display Instuctor's information.
		ModelAndView modelView = new ModelAndView();
		
		Optional<Instructor> instructor = service.findInstructor(mobileNumber);
		
		// Works like sessions
		modelView.addObject("instructor", instructor);
		modelView.setViewName("Show_Instructor");
		
		return modelView;
	}
	
	public void deleteInstructor(String mobileNumber) {
		
		service.deleteInstructor(mobileNumber);
	}
	
	public List<Instructor> findAllInstructors(){
		
		return service.findAllInstructors();
	}
	
	public List<Instructor> findByInstructorLastName(String lastName){ return service.findByInstructorLastName(lastName);}
	public List<Instructor> findByInstructorGender(String gender){ return service.findByInstructorGender(gender);}
	
}
