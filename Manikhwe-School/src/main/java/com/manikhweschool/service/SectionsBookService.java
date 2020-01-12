package com.manikhweschool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.SectionsBookRepository;
import com.manikhweschool.model.SectionsBook;

@Service
public class SectionsBookService {

	@Autowired
	private SectionsBookRepository repository;

	public SectionsBookRepository getRepository() {
		return repository;
	}

	public void setRepository(SectionsBookRepository repository) {
		this.repository = repository;
	}
	
public void addSectionsBook(SectionsBook book) {
		
		repository.save(book);
	}
	
	public Optional<SectionsBook> findSectionsBook(String isbn) {
		
		return repository.findById(isbn);
	}
	
	public List<SectionsBook> findAllSectionsBook() {
		
		return repository.findAll();
	}
	
	public void deleteSectionsBook(String isbn) {
		
		repository.deleteById(isbn);
	}
}
