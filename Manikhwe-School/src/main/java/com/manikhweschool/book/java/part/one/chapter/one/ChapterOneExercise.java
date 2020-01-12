package com.manikhweschool.book.java.part.one.chapter.one;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Component;

import com.manikhweschool.book.java.model.JavaExercise;

@Component
public class ChapterOneExercise extends JavaExercise implements Cloneable{


	public ChapterOneExercise() {
		
	}

	protected void readCorrectFilePortion(ChapterOneExerciseNumber exerciseNumber) throws FileNotFoundException {
		
		readCorrectFilePortion(
		0,exerciseNumber.ordinal(), 
		"One");
	}
	
	public void setExerciseNumber(ChapterOneExerciseNumber exerciseNumber) throws FileNotFoundException {
		readCorrectFilePortion(exerciseNumber);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
