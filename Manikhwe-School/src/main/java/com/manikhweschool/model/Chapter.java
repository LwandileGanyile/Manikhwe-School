package com.manikhweschool.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "CHAPTER")
@Component
public class Chapter implements Serializable, Cloneable{

	private static final long serialVersionUID = -8197522141923957025L;

	@Column(name = "Technology", nullable = false)
    private String technology;
	
	@Id   
	@Column(name = "Chapter_Name_ID", nullable = false)
	private String chapterName;
	
    @Column(name = "Completed", nullable = false)
    private String completed;
    
    @OneToMany (mappedBy = "chapter")
    private Collection<Exercise> exercises;
    
    @ManyToOne
    @JoinColumn(name = "PART_NUMBER")
    @Autowired
    private Part part;
    
	public Chapter() {
		chapterName = "-----";
		completed = "No";
		technology = "-----";
		exercises = new ArrayList<>();
	}
	
	public Chapter(Collection<Exercise> exercises, 
	String chapterName, boolean completed, Part part, 
	StudentActedOnChapter studentActedOnChapter) {
		
		this.exercises = exercises;
		this.chapterName = chapterName;
		this.completed = completed?"Yes":"No";
	}
	
	public void clearExercises() { exercises.clear();}
	
	public void addExercise(Exercise exercise) {
		
		exercises.add(exercise);
	}
	
	public String getChapterName() {
		return chapterName;
	}
	
	public Collection<Exercise> getExercises(){
		
		return exercises;
	}
	
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public void setExercises(LinkedHashSet<Exercise> exercises) {
		this.exercises = exercises;
	}
	
	public String getCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed?"Yes":"No";
	}
	
	public void setExercises(Collection<Exercise> exercises) {
		this.exercises = exercises;
	}


	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}


	public void setCompleted(String completed) {
		this.completed = completed;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return new Chapter();
	}
	
	public String toString(){
		
		String representation = "";
		
		representation += "Chapter Name : " + chapterName + " Chapter Technology : " + technology + " Size : " + exercises.size() + "\n"; 
		
		for(Exercise exercise : exercises)
			System.out.print(exercise);
		
		return representation;
	}
	
	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}
}
