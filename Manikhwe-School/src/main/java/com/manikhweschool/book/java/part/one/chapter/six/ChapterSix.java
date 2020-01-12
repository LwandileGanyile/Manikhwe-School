package com.manikhweschool.book.java.part.one.chapter.six;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manikhweschool.book.java.model.JavaChapterMapping;
import com.manikhweschool.book.java.model.JavaExercise;
import com.manikhweschool.book.java.part.IChapter;
import com.manikhweschool.book.java.part.one.PartOneChapter;
import com.manikhweschool.model.Chapter;
import com.manikhweschool.model.Exercise;

@Component
public class ChapterSix implements com.manikhweschool.book.ReadableChapter, IChapter{

	@Autowired
	private Chapter chapter;
	
	private ArrayList<ChapterSixExercise> chapterSixExercises;
	
	public ChapterSix() {
		chapterSixExercises = new ArrayList<>();
	}
	
	// We need an interface for this method.
	public void addExercise(JavaExercise exercise) {
		Exercise ex = exercise.getExercise();
		ex.setTechnology("Java");
		chapterSixExercises.add((ChapterSixExercise) exercise);
		chapter.addExercise(ex);
	}
	
	@Override
	public String toString() {
		
		String representation = "";
		
		for(ChapterSixExercise exercise : chapterSixExercises)
			representation += exercise.toString() ;
					
		return representation;
	}
	
	public String getChapterName() {
		return chapter.getChapterName();
	}
	
	public Collection<Exercise> getExercises(){
		return chapter.getExercises();
	}
	
	public void setExercises(LinkedHashSet<Exercise> exercises) {
		chapter.setExercises(exercises);
	}
	
	public String getCompleted() {
		return chapter.getCompleted();
	}

	public void setCompleted(boolean completed) {
		chapter.setCompleted(completed);
	}

	public void setExercises(Collection<Exercise> exercises) {
		chapter.setExercises(exercises);
	}

	@Override
	public Chapter getChapter() {
		try {
			return (Chapter)chapter.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return chapter;
	}

	@Override
	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
	
	@Override
	public <T extends JavaExercise> void createBuildingBlock(T t) throws CloneNotSupportedException, FileNotFoundException {
		
		ChapterSixExercise tempExercise = (ChapterSixExercise) t;
		ChapterSixExercise exercise;
		String chapterNumber = "Chapter Six";
		
		chapter.clearExercises();
	
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Ten_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Ten_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Ten_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Eleven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Eleven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Eleven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twelve_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twelve_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twelve_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Fourteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Fourteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Fourteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Fifteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Fifteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Fifteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Sixteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Sixteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Sixteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Seventeen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Seventeen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Seventeen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Eighteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Eighteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Eighteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Nineteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Nineteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Nineteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Twenty_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Eight_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Eight_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Eight_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSixExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSixExerciseNumber.Six_Thirty_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		JavaChapterMapping.mapJavaChapterName(chapter,PartOneChapter.Methods);
	}


}
