package com.manikhweschool.book.java.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manikhweschool.model.Exercise;

@Component
public class JavaExercise{

	@Autowired
	private Exercise exercise;
	
	protected JavaExercise() {
		
	}
	
	/* The string substring method removes the last letter(a, b or c) 
	 * of the exercise number. That is because, a student downloads 
	 * the video file e.g Ex 1.1 which combines three different 
	 * solutions instead of Ex 1.1a, Ex 1.1b or Ex 1.1c separately 
	 * by heating the download video button or any of the social media 
	 * buttons.*/
	public void setVideoLocation() {
		
		exercise.setVideoLocation("\\Java Course Resources\\Exercises Videos " +
		"Exercise_" + exercise.getExerciseNumber().substring(0, exercise.getExerciseNumber().length()-1) + ".mp4");
	}
	
	/* The string substring method removes the last letter(a, b or c) 
	 * of the exercise number. That is because, a student downloads 
	 * the source code fie e.g Ex 1.1 which combines three different 
	 * solutions instead of Ex 1.1a, Ex 1.1b or Ex 1.1c separately 
	 * by heating the download code button.*/
	public void setCodeLocation(String chapterNumber) {
		exercise.setCodeLocation("\\Java Course Resources\\Exercises Code\\" +
		chapterNumber+"\\Exercise " + exercise.getExerciseNumber().substring(0, exercise.getExerciseNumber().length()-1) + ".zip");
	}
	
	/* Used to determine the exercise number by reading the correct 
	 * portion of the text file that contains all the exercises found 
	 * in the java book.
	 */
	protected void readCorrectFilePortion(int minimumEnumPosition, 
	int currentPosition, String partNumber) 
	throws FileNotFoundException{
		
		String relavitePath = "C:\\Users\\Test\\OneDrive\\Documents\\My-God's-Path-On-Earth\\Teaching Website\\Manikhwe School\\Manikhwe-School\\Java Course Resources\\Exercises File\\"
		+ "Part_"+partNumber+"_Exercises.txt";
		
		Scanner scanner = new Scanner(
		new File(relavitePath));
				
		scanner.useDelimiter(",");
		
		// MAKE SURE WE START READING THE FILE AT THE RIGHT POSITION.
		for(int index = 1; index <= minimumEnumPosition;index++)
			scanner.next();
				
		while(currentPosition>=minimumEnumPosition && scanner.hasNext()
		) {
					
			if(currentPosition==minimumEnumPosition)
				exercise.setExerciseNumber(scanner.next());
			scanner.next();
			currentPosition--;
		}
				
		scanner.close();
	}
	
	@Override
	public boolean equals(Object object) {
        Exercise exercise = (Exercise)object;
		
		return this.exercise.getExerciseNumber().equals(exercise.getExerciseNumber());
	}

	public Exercise getExercise() {
		try {
			return (Exercise) exercise.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("Could not close exercise in JavaExercise.");
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}
}
