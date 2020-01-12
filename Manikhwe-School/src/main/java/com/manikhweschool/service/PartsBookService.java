package com.manikhweschool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.PartsBookRepository;
import com.manikhweschool.model.PartsBook;

@Service
public class PartsBookService {

	@Autowired
	private PartsBookRepository repository;

	public PartsBookService() {
		
	}
	
	public void addPartsBook(PartsBook book) {
		
		repository.save(book);
	}
	
	public Optional<PartsBook> findPartsBook(String isbn) {
		
		return repository.findById(isbn);
	}
	
	public List<PartsBook> findAllPartsBooks() {
		
		return repository.findAll();
	}
	
	public void deletePartsBook(String isbn) {
		
		repository.deleteById(isbn);
	}
}
