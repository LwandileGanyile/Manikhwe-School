package com.manikhweschool.book.java.part.one.chapter.three;

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
public class ChapterThree implements com.manikhweschool.book.ReadableChapter, IChapter{

	@Autowired
	private Chapter chapter;
	
	private ArrayList<ChapterThreeExercise> chapterThreeExercises;
	
	public ChapterThree() {
		chapterThreeExercises = new ArrayList<>();
	}
	
	public ChapterThree(Chapter chapter) throws CloneNotSupportedException, FileNotFoundException {
		this.chapter = chapter;
		chapterThreeExercises = new ArrayList<>();
	}
	
	public void addExercise(JavaExercise exercise) {
		Exercise ex = exercise.getExercise();
		ex.setTechnology("Java");;
		chapterThreeExercises.add((ChapterThreeExercise) exercise);
		chapter.addExercise(ex);
	}
	
	@Override
	public String toString() {
		
		String representation = "";
		
		for(ChapterThreeExercise exercise : chapterThreeExercises)
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
		
		ChapterThreeExercise tempExercise = (ChapterThreeExercise) t;
		ChapterThreeExercise exercise;
		String chapterNumber = "Chapter Three";
		
		chapter.clearExercises();
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Eight_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Eight_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Eight_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Ten_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Ten_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Ten_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Eleven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Eleven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Eleven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twelve_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twelve_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twelve_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Fourteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Fourteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Fourteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Fifteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Fifteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Fifteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Sixteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Sixteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Sixteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Seventeen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Seventeen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Seventeen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Eighteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Eighteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Eighteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Nineteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Nineteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Nineteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Eight_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Eight_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Eight_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Twenty_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterThreeExercise)tempExercise.clone();
		exercise.setExerciseNumber(ChapterThreeExerciseNumber.Three_Thirty_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		JavaChapterMapping.mapJavaChapterName(chapter,PartOneChapter.Selections);
	}


}
