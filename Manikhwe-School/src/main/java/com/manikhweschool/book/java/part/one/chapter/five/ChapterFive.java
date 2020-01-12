package com.manikhweschool.book.java.part.one.chapter.five;

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
public class ChapterFive implements com.manikhweschool.book.ReadableChapter, IChapter{

	@Autowired
	private Chapter chapter;
	
	private ArrayList<ChapterFiveExercise> chapterFiveExercises;
	
	public ChapterFive() {
		chapterFiveExercises = new ArrayList<>();
	}
	
	public void addExercise(JavaExercise exercise) {
		Exercise ex = exercise.getExercise();
		ex.setTechnology("Java");
		chapterFiveExercises.add((ChapterFiveExercise) exercise);
		chapter.addExercise(ex);
	}
	
	@Override
	public String toString() {
		
		String representation = "";
		
		for(ChapterFiveExercise exercise : chapterFiveExercises)
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
		
		ChapterFiveExercise tempExercise = (ChapterFiveExercise) t;
		ChapterFiveExercise exercise;
		String chapterNumber = "Chapter Five";
		
		chapter.clearExercises();
	
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Ten_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Ten_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Ten_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Eleven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Eleven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Eleven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twelve_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twelve_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twelve_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fifteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fifteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fifteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Sixteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Sixteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Sixteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Seventeen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Seventeen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Seventeen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Eighteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Eighteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Eighteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Nineteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Nineteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Nineteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Eight_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Eight_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Eight_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Eight_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Eight_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Eight_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Twenty_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Eight_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Eight_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Eight_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Thirty_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Eight_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Eight_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Eight_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fourty_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fifty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fifty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fifty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fifty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fifty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFiveExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFiveExerciseNumber.Five_Fifty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		JavaChapterMapping.mapJavaChapterName(chapter,PartOneChapter.Loops);
	}


	
}
