package com.manikhweschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.manikhweschool.model.Chapter;
import com.manikhweschool.service.ChapterService;

@Controller
public class ChapterController {

	@Autowired
	private ChapterService chapterService;
	
	public void saveAll(List<Chapter> chapters) {
		
	chapterService.saveAll(chapters);
	}
	
	public Chapter save(Chapter chapter) {
		
		return chapterService.save(chapter);
	}
	
	public List<Chapter> findAll(){ return chapterService.findAll();}
}
