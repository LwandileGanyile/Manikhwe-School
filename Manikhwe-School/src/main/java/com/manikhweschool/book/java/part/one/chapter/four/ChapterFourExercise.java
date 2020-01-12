package com.manikhweschool.book.java.part.one.chapter.four;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Component;

import com.manikhweschool.book.java.model.JavaExercise;

@Component
public class ChapterFourExercise extends JavaExercise implements Cloneable{

	public ChapterFourExercise() {
		
	}

	protected void readCorrectFilePortion(ChapterFourExerciseNumber exerciseNumber) throws FileNotFoundException {
		
		readCorrectFilePortion(
		210,210+exerciseNumber.ordinal(), 
		"One");
	}
	
	public void setExerciseNumber(ChapterFourExerciseNumber exerciseNumber) throws FileNotFoundException {
		readCorrectFilePortion(exerciseNumber);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
