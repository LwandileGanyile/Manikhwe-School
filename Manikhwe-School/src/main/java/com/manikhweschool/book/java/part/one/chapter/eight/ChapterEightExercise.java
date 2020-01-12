package com.manikhweschool.book.java.part.one.chapter.eight;

import java.io.FileNotFoundException;


import org.springframework.stereotype.Component;

import com.manikhweschool.book.java.model.JavaExercise;

@Component
public class ChapterEightExercise extends JavaExercise implements Cloneable{

	public ChapterEightExercise() {
		
	}

	protected void readCorrectFilePortion(ChapterEightExerciseNumber exerciseNumber) throws FileNotFoundException {
		
		readCorrectFilePortion(
		663,663+exerciseNumber.ordinal(), 
		"One");
	}
	
	public void setExerciseNumber(ChapterEightExerciseNumber exerciseNumber) throws FileNotFoundException {
		readCorrectFilePortion(exerciseNumber);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
