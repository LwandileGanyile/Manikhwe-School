package com.manikhweschool.book.java.part.one.chapter.eight;

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
public class ChapterEight implements com.manikhweschool.book.ReadableChapter, IChapter{

	@Autowired
	private Chapter chapter;
	
	private ArrayList<ChapterEightExercise> chapterEightExercises;
	
	public ChapterEight() {
		chapterEightExercises = new ArrayList<>();
	}
	
	
	// We need an interface for this method.
	public void addExercise(JavaExercise exercise) {
		Exercise ex = exercise.getExercise();
		ex.setTechnology("Java");
		chapterEightExercises.add((ChapterEightExercise) exercise);
		chapter.addExercise(ex);
	}
	
	@Override
	public String toString() {
		
		String representation = "";
		
		for(ChapterEightExercise exercise : chapterEightExercises)
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
		
		ChapterEightExercise tempExercise = (ChapterEightExercise) t;
		ChapterEightExercise exercise;
		String chapterNumber = "Chapter Eight";
		
		chapter.clearExercises();
	
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Eight_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Eight_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Eight_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Ten_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Ten_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Ten_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Eleven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Eleven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Eleven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twelve_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twelve_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twelve_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Fourteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Fourteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Fourteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Fifteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Fifteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Fifteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Sixteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Sixteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Sixteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Seventeen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Seventeen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Seventeen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Eighteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Eighteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Eighteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Nineteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Nineteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Nineteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Eight_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Eight_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Eight_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Twenty_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterEightExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterEightExerciseNumber.Eight_Thirty_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		JavaChapterMapping.mapJavaChapterName(chapter,PartOneChapter.Multidimensional_Arrays);
	}

}
