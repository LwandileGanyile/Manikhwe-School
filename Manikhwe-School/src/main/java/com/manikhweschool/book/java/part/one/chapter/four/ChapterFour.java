package com.manikhweschool.book.java.part.one.chapter.four;

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
public class ChapterFour  implements com.manikhweschool.book.ReadableChapter, IChapter{

	@Autowired
	private Chapter chapter;
	
	private ArrayList<ChapterFourExercise> chapterFourExercises;
	
	public ChapterFour() {
		chapterFourExercises = new ArrayList<>();
	}
	
	public void addExercise(JavaExercise exercise) {
		Exercise ex = exercise.getExercise();
		ex.setTechnology("Java");
		chapterFourExercises.add((ChapterFourExercise) exercise);
		chapter.addExercise(ex);
	}
	
	@Override
	public String toString() {
		
		String representation = "";
		
		for(ChapterFourExercise exercise : chapterFourExercises)
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
		
		ChapterFourExercise tempExercise = (ChapterFourExercise) t;
		ChapterFourExercise exercise;
		String chapterNumber = "Chapter Four";
		
		chapter.clearExercises();
	
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Seven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Seven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Seven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Eight_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Eight_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Eight_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Nine_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Nine_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Nine_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Ten_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Ten_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Ten_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Eleven_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Eleven_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Eleven_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twelve_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twelve_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twelve_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Thirteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Thirteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Thirteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Fourteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Fourteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Fourteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Fifteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Fifteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Fifteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Sixteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Sixteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Sixteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Seventeen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Seventeen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Seventeen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Eighteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Eighteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Eighteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Nineteen_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Nineteen_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Nineteen_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_One_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_One_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_One_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Two_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Two_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Two_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Three_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Three_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Three_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Four_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Four_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Four_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Five_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Five_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Five_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Six_A);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Six_B);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
		
		exercise = (ChapterFourExercise) tempExercise.clone();
		exercise.setExerciseNumber(ChapterFourExerciseNumber.Four_Twenty_Six_C);
		exercise.setVideoLocation();
		exercise.setCodeLocation(chapterNumber);
		addExercise(exercise);
			
		JavaChapterMapping.mapJavaChapterName(chapter,PartOneChapter.Mathematical_Functions_Character_And_Strings);
	}


}
