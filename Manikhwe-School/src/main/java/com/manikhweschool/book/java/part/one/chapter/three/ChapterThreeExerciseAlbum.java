package com.manikhweschool.book.java.part.one.chapter.three;

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
public class ChapterThreeExerciseAlbum implements Viewable{
	
	@Autowired
	private ExerciseVideoAlbum exerciseVideoAlbum;
	
	public ChapterThreeExerciseAlbum() {
		
	}
	
	public ChapterThreeExerciseAlbum(ExerciseVideoAlbum exerciseVideoAlbum, ChapterThree chapterThree){

		this.exerciseVideoAlbum = exerciseVideoAlbum;
		
		Collection<Exercise> album = chapterThree.getExercises();
		
		if(album.size() != 0) {
			exerciseVideoAlbum.setAlbum(album);
			
			Map<String,Byte> map = new LinkedHashMap<>();
			addExercisesAndNumberOfSolutions(map);
			exerciseVideoAlbum.setNumberOfSolutions(map);
		}
	}
	
	private void addExercisesAndNumberOfSolutions(Map<String,Byte> map) {
		
		map.put("3.1", (byte) 3);
		map.put("3.2", (byte) 3);
		map.put("3.3", (byte) 3);
		map.put("3.4", (byte) 3);
		map.put("3.5", (byte) 3);
		map.put("3.6", (byte) 3);
		map.put("3.7", (byte) 3);
		map.put("3.8", (byte) 3);
		map.put("3.9", (byte) 3);
		map.put("3.10", (byte) 3);
		map.put("3.11", (byte) 3);
		map.put("3.12", (byte) 3);
		map.put("3.13", (byte) 3);
		map.put("3.14", (byte) 3);
		map.put("3.15", (byte) 3);
		map.put("3.16", (byte) 3);
		map.put("3.17", (byte) 3);
		map.put("3.18", (byte) 3);
		map.put("3.19", (byte) 3);
		map.put("3.20", (byte) 3);
		map.put("3.21", (byte) 3);
		map.put("3.22", (byte) 3);
		map.put("3.23", (byte) 3);
		map.put("3.24", (byte) 3);
		map.put("3.25", (byte) 3);
		map.put("3.26", (byte) 3);
		map.put("3.27", (byte) 3);
		map.put("3.28", (byte) 3);
		map.put("3.29", (byte) 3);
		map.put("3.30", (byte) 3);
		map.put("3.31", (byte) 3);
		map.put("3.32", (byte) 3);
		map.put("3.33", (byte) 3); 
		map.put("3.34", (byte) 3); 
		
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
		return JavaChapterName.Selections;
	}
}
