package com.manikhweschool.book.java.part.one.chapter.one;

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
public class ChapterOne implements com.manikhweschool.book.ReadableChapter, IChapter{

	@Autowired
	private Chapter chapter;
	
	private ArrayList<ChapterOneExercise> chapterOneExercises;
	
	public ChapterOne(){
		chapterOneExercises = new ArrayList<>();
	}
	
	public void addExercise(JavaExercise exercise) {
		Exercise ex;
		ex = exercise.getExercise();
		ex.setTechnology("Java");
		chapterOneExercises.add((ChapterOneExercise) exercise);
		chapter.addExercise(ex);
		
	}
	
	@Override
	public String toString() {
		
		String representation = "";
		
		for(ChapterOneExercise exercise : chapterOneExercises)
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
		/*try {
			return (Chapter)chapter.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Could Clone Chapter");*/
		return chapter;
	}

	@Override
	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
	
	@Override
	public <T extends JavaExercise> void createBuildingBlock(T t) throws CloneNotSupportedException, FileNotFoundException {
		
		ChapterOneExercise tempExercise = (ChapterOneExercise) t;
		ChapterOneExercise exercise;
		String chapterNumber = "Chapter One";
		
		chapter.clearExercises();
	
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Eight_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Eight_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Eight_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Ten_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Ten_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Ten_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Eleven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Eleven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Eleven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Twelve_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Twelve_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Twelve_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Thirteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Thirteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterOneExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterOneExerciseNumber.One_Thirteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		JavaChapterMapping.mapJavaChapterName(chapter,PartOneChapter.Introduction_To_Computers_Programs_And_Java);
	}

}
