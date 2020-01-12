package com.manikhweschool.book.java.part.one.chapter.two;

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
public class ChapterTwo implements com.manikhweschool.book.ReadableChapter, IChapter{

	@Autowired
	private Chapter chapter;
	
	private ArrayList<ChapterTwoExercise> chapterTwoExercises;
	
	
	public ChapterTwo() {
		chapterTwoExercises = new ArrayList<>();
	}
	
	public void addExercise(JavaExercise exercise) throws CloneNotSupportedException {
				
		Exercise ex = exercise.getExercise();
		ex.setTechnology("Java");
		chapterTwoExercises.add((ChapterTwoExercise) exercise);
		chapter.addExercise(ex);
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
		System.out.println("Cloning Failed.");
		return chapter;
	}

	@Override
	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
	
	@Override
	public String toString() {
		
		String representation = "";
		
		for(ChapterTwoExercise exercise : chapterTwoExercises)
			representation += exercise.toString() ;
					
		return representation;
	}
	
	@Override
	public <T extends JavaExercise> void createBuildingBlock(T t) throws CloneNotSupportedException, FileNotFoundException {

		ChapterTwoExercise tempExercise = (ChapterTwoExercise) t;
		ChapterTwoExercise exercise;
		String chapterNumber = "Chapter Two";
		
		chapter.clearExercises();
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);		
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Eight_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Eight_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Eight_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Ten_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);		
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Ten_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Ten_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Eleven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Eleven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);		
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Eleven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twelve_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twelve_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twelve_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Thirteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Thirteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Thirteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Fourteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Fourteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Fourteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Fifteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Fifteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Fifteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Sixteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Sixteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Sixteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Seventeen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Seventeen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Seventeen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Eighteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Eighteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Eighteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Nineteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Nineteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Nineteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twenty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twenty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twenty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twenty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twenty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twenty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twenty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twenty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twenty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twenty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twenty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);	
		
		exercise = (ChapterTwoExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterTwoExerciseNumber.Two_Twenty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		JavaChapterMapping.mapJavaChapterName(this.chapter,PartOneChapter.Elementary_Programming);
	}
}
