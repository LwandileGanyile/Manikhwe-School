package com.manikhweschool.book.java.part.one.chapter.eight;

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
public class ChapterEightExerciseAlbum implements Viewable{
	
	@Autowired
	private ExerciseVideoAlbum exerciseVideoAlbum;	

	public ChapterEightExerciseAlbum() {
		
	}
	
	public ChapterEightExerciseAlbum(ExerciseVideoAlbum exerciseVideoAlbum, ChapterEight chapterEight){		

		this.exerciseVideoAlbum = exerciseVideoAlbum;
		Collection<Exercise> album = chapterEight.getExercises();
		
		if(album.size() != 0) {
			exerciseVideoAlbum.setAlbum(album);
			
			Map<String,Byte> map = new LinkedHashMap<>();
			addExercisesAndNumberOfSolutions(map);
			exerciseVideoAlbum.setNumberOfSolutions(map);
		}
	}
	
	private void addExercisesAndNumberOfSolutions(Map<String,Byte> map) {
		
		map.put("8.1", (byte) 3);
		map.put("8.2", (byte) 3);
		map.put("8.3", (byte) 3);
		map.put("8.4", (byte) 3);
		map.put("8.5", (byte) 3);
		map.put("8.6", (byte) 3);
		map.put("8.7", (byte) 3);
		map.put("8.8", (byte) 3);
		map.put("8.9", (byte) 3);
		map.put("8.10", (byte) 3);
		map.put("8.11", (byte) 3);
		map.put("8.12", (byte) 3);
		map.put("8.13", (byte) 3);
		map.put("8.14", (byte) 3);
		map.put("8.15", (byte) 3);
		map.put("8.16", (byte) 3); 
		map.put("8.17", (byte) 3); 
		map.put("8.18", (byte) 3); 
		map.put("8.19", (byte) 3);
		map.put("8.20", (byte) 3);
		map.put("8.21", (byte) 3);
		map.put("8.22", (byte) 3);
		map.put("8.23", (byte) 3);
		map.put("8.24", (byte) 3);
		map.put("8.25", (byte) 3);
		map.put("8.26", (byte) 3);
		map.put("8.27", (byte) 3);
		map.put("8.28", (byte) 3);
		map.put("8.29", (byte) 3);
		map.put("8.30", (byte) 3);
		map.put("8.31", (byte) 3);
		map.put("8.32", (byte) 3);
		map.put("8.33", (byte) 3);
		map.put("8.34", (byte) 3);
		map.put("8.35", (byte) 3); 
		map.put("8.36", (byte) 3);
		map.put("8.37", (byte) 3); 
		
	}
	
	public ExerciseVideoAlbum getExerciseVideoAlbum() {
		return exerciseVideoAlbum;
	}

	public void setExerciseVideoAlbum(ExerciseVideoAlbum exerciseVideoAlbum) {
		this.exerciseVideoAlbum = exerciseVideoAlbum;
	}
	
	public Collection<Exercise> getExercises() {
		
		return exerciseVideoAlbum.getAlbum();
	}
	
	@Override
	public JavaChapterName getContainedChapter() {
		
		return JavaChapterName.Multidimensional_Arrays;
	}
}
