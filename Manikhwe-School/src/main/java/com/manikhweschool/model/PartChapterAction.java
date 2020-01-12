package com.manikhweschool.model;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Table(name = "PART_CHAPTER_ACTION")
@Inheritance(strategy = InheritanceType.JOINED)
public class PartChapterAction implements Visitable{
	
	@Id
	@GeneratedValue
	protected int partChapterID;
    
    @Column(name = "Time_Spent", nullable = false)
    protected int timeSpentInSeconds;
    
    @OneToOne
    @Autowired
    protected ToBeVisited toBeVisited;
	
	protected PartChapterAction() {
		timeSpentInSeconds = 0;
	}
	
	protected PartChapterAction(
	int timeSpentInSeconds, ToBeVisited toBeVisited) {
		this.timeSpentInSeconds = timeSpentInSeconds;
		this.toBeVisited = toBeVisited;
	}

	public int getTimeSpentInSeconds() {
		return timeSpentInSeconds;
	}

	public void setTimeSpentInSeconds(int timeSpentInSeconds) {
		this.timeSpentInSeconds = timeSpentInSeconds;
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

	public int getPartChapterID() {
		return partChapterID;
	}
	
	
}
