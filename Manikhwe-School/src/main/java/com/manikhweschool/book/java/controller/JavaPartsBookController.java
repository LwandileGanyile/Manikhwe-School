package com.manikhweschool.book.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.manikhweschool.book.java.service.JavaPartsBookService;
import com.manikhweschool.model.PartsBook;

@Controller
public class JavaPartsBookController {

	@Autowired
	private JavaPartsBookService service;
	
	public void save(PartsBook partsBook) {service.save(partsBook);}
}
