package com.manikhweschool.book.java.part.one.chapter.five;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Component;

import com.manikhweschool.book.java.model.JavaExercise;

@Component
public class ChapterFiveExercise extends JavaExercise implements Cloneable{


	public ChapterFiveExercise() {
		
	}

	protected void readCorrectFilePortion(ChapterFiveExerciseNumber exerciseNumber) throws FileNotFoundException {
		
		readCorrectFilePortion(
		288,288+exerciseNumber.ordinal(), 
		"One");
	}
	
	public void setExerciseNumber(ChapterFiveExerciseNumber exerciseNumber) throws FileNotFoundException {
		readCorrectFilePortion(exerciseNumber);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
