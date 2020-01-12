package com.manikhweschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.ChapterRepository;
import com.manikhweschool.model.Chapter;

@Service
public class ChapterService {

	@Autowired
	private ChapterRepository repository;
	
	
	public void saveAll(List<Chapter> chapters) {
		
		repository.saveAll(chapters);
	}
		
	public Chapter save(Chapter chapter) {
			
		return repository.save(chapter);
	}
		
	public List<Chapter> findAll(){ return repository.findAll();}
	
	public List<Chapter> findByCompleted(String completed){ return repository.findByCompleted(completed);}
}
