package com.manikhweschool.book.java.part.one.chapter.seven;

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
public class ChapterSevenExerciseAlbum implements Viewable{
	
	@Autowired
	private ExerciseVideoAlbum exerciseVideoAlbum;
		
	public ChapterSevenExerciseAlbum() {
		
	}
	
	public ChapterSevenExerciseAlbum(ExerciseVideoAlbum exerciseVideoAlbum, ChapterSeven chapterSeven) {

		this.exerciseVideoAlbum = exerciseVideoAlbum;
		Collection<Exercise> album = chapterSeven.getExercises();
		
		if(album.size() != 0) {
			exerciseVideoAlbum.setAlbum(album);
			
			Map<String,Byte> map = new LinkedHashMap<>();
			addExercisesAndNumberOfSolutions(map);
			exerciseVideoAlbum.setNumberOfSolutions(map);
		}
	}
	
	private void addExercisesAndNumberOfSolutions(Map<String,Byte> map) {
		
		
		map.put("7.1", (byte) 3); 
		map.put("7.2", (byte) 3); 
		map.put("7.3", (byte) 3); 
		map.put("7.4", (byte) 3); 
		map.put("7.5", (byte) 3); 
		map.put("7.6", (byte) 3); 
		map.put("7.7", (byte) 3); 
		map.put("7.8", (byte) 3); 
		map.put("7.9", (byte) 3); 
		map.put("7.10", (byte) 3); 
		map.put("7.11", (byte) 3); 
		map.put("7.12", (byte) 3); 
		map.put("7.13", (byte) 3); 
		map.put("7.14", (byte) 3); 
		map.put("7.15", (byte) 3); 
		map.put("7.16", (byte) 3); 
		map.put("7.17", (byte) 3); 
		map.put("7.18", (byte) 3); 
		map.put("7.19", (byte) 3); 
		map.put("7.20", (byte) 3); 
		map.put("7.21", (byte) 3); 
		map.put("7.22", (byte) 3); 
		map.put("7.23", (byte) 3); 
		map.put("7.24", (byte) 3); 
		map.put("7.25", (byte) 3); 
		map.put("7.26", (byte) 3); 
		map.put("7.27", (byte) 3); 
		map.put("7.28", (byte) 3); 
		map.put("7.29", (byte) 3); 
		map.put("7.30", (byte) 3); 
		map.put("7.31", (byte) 3); 
		map.put("7.32", (byte) 3); 
		map.put("7.33", (byte) 3); 
		map.put("7.34", (byte) 3); 
		map.put("7.35", (byte) 3); 
		
	}
	
	
	
	public ExerciseVideoAlbum getExerciseVideoAlbum() {
		return exerciseVideoAlbum;
	}

	public void setExerciseVideoAlbum(ExerciseVideoAlbum exerciseVideoAlbum) {
		this.exerciseVideoAlbum = exerciseVideoAlbum;
	}

	@Override
	public JavaChapterName getContainedChapter() {
		return JavaChapterName.Single_Dimensional_Arrays;
	}
	
	public Collection<Exercise> getExercises() {
		
		return exerciseVideoAlbum.getAlbum();
	}
}
