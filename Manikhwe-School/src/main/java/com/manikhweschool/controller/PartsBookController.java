package com.manikhweschool.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manikhweschool.model.PartsBook;
import com.manikhweschool.service.PartsBookService;

@Controller
public class PartsBookController {

	@Autowired
	private PartsBookService service;
	
	/* You can pass a list of parameters from a 
	client side and process them as an object 
	from a sever side.*/
	@RequestMapping("/addBook")
	public void addPartsBook(PartsBook book) {
		
		service.addPartsBook(book);
	}
	
	@RequestMapping("findBook")
	public Optional<PartsBook> findPartsBook(@RequestParam("id") String isbn) {
		
		return service.findPartsBook(isbn);
	}
	
	@RequestMapping("showPartsBook")
	public ModelAndView showPartsBook(@RequestParam("id") String isbn) {

		// Show_Book is a page name that display Book's information.
		ModelAndView modelView = new ModelAndView("Show_Parts_Book");
		
		Optional<PartsBook> partsBook = service.findPartsBook(isbn);
		
		modelView.addObject("partsBook", partsBook);
		
		return modelView;
	}
	
	public List<PartsBook> findAllPartsBooks() {
		
		return service.findAllPartsBooks();
	}
	
	public void deletePartsBook(String isbn) {
		
		service.deletePartsBook(isbn);
	}
}
