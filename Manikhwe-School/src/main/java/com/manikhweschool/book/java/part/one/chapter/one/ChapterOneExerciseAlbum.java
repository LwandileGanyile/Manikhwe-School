package com.manikhweschool.book.java.part.one.chapter.one;

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
public class ChapterOneExerciseAlbum implements Viewable{
	
	@Autowired
	private ExerciseVideoAlbum exerciseVideoAlbum;
		
	public ChapterOneExerciseAlbum() {
		
	}
	
	public ChapterOneExerciseAlbum(ExerciseVideoAlbum exerciseVideoAlbum,ChapterOne chapterOne) {
		
		this.exerciseVideoAlbum = exerciseVideoAlbum;
		
		Collection<Exercise> album = chapterOne.getExercises();
		
		if(album.size() != 0) {
			exerciseVideoAlbum.setAlbum(album);
			
			Map<String,Byte> map = new LinkedHashMap<>();
			addExercisesAndNumberOfSolutions(map);
			exerciseVideoAlbum.setNumberOfSolutions(map);
		}
	}

	private void addExercisesAndNumberOfSolutions(Map<String,Byte> map) {
			
		map.put("1.1", (byte) 3); 
		map.put("1.2", (byte) 3); 
		map.put("1.3", (byte) 3);
		map.put("1.4", (byte) 3); 
		map.put("1.5", (byte) 1); 
		map.put("1.6", (byte) 1);
		map.put("1.7", (byte) 2); 
		map.put("1.8", (byte) 3); 
		map.put("1.9", (byte) 3); 
		map.put("1.10", (byte) 3); 
		map.put("1.11", (byte) 1); 
		map.put("1.12", (byte) 3);
		map.put("1.13", (byte) 3); 
		
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
		return JavaChapterName.Introduction_To_Computers_Programs_And_Java;
	}
}
