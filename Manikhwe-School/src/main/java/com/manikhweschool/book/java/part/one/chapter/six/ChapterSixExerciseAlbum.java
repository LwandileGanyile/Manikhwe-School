package com.manikhweschool.book.java.part.one.chapter.six;

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
public class ChapterSixExerciseAlbum implements Viewable{
	
	@Autowired
	private ExerciseVideoAlbum exerciseVideoAlbum;
			
	public ChapterSixExerciseAlbum() {
		
	}
	
	public ChapterSixExerciseAlbum(ExerciseVideoAlbum exerciseVideoAlbum, ChapterSix chapterSix){	

		this.exerciseVideoAlbum = exerciseVideoAlbum;
		Collection<Exercise> album = chapterSix.getExercises();
		
		if(album.size() != 0) {
			exerciseVideoAlbum.setAlbum(album);
			
			Map<String,Byte> map = new LinkedHashMap<>();
			addExercisesAndNumberOfSolutions(map);
			exerciseVideoAlbum.setNumberOfSolutions(map);
		}
	}

	private void addExercisesAndNumberOfSolutions(Map<String,Byte> map) {
		
		map.put("6.1", (byte) 3);
		map.put("6.2", (byte) 3);
		map.put("6.3", (byte) 3);
		map.put("6.4", (byte) 3);
		map.put("6.5", (byte) 3); 
		map.put("6.6", (byte) 3); 
		map.put("6.7", (byte) 3); 
		map.put("6.8", (byte) 3); 
		map.put("6.9", (byte) 3); 
		map.put("6.10", (byte) 3); 
		map.put("6.11", (byte) 3);
		map.put("6.12", (byte) 3); 
		map.put("6.13", (byte) 3); 
		map.put("6.14", (byte) 3); 
		map.put("6.15", (byte) 3); 
		map.put("6.16", (byte) 3);
		map.put("6.17", (byte) 3); 
		map.put("6.18", (byte) 3); 
		map.put("6.19", (byte) 3); 
		map.put("6.20", (byte) 3); 
		map.put("6.21", (byte) 3); 
		map.put("6.22", (byte) 3); 
		map.put("6.23", (byte) 3);
		map.put("6.24", (byte) 3); 
		map.put("6.25", (byte) 3); 
		map.put("6.26", (byte) 3); 
		map.put("6.27", (byte) 3); 
		map.put("6.28", (byte) 3); 
		map.put("6.29", (byte) 3);
		map.put("6.30", (byte) 3); 
		map.put("6.31", (byte) 3);
		map.put("6.32", (byte) 3);
		map.put("6.33", (byte) 3); 
		map.put("6.34", (byte) 3); 
		map.put("6.35", (byte) 3); 
		map.put("6.36", (byte) 3);
		map.put("6.37", (byte) 3); 
		map.put("6.38", (byte) 3);
		map.put("6.39", (byte) 3); 
		
	}
	
	
	public ExerciseVideoAlbum getExerciseVideoAlbum() {
		return exerciseVideoAlbum;
	}

	public void setExerciseVideoAlbum(ExerciseVideoAlbum exerciseVideoAlbum) {
		this.exerciseVideoAlbum = exerciseVideoAlbum;
	}

	@Override
	public JavaChapterName getContainedChapter() {
		return JavaChapterName.Methods;
	}
	
	public Collection<Exercise> getExercises() {
		
		return exerciseVideoAlbum.getAlbum();
	}
}
