package com.manikhweschool.book.java.part.one.chapter.two;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Component;

import com.manikhweschool.book.java.model.JavaExercise;

@Component
public class ChapterTwoExercise extends JavaExercise implements Cloneable{

	public ChapterTwoExercise() {
		
	}
	
	
	protected void readCorrectFilePortion(ChapterTwoExerciseNumber exerciseNumber) throws FileNotFoundException {
		
		readCorrectFilePortion(
		39,39 + exerciseNumber.ordinal(), 
		"One");
		
		
	}
	
	public void setExerciseNumber(ChapterTwoExerciseNumber exerciseNumber) throws FileNotFoundException {
		readCorrectFilePortion(exerciseNumber);
	}
	
	@Override
	public String toString() {
		
		return "--------------------------Chapter Two Exercise-------------------------\n" + super.toString();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
