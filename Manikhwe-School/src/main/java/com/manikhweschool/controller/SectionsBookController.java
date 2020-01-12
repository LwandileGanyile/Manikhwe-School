package com.manikhweschool.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manikhweschool.model.SectionsBook;
import com.manikhweschool.service.SectionsBookService;

public class SectionsBookController {

	@Autowired
	private SectionsBookService service;
	
	/* You can pass a list of parameters from a 
	client side and process them as an object 
	from a sever side.*/
	@RequestMapping("/addBook")
	public void addSectionsBook(SectionsBook book) {
		
		service.addSectionsBook(book);
	}
	
	@RequestMapping("findBook")
	public Optional<SectionsBook> findSectionsBook(@RequestParam("id") String isbn) {
		
		return service.findSectionsBook(isbn);
	}
	
	@RequestMapping("showSectionsBook")
	public ModelAndView showSectionsBook(@RequestParam("id") String isbn) {

		// Show_Book is a page name that display Book's information.
		ModelAndView modelView = new ModelAndView("Show_Sections_Book");
		
		Optional<SectionsBook> sectionsBook = service.findSectionsBook(isbn);
		
		modelView.addObject("sectionsBook", sectionsBook);
		
		return modelView;
	}
	
	public List<SectionsBook> findAllSectionsBooks() {
		
		return service.findAllSectionsBook();
	}
	
	public void deleteSectionsBook(String isbn) {
		
		service.deleteSectionsBook(isbn);
	}
}
