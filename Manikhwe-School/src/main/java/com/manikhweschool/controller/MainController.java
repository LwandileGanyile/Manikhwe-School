package com.manikhweschool.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manikhweschool.model.Course;

@Controller
public class MainController {

	@RequestMapping("home")
	public String visitHomePage() {
		
		return "Pages/index.xhtml";
	}
	
	// The visitBackgroundPage method can work as a servlet's doGet or doPost method.
	@RequestMapping("background")
	public String visitBackgroundPage() {
			
		return "Background";
	}
	
	// The example given here is a bad one, it is for the demonstration purposes only.
	// The variable userName doesn't not have to match what was passed from a client in this case.
	@RequestMapping("contacts")
	public String visitContactsPage(@RequestParam("username") String userName, HttpSession session) {
			
		return "Contact_Info";
	}
		
	// The visitCoursesPage method can accept a session object.
	// The courseName variable has to match the variable name that was pass from a url.
	@RequestMapping("course")
	public String visitCoursesPage(Course course, HttpSession session) throws Exception {
				
		if(course == Course.Introduction_To_Java_Programming) {	
			session.setAttribute("course", "Introduction To Java Programming");
			return "Intro_To_Java";
		}
		throw new Exception("So far, introduction to java programming is the only course offered.");
	}
	
	@RequestMapping("about")
	public String visitAboutPage() {
				
		return "About";
	}
}
