package com.manikhweschool.book.java.part.one.chapter.four;

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
public class ChapterFourExerciseAlbum implements Viewable{
	
	@Autowired
	private ExerciseVideoAlbum exerciseVideoAlbum;

	public ChapterFourExerciseAlbum() {
		
	}
	
	public ChapterFourExerciseAlbum(ExerciseVideoAlbum exerciseVideoAlbum, ChapterFour chapterFour){

		this.exerciseVideoAlbum = exerciseVideoAlbum;
		Collection<Exercise> album = chapterFour.getExercises();
		
		if(album.size() != 0) {
			exerciseVideoAlbum.setAlbum(album);
			
			Map<String,Byte> map = new LinkedHashMap<>();
			addExercisesAndNumberOfSolutions(map);
			exerciseVideoAlbum.setNumberOfSolutions(map);
		}	
	}
	
	private void addExercisesAndNumberOfSolutions(Map<String,Byte> map) {
		
		map.put("4.1", (byte) 3); 
		map.put("4.2", (byte) 0); 
		map.put("4.3", (byte) 0); 
		map.put("4.4", (byte) 3); 
		map.put("4.5", (byte) 3); 
		map.put("4.6", (byte) 100); 
		map.put("4.7", (byte) 3);
		map.put("4.8", (byte) 1);
		map.put("4.9", (byte) 1); 
		map.put("4.10", (byte) 3);
		map.put("4.11", (byte) 2);
		map.put("4.12", (byte) 1); 
		map.put("4.13", (byte) 1); 
		map.put("4.14", (byte) 3); 
		map.put("4.15", (byte) 3); 
		map.put("4.16", (byte) 100); 
		map.put("4.17", (byte) 3); 
		map.put("4.18", (byte) 3); 
		map.put("4.19", (byte) 3); 
		map.put("4.20", (byte) 3); 
		map.put("4.21", (byte) 3); 
		map.put("4.22", (byte) 3);
		map.put("4.23", (byte) 3);
		map.put("4.24", (byte) 3);
		map.put("4.25", (byte) 3); 
		map.put("4.26", (byte) 1); 
		
	}

	public ExerciseVideoAlbum getExerciseVideoAlbum() {
		return exerciseVideoAlbum;
	}

	public void setExerciseVideoAlbum(ExerciseVideoAlbum exerciseVideoAlbum) {
		this.exerciseVideoAlbum = exerciseVideoAlbum;
	}

	@Override
	public JavaChapterName getContainedChapter() {
		return JavaChapterName.Mathematical_Functions_Character_And_Strings;
	}
	
	public Collection<Exercise> getExercises() {
		
		return exerciseVideoAlbum.getAlbum();
	}
}
