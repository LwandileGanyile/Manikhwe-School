package com.manikhweschool.book.java.part.one.chapter.seven;

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
public class ChapterSeven implements com.manikhweschool.book.ReadableChapter, IChapter{

	@Autowired
	private Chapter chapter;
	
	private ArrayList<ChapterSevenExercise> chapterSevenExercises;
	
	public ChapterSeven() {
		chapterSevenExercises = new ArrayList<>();
	}
	
	public ChapterSeven(Chapter chapter, ChapterSevenExercise chapterSevenExercise) throws CloneNotSupportedException, FileNotFoundException {
		this.chapter = chapter;
		chapterSevenExercises = new ArrayList<>();
	}
	
	// We need an interface for this method.
	public void addExercise(JavaExercise exercise) {
		Exercise ex = exercise.getExercise();
		ex.setTechnology("Java");
		chapterSevenExercises.add((ChapterSevenExercise) exercise);
		chapter.addExercise(ex);
	}
	
	@Override
	public String toString() {
		
		String representation = "";
		
		for(ChapterSevenExercise exercise : chapterSevenExercises)
			representation += exercise.toString() ;
					
		return representation;
	}
	
	// We need an interface for this method.
	public String getChapterName() {
		return chapter.getChapterName();
	}
	
	// We need an interface for this method.
	public Collection<Exercise> getExercises(){
		return chapter.getExercises();
	}

	// We need an interface for this method.
	public void setExercises(LinkedHashSet<Exercise> exercises) {
		chapter.setExercises(exercises);
	}
	
	// We need an interface for this method.
	public String getCompleted() {
		return chapter.getCompleted();
	}

	// We need an interface for this method.
	public void setCompleted(boolean completed) {
		chapter.setCompleted(completed);
	}
	
	// We need an interface for this method.
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
		
		ChapterSevenExercise tempExercise = (ChapterSevenExercise) t;
		ChapterSevenExercise exercise;
		String chapterNumber = "Chapter Two";
		
		chapter.clearExercises();
	
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Ten_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Ten_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Ten_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Eleven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Eleven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Eleven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twelve_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twelve_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twelve_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Fourteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Fourteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Fourteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Fifteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Fifteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Fifteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Sixteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Sixteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Sixteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Seventeen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Seventeen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Seventeen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Eighteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Eighteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Eighteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Nineteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Nineteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Nineteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Twenty_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterSevenExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterSevenExerciseNumber.Seven_Thirty_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		JavaChapterMapping.mapJavaChapterName(chapter,PartOneChapter.Single_Dimensional_Arrays);
	}


}
