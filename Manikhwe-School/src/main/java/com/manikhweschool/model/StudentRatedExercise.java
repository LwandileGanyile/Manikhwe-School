package com.manikhweschool.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import org.springframework.stereotype.Component;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Table(name = "STUDENT_RATING_EXERCISE")
@Inheritance(strategy = InheritanceType.JOINED)
@Component
//Once a user visits any one of the exercises page we activate this bean.
public class StudentRatedExercise extends StudentActedOnExercise implements Serializable,Cloneable, HttpSessionBindingListener{

	private static final long serialVersionUID = 1L;
	
    @Column(name = "Video_Rate")
    private Boolean videoExerciseLiked; 
    
    //@ManyToMany(mappedBy = "ratedExercises")
    //private Set<Student> students;
	
	public StudentRatedExercise() {
		videoExerciseLiked = null;
		//students = new HashSet<>();
	}
	
	public StudentRatedExercise(Exercise exercise, ToBeVisited toBeVisited, String watchedAndFinished,Boolean videoExerciseLiked) {
		super(exercise,toBeVisited,watchedAndFinished);
		this.videoExerciseLiked = videoExerciseLiked;
		//students = new HashSet<>();
	}
	
	@Override
	public void setStudentActedOnExerciseID() {
		 
		studentActedOnExerciseID = "Ex " + exercise.getExerciseNumber() + " : Rated";
	}
	
	public Boolean getVideoExerciseLiked() {
		return videoExerciseLiked;
	}

	public void setVideoExerciseLiked(Boolean videoExerciseLiked) {
		this.videoExerciseLiked = videoExerciseLiked;
	}
	/*
	public Set<Student> getStudent() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}*/
	
	@Override
	public void valueBound(HttpSessionBindingEvent even) {
		
		// Code to run now that I am in a session.
	}
	
    @Override
	public void valueUnbound(HttpSessionBindingEvent even) {
		// Code to run now that I know I am no longer part of a session.
		
	}
    
    @Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
