package com.manikhweschool.book.java.part.one.chapter.six;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Component;

import com.manikhweschool.book.java.model.JavaExercise;

@Component
public class ChapterSixExercise extends JavaExercise implements Cloneable{

	public ChapterSixExercise() {
		
	}

	protected void readCorrectFilePortion(ChapterSixExerciseNumber exerciseNumber) throws FileNotFoundException {
		
		readCorrectFilePortion(
		441,441+exerciseNumber.ordinal(), 
		"One");
	}

	public void setExerciseNumber(ChapterSixExerciseNumber exerciseNumber) throws FileNotFoundException {
		readCorrectFilePortion(exerciseNumber);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
