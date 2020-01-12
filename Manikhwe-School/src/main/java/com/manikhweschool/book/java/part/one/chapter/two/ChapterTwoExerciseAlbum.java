package com.manikhweschool.book.java.part.one.chapter.two;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manikhweschool.book.java.model.JavaChapterName;
import com.manikhweschool.book.java.model.Viewable;
import com.manikhweschool.model.Exercise;
import com.manikhweschool.model.ExerciseVideoAlbum;

@Component
public class ChapterTwoExerciseAlbum implements Viewable{
			
	@Autowired
	private ExerciseVideoAlbum exerciseVideoAlbum;
	
	@Autowired
	private ChapterTwo chapterTwo;
	
	public ChapterTwoExerciseAlbum() {
		
	}
	
	public ChapterTwoExerciseAlbum(ExerciseVideoAlbum exerciseVideoAlbum, ChapterTwo chapterTwo){
		
		this.exerciseVideoAlbum = exerciseVideoAlbum;
		this.chapterTwo = chapterTwo;
		
		Collection<Exercise> album = this.chapterTwo.getExercises();
		
		if(album.size() != 0) {
			exerciseVideoAlbum.setAlbum(album);
			
			Map<String,Byte> map = new LinkedHashMap<>();
			addExercisesAndNumberOfSolutions(map);
			exerciseVideoAlbum.setNumberOfSolutions(map);
		}
		else {
			System.out.println("Make sure your ExerciseVideoAlbum is filled with exercises.");
		}
	}
	
	private void addExercisesAndNumberOfSolutions(Map<String,Byte> map) {
		
		map.put("2.1", (byte) 2); 
		map.put("2.2", (byte) 3); 
		map.put("2.3", (byte) 1); 
		map.put("2.4", (byte) 1); 
		map.put("2.5", (byte) 1);
		
		map.put("2.6", (byte) 1); 
		map.put("2.7", (byte) 3); 
		map.put("2.8", (byte) 1); 
		map.put("2.9", (byte) 3); 
		map.put("2.10", (byte) 3); 
		
		map.put("2.11", (byte) 3); 
		map.put("2.12", (byte) 3); 
		map.put("2.13", (byte) 3); 
		map.put("2.14", (byte) 3);
		map.put("2.15", (byte) 3);
		
		map.put("2.16", (byte) 1);
		map.put("2.17", (byte) 3);
		map.put("2.18", (byte) 1); 
		map.put("2.19", (byte) 2);
		map.put("2.20", (byte) 3); 
		
		map.put("2.21", (byte) 2); 
		map.put("2.22", (byte) 1);
		map.put("2.23", (byte) 3); 
		
	}
	
	public Collection<Exercise> getExercises() {
		
		return exerciseVideoAlbum.getAlbum();
	}

	public ExerciseVideoAlbum getExerciseVideoAlbum() {
		return exerciseVideoAlbum;
	}
	
	

	public ChapterTwo getChapterTwo() {
		return chapterTwo;
	}

	public void setChapterTwo(ChapterTwo chapterTwo) {
		this.chapterTwo = chapterTwo;
	}

	public void setExerciseVideoAlbum(ExerciseVideoAlbum exerciseVideoAlbum) {
		this.exerciseVideoAlbum = exerciseVideoAlbum;
	}
	
	@Override
	public JavaChapterName getContainedChapter() {
		return JavaChapterName.Elementary_Programming;
	}
}
