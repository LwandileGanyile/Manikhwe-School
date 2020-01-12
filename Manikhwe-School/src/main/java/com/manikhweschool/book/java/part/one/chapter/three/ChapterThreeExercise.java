package com.manikhweschool.book.java.part.one.chapter.three;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Component;

import com.manikhweschool.book.java.model.JavaExercise;

@Component
public class ChapterThreeExercise extends JavaExercise implements Cloneable{

	public ChapterThreeExercise() {
		
	}

	protected void readCorrectFilePortion(ChapterThreeExerciseNumber exerciseNumber) throws FileNotFoundException {
		
		readCorrectFilePortion(
		108,108 + exerciseNumber.ordinal(), 
		"One");
	}
	
	public void setExerciseNumber(ChapterThreeExerciseNumber exerciseNumber) throws FileNotFoundException {
		readCorrectFilePortion(exerciseNumber);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
