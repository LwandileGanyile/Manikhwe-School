package com.manikhweschool.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Table(name = "Student_Acted_On_Exercise")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class StudentActedOnExercise implements Visitable, Serializable{

	private static final long serialVersionUID = 7554827520510445397L;
	
    @OneToOne
    @Autowired    
	protected Exercise exercise;
	
    @Id
    @Column(name = "Student_Acted_On_Exercise_ID", nullable = false)
	protected String studentActedOnExerciseID;
	
	/* Tells whether or not a user has finished watching an 
	 * exercise/lesson or not.*/
    @Column(name = "Watched_And_Finished", nullable = false)
	protected String finishedWatching;
	 
    @Autowired
    @OneToOne
    protected ToBeVisited toBeVisited;
	
	protected StudentActedOnExercise() {
		
		finishedWatching = "Not Yet Watched";
	}
	
	protected StudentActedOnExercise(String watchedAndFinished) {
		
		if(!watchedAndFinished.equalsIgnoreCase("Yes")
		&& !watchedAndFinished.equalsIgnoreCase("No"))
			throw new IllegalArgumentException("Make sure you enter "
			+ "yes or no to tell whether or not a user has watched and "
			+ "finished a lesson/exercise video.");
		
		if(watchedAndFinished.equalsIgnoreCase("Yes"))
			watchedAndFinished = "Yes";
		else
			watchedAndFinished = "No";
	}
	
	protected StudentActedOnExercise(Exercise exercise, ToBeVisited toBeVisited, String watchedAndFinished) {
		this(watchedAndFinished);
		setToBeVisited(toBeVisited);
		setExercise(exercise);
	}
	
	protected StudentActedOnExercise(Exercise exercise) {
		this();
		this.exercise = exercise;
	}

	public Exercise getExercise() {
		return exercise;
	}
	
	@Override
	public boolean equals(Object object) {
			
		Exercise newExercise = (Exercise)(object);
		
		return exercise.getExerciseNumber().
		equals(newExercise.getExerciseNumber());
	}

	
	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}
	
	public String getWatchedAndFinished() {
		return finishedWatching;
	}
	
	public abstract void setStudentActedOnExerciseID();

	public void setWatchedAndFinished(String watchedAndFinished) {
		this.finishedWatching = watchedAndFinished;
	}
	

	@Override
	public int getNumberOfTodayVisitors() {
		return toBeVisited.getNumberOfTodayVisitors();
	}

	/* Increase total number of visitors for 
	 * the current day.*/
	@Override
	public void increaseNumberOfTodayVisitors() {
		toBeVisited.increaseNumberOfTodayVisitors();
	}
	
	/* Zero total number of visitors for 
	 * the current day.*/
	@Override
	public void zeroNumberOfTodayVisitors() {
		toBeVisited.zeroNumberOfTodayVisitors();
	}

	/* Get total number of new visitors for 
	 * the current day.*/
	@Override
	public int getNumberOfTodayNewVisitors() {
		return toBeVisited.getNumberOfTodayNewVisitors();
	}

	/* Increase total number of new visitors for 
	 * the current day.*/
	@Override
	public void increaseNumberOfTodayNewVisitors() {
		toBeVisited.increaseNumberOfTodayNewVisitors();
	}
	
	/* Zero total number of new visitors for 
	 * the current day.*/
	@Override
	public void zeroNumberOfTodayNewVisitors() {
		toBeVisited.zeroNumberOfTodayNewVisitors();
	}

	/* Increase total number of visitors for 
	 * the current week.*/
        @Override
	public int getNumberOfThisWeekVisitors() {
		return toBeVisited.getNumberOfThisWeekVisitors();
	}

	/* Increase total number of visitors for 
	 * the current week.*/
	@Override
	public void increaseNumberOfThisWeekVisitors() {
		toBeVisited.increaseNumberOfThisWeekVisitors();
	}
	
	/* Zero total number of visitors for 
	 * the current week.*/
	@Override
	public void zeroNumberOfThisWeekVisitors() {
		toBeVisited.zeroNumberOfThisWeekVisitors();
	}
        
	/* Get total number of new visitors for 
	 * the current week.*/
	@Override
	public int getNumberOfThisWeekNewVisitors() {
		return toBeVisited.getNumberOfThisWeekNewVisitors();
	}

	/* Increase total number of new visitors for 
	 * the current week.*/
	@Override
	public void increaseNumberOfThisWeekNewVisitors() {
		toBeVisited.increaseNumberOfThisWeekNewVisitors();
	}
	
	/* Zero total number of new visitors for 
	 * the current week.*/
	@Override
	public void zeroNumberOfThisWeekNewVisitors() {
		toBeVisited.zeroNumberOfThisWeekNewVisitors();
	}

	/* Get total number of new visitors for 
	 * the current month.*/
	@Override
	public int getNumberOfThisMonthVisitors() {
            return toBeVisited.getNumberOfThisMonthVisitors();
	}

	/* Increase total number of new visitors for 
	 * the current month.*/
	@Override
	public void increaseNumberOfThisMonthVisitors() {
		toBeVisited.increaseNumberOfThisMonthVisitors();
	}
	
	/* Zero total number of new visitors for 
	 * the current month.*/
	@Override
	public void zeroNumberOfThisMonthVisitors() {
		toBeVisited.zeroNumberOfThisMonthVisitors();
	}

	/* Get total number of new visitors for 
	 * the current month.*/
	@Override
	public int getNumberOfThisMonthNewVisitors() {
		return toBeVisited.getNumberOfThisMonthNewVisitors();
	}

	/* Increase total number of new visitors for 
	 * the current month.*/
	@Override
	public void increaseNumberOfThisMonthNewVisitors() {
		toBeVisited.increaseNumberOfThisMonthNewVisitors();
	}
	
	/* Zero total number of new visitors for 
	 * the current month.*/
	@Override
	public void zeroNumberOfThisMonthNewVisitors() {
		toBeVisited.zeroNumberOfThisMonthNewVisitors();
	}
	
	/* Get total number of visitors for
	 * the current year.*/
	@Override
	public int getNumberOfThisYearVisitors() {
		return toBeVisited.getNumberOfThisYearVisitors();
	}

	/* Increase total number of visitors for
	 * the current year.*/
	@Override
	public void increaseNumberOfThisYearVisitors() {
		toBeVisited.increaseNumberOfThisYearVisitors();
	}

	/* Zero total number of visitors for 
	 * the current year.*/
	@Override
	public void zeroNumberOfThisYearVisitors() {
		toBeVisited.zeroNumberOfThisYearVisitors();
	}
	
	/* Get total number of new visitors for
	 * the current year.*/
	@Override
	public int getNumberOfThisYearNewVisitors() {
		return toBeVisited.getNumberOfThisYearNewVisitors();
	}

	/* Increase total number of new visitors for
	 * the current year.*/
	@Override
	public void increaseNumberOfThisYearNewVisitors() {
		toBeVisited.increaseNumberOfThisYearNewVisitors();
	}
	
	/* Zero total number of new visitors for 
	 * the current year.*/
	@Override
	public void zeroNumberOfThisYearNewVisitors() {
		toBeVisited.zeroNumberOfThisYearNewVisitors();
	}

	public ToBeVisited getToBeVisited() {
		return toBeVisited;
	}

	
	public void setToBeVisited(ToBeVisited toBeVisited) {
		this.toBeVisited = toBeVisited;
	}

	public String getStudentActedOnExerciseID() {
		return studentActedOnExerciseID;
	}
		
}
