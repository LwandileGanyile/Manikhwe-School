package com.manikhweschool.book.java.part.one.chapter.five;

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
public class ChapterFiveExerciseAlbum implements Viewable{
	
	@Autowired
	private ExerciseVideoAlbum exerciseVideoAlbum;
	
	public ChapterFiveExerciseAlbum() {
		
	}
	
	public ChapterFiveExerciseAlbum(ExerciseVideoAlbum exerciseVideoAlbum, ChapterFive chapterFive) {

		this.exerciseVideoAlbum = exerciseVideoAlbum;
		
		Collection<Exercise> album = chapterFive.getExercises();
		
		if(album.size() != 0) {
			exerciseVideoAlbum.setAlbum(album);
			
			Map<String,Byte> map = new LinkedHashMap<>();
			addExercisesAndNumberOfSolutions(map);
			exerciseVideoAlbum.setNumberOfSolutions(map);
		}
	}
	
	private void addExercisesAndNumberOfSolutions(Map<String,Byte> map) {
		

		map.put("5.1", (byte) 3); 
		map.put("5.2", (byte) 1); 
		map.put("5.3", (byte) 2); 
		map.put("5.4", (byte) 3); 
		map.put("5.5", (byte) 2);
		
		map.put("5.6", (byte) 2); 
		map.put("5.7", (byte) 3); 
		map.put("5.8", (byte) 3); 
		map.put("5.9", (byte) 1); 
		map.put("5.10", (byte) 3); 
		
		map.put("5.11", (byte) 3);
		map.put("5.12", (byte) 3); 
		map.put("5.13", (byte) 3);
		map.put("5.14", (byte) 3); 
		map.put("5.15", (byte) 3); 
		
		map.put("5.16", (byte) 3); 
		map.put("5.17", (byte) 3); 
		map.put("5.18", (byte) 3);
		map.put("5.19", (byte) 2); 
		map.put("5.20", (byte) 3); 
		
		map.put("5.21", (byte) 3); 
		map.put("5.22", (byte) 3); 
		map.put("5.23", (byte) 3); 
		map.put("5.24", (byte) 3); 
		map.put("5.25", (byte) 3); 
		
		map.put("5.26", (byte) 3); 
		map.put("5.27", (byte) 3); 
		map.put("5.28", (byte) 3); 
		map.put("5.29", (byte) 3); 
		map.put("5.30", (byte) 3); 
		
		map.put("5.31", (byte) 3);
		map.put("5.32", (byte) 3); 
		map.put("5.33", (byte) 3); 
		map.put("5.34", (byte) 3); 
		map.put("5.35", (byte) 3);
		
		map.put("5.36", (byte) 3); 
		map.put("5.37", (byte) 3); 
		map.put("5.38", (byte) 3); 
		map.put("5.39", (byte) 2); 
		map.put("5.40", (byte) 3);
		
		map.put("5.41", (byte) 3);
		map.put("5.42", (byte) 1);
		map.put("5.43", (byte) 3);
		map.put("5.44", (byte) 2);
		map.put("5.45", (byte) 3);
		
		map.put("5.46", (byte) 3);
		map.put("5.47", (byte) 3);
		map.put("5.48", (byte) 3);
		map.put("5.49", (byte) 3);
		map.put("5.50", (byte) 2);
		
		map.put("5.51", (byte) 2);
		
	}

	public ExerciseVideoAlbum getExerciseVideoAlbum() {
		return exerciseVideoAlbum;
	}

	public void setExerciseVideoAlbum(ExerciseVideoAlbum exerciseVideoAlbum) {
		this.exerciseVideoAlbum = exerciseVideoAlbum;
	}

	@Override
	public JavaChapterName getContainedChapter() {
		return JavaChapterName.Loops;
	}
	
	public Collection<Exercise> getExercises() {
		
		return exerciseVideoAlbum.getAlbum();
	}
}
