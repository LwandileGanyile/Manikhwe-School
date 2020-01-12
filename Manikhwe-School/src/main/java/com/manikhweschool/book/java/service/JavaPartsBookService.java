package com.manikhweschool.book.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.PartsBookRepository;
import com.manikhweschool.model.PartsBook;

@Service
public class JavaPartsBookService {

	@Autowired
	private PartsBookRepository repository;
	
	public void save(PartsBook partsBook) { repository.save(partsBook);}
}
