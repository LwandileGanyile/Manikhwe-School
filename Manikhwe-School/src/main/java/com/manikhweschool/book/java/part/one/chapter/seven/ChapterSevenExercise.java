package com.manikhweschool.book.java.part.one.chapter.seven;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Component;

import com.manikhweschool.book.java.model.JavaExercise;

@Component
public class ChapterSevenExercise extends JavaExercise implements Cloneable{

	public ChapterSevenExercise() {
		
	}

	protected void readCorrectFilePortion(ChapterSevenExerciseNumber exerciseNumber) throws FileNotFoundException {
		
		readCorrectFilePortion(
		558,558+exerciseNumber.ordinal(), 
		"One");
	}
	
	public void setExerciseNumber(ChapterSevenExerciseNumber exerciseNumber) throws FileNotFoundException {
		readCorrectFilePortion(exerciseNumber);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
