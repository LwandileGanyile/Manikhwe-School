package com.manikhweschool.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "EXERCISE")
@Inheritance(strategy = InheritanceType.JOINED)
@Component
public class Exercise implements Serializable, Cloneable{

	private static final long serialVersionUID = 1812746488155244775L;

	@Column(name = "Technology", nullable = false)
    private String technology;
	
	@Id
	@Column(name = "Exercise_Number", nullable = false)
	private String exerciseNumber;
    
    @Column(name = "Number_Of_Likes", nullable = false)
    private int numberOfLikes;	
	
    @Column(name = "Number_Of_Dislikes", nullable = false)
    private int numberOfDislikes;	
	
    @Column(name = "Number_Of_Sharings", nullable = false)
	private int numberOfSharings;	
	
    @Column(name = "Number_Of_Video_Downloads", nullable = false)
    private int numberOfVideoDownloads;	
	
	@Column(name = "Number_Of_Code_Downloads", nullable = false)
	private int numberOfCodeDownloads;
	
	// Make sure you set this attribute, because it is not set correctly in the no org contructor.
    @Column(name = "Video_Location", nullable = false)
    private String videoLocation;
    
    // Make sure you set this attribute, because it is not set correctly in the no org contructor.
    @Column(name = "Code_Location", nullable = false)
    private String codeLocation;
    
    @ManyToOne
    @JoinColumn(name = "Chapter_Name")
    @Autowired
    private Chapter chapter;

	public Exercise() {
		exerciseNumber = "---";
		numberOfCodeDownloads = 0;
		numberOfVideoDownloads = 0;
		numberOfSharings = 0;
		numberOfDislikes = 0;
		numberOfLikes = 0;
		videoLocation = "---";
		codeLocation = "---";
		technology = "----";
	}

    public Exercise(String exerciseNumber) {
    	this();
		this.exerciseNumber = exerciseNumber;
		
	}
	
	public String getExerciseNumber() {
		return exerciseNumber;
	}

	public void setExerciseNumber(String exerciseNumber) {
		this.exerciseNumber = exerciseNumber;
	}
	
	@Override
	public String toString() {
		
		String representation = "\n";
		
		representation += "[Tech : " + technology + ", ";
		representation += "Ex No : " + exerciseNumber + ", ";
		representation += "Likes : " + numberOfLikes + ", ";
		representation += "Dislikes : " + numberOfDislikes + ",";
		representation += "\nCode Downloads : " + numberOfCodeDownloads + ", ";
		representation += "VideoDownloads : " + numberOfVideoDownloads + ", ";
		representation += "Code Location : \n" + codeLocation + ", ";
		representation += "\nVideo Location : " + videoLocation + "]";
		
		return representation + "\n";
	}
	
	@Override
	public boolean equals(Object object) {
	
        Exercise exercise = (Exercise)object;
		
		return exerciseNumber.equals(exercise.getExerciseNumber());
	}

	public void setVideoLocation(String videoLocation) {
		this.videoLocation = videoLocation;
	}
	
	public void setCodeLocation(String codeLocation) {
		this.codeLocation = codeLocation;
	}
	
	public String getVideoLocation() {
		return videoLocation;
	}
	
	public String getCodeLocation() {
		return codeLocation;
	}
	
	public void likeVideo() {numberOfLikes++;}
	public void dislikeVideo(){numberOfDislikes++;}
	public void shareVideo() {numberOfSharings++;}
	
	public Chapter getChapter() {
		return chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}


	public int getNumberOfLikes() {
		return numberOfLikes;
	}


	public void setNumberOfLikes(int numberOfLikes) {
		this.numberOfLikes = numberOfLikes;
	}


	public int getNumberOfDislikes() {
		return numberOfDislikes;
	}


	public void setNumberOfDislikes(int numberOfDislikes) {
		this.numberOfDislikes = numberOfDislikes;
	}


	public int getNumberOfSharings() {
		return numberOfSharings;
	}


	public void setNumberOfSharings(int numberOfSharings) {
		this.numberOfSharings = numberOfSharings;
	}


	public int getNumberOfVideoDownloads() {
		return numberOfVideoDownloads;
	}


	public void setNumberOfVideoDownloads(int numberOfVideoDownloads) {
		this.numberOfVideoDownloads = numberOfVideoDownloads;
	}


	public int getNumberOfCodeDownloads() {
		return numberOfCodeDownloads;
	}


	public void setNumberOfCodeDownloads(int numberOfCodeDownloads) {
		this.numberOfCodeDownloads = numberOfCodeDownloads;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
