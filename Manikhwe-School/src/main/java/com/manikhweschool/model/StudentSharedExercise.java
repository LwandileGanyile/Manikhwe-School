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
@Table(name = "STUDENT_SHARING_EXERCISE")
@Inheritance(strategy = InheritanceType.JOINED)
@Component
//Once a user visits any one of the exercises page we activate this bean.
public class StudentSharedExercise extends StudentActedOnExercise implements Serializable,Cloneable, HttpSessionBindingListener{

	private static final long serialVersionUID = 5355302562154544391L;
	
    @Column(name = "Video_Number_Of_Sharing", nullable = false)
    protected int videoExerciseNumberOfSharing;
        
    //@ManyToMany(mappedBy = "sharedExercises")
    //protected Set<Student> students;
	
	public StudentSharedExercise() {
		videoExerciseNumberOfSharing = 0;
		//students = new HashSet<>();
	}
	
	public StudentSharedExercise(Exercise exercise, ToBeVisited toBeVisited, String watchedAndFinished,int videoExerciseNumberOfSharing) {
		super(exercise,toBeVisited,watchedAndFinished);
		this.videoExerciseNumberOfSharing = videoExerciseNumberOfSharing;
		//students = new HashSet<>();
	}
	
	@Override
	public void setStudentActedOnExerciseID() {
		 
		studentActedOnExerciseID = "Ex " + exercise.getExerciseNumber() + " : Shared";
	}
	
	public void increaseVideoNumberOfSharing() {
		videoExerciseNumberOfSharing++;
	}
	
	public int getVideoNumberOfSharing() {
		
		return videoExerciseNumberOfSharing;
	}
	/*
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}*/

	public int getVideoExerciseNumberOfSharing() {
		return videoExerciseNumberOfSharing;
	}

	public void setVideoExerciseNumberOfSharing(int videoExerciseNumberOfSharing) {
		this.videoExerciseNumberOfSharing = videoExerciseNumberOfSharing;
	}
	/*
	public void addStudent(Student student) {
		students.add(student);
	}*/
	
	public void valueBound(HttpSessionBindingEvent even) {
		
		// Code to run now that I am in a session.
	}
	
	public void valueUnbound(HttpSessionBindingEvent even) {
		// Code to run now that I know I am no longer part of a session.
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
