package com.manikhweschool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

// Values for the tracking id should be generated randomly.
@Entity
@Table(name = "TO_BE_VISITED")
@Component
public class ToBeVisited implements Visitable, Cloneable {

	@Id
	@Column(name = "Description_ID", nullable = false)
	private String description;
	
    @Column(name = "Number_Of_Today_Visitors", nullable = false)
    private int numberOfTodayVisitors;    
    @Column(name = "Number_Of_Today_New_Visitors", nullable = false)
    private int numberOfTodayNewVisitors;
	
    @Column(name = "Number_Of_This_Week_Visitors", nullable = false)
    private int numberOfThisWeekVisitors;
    @Column(name = "Number_Of_This_Week_New_Visitors", nullable = false)
    private int numberOfThisWeekNewVisitors;
    
    @Column(name = "Number_Of_This_Month_Visitors", nullable = false)
    private int numberOfThisMonthVisitors;
    @Column(name = "Number_Of_This_Month_New_Visitors", nullable = false)
    private int numberOfThisMonthNewVisitors;

    @Column(name = "Number_Of_This_Year_Visitors", nullable = false)
    private int numberOfThisYearVisitors;
    @Column(name = "Number_Of_This_Year_New_Visitors", nullable = false)
    private int numberOfThisYearNewVisitors;
	
	public ToBeVisited() {
		numberOfTodayVisitors = 0;
		numberOfTodayNewVisitors = 0;
		
		numberOfThisWeekVisitors = 0;
		numberOfThisWeekNewVisitors = 0;
		
		numberOfThisMonthVisitors = 0;
		numberOfThisMonthNewVisitors = 0;
		
		numberOfThisYearVisitors = 0;
		numberOfThisYearNewVisitors = 0;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setNumberOfTodayVisitors(int numberOfTodayVisitors) {
		this.numberOfTodayVisitors = numberOfTodayVisitors;
	}

	public void setNumberOfTodayNewVisitors(int numberOfTodayNewVisitors) {
		this.numberOfTodayNewVisitors = numberOfTodayNewVisitors;
	}

	public void setNumberOfThisWeekVisitors(int numberOfThisWeekVisitors) {
		this.numberOfThisWeekVisitors = numberOfThisWeekVisitors;
	}



	public void setNumberOfThisWeekNewVisitors(int numberOfThisWeekNewVisitors) {
		this.numberOfThisWeekNewVisitors = numberOfThisWeekNewVisitors;
	}



	public void setNumberOfThisMonthVisitors(int numberOfThisMonthVisitors) {
		this.numberOfThisMonthVisitors = numberOfThisMonthVisitors;
	}



	public void setNumberOfThisMonthNewVisitors(int numberOfThisMonthNewVisitors) {
		this.numberOfThisMonthNewVisitors = numberOfThisMonthNewVisitors;
	}



	public void setNumberOfThisYearVisitors(int numberOfThisYearVisitors) {
		this.numberOfThisYearVisitors = numberOfThisYearVisitors;
	}

	
	public void setNumberOfThisYearNewVisitors(int numberOfThisYearNewVisitors) {
		this.numberOfThisYearNewVisitors = numberOfThisYearNewVisitors;
	}



	/* Get total number of visitors for 
	 * the current day.*/
	@Override
	public int getNumberOfTodayVisitors() {
		return numberOfTodayVisitors;
	}

	/* Increase total number of visitors for 
	 * the current day.*/
	@Override
	public void increaseNumberOfTodayVisitors() {
		numberOfTodayVisitors++;
	}
	
	/* Zero total number of visitors for 
	 * the current day.*/
	@Override
	public void zeroNumberOfTodayVisitors() {
		numberOfTodayVisitors = 0;
	}

	
	/* Get total number of new visitors for 
	 * the current day.*/
	@Override
	public int getNumberOfTodayNewVisitors() {
		return numberOfTodayNewVisitors;
	}

	/* Increase total number of new visitors for 
	 * the current day.*/
	@Override
	public void increaseNumberOfTodayNewVisitors() {
		numberOfTodayNewVisitors++;
	}
	
	/* Zero total number of new visitors for 
	 * the current day.*/
	@Override
	public void zeroNumberOfTodayNewVisitors() {
		numberOfTodayNewVisitors = 0;
	}
	

	/* Increase total number of visitors for 
	 * the current week.*/
	public int getNumberOfThisWeekVisitors() {
		return numberOfThisWeekVisitors;
	}

	/* Increase total number of visitors for 
	 * the current week.*/
	@Override
	public void increaseNumberOfThisWeekVisitors() {
		numberOfThisWeekVisitors++;
	}
	
	/* Zero total number of visitors for 
	 * the current week.*/
	@Override
	public void zeroNumberOfThisWeekVisitors() {
		numberOfThisWeekVisitors = 0;
	}


	
	/* Get total number of new visitors for 
	 * the current week.*/
	@Override
	public int getNumberOfThisWeekNewVisitors() {
		return numberOfThisWeekNewVisitors;
	}

	/* Increase total number of new visitors for 
	 * the current week.*/
	@Override
	public void increaseNumberOfThisWeekNewVisitors() {
		numberOfThisWeekNewVisitors++;
	}
	
	/* Zero total number of new visitors for 
	 * the current week.*/
	@Override
	public void zeroNumberOfThisWeekNewVisitors() {
		numberOfThisWeekNewVisitors = 0;
	}

	

	/* Get total number of new visitors for 
	 * the current month.*/
	@Override
	public int getNumberOfThisMonthVisitors() {
		return numberOfThisMonthVisitors;
	}

	/* Increase total number of new visitors for 
	 * the current month.*/
	@Override
	public void increaseNumberOfThisMonthVisitors() {
		this.numberOfThisMonthVisitors++;
	}
	
	/* Zero total number of new visitors for 
	 * the current month.*/
	@Override
	public void zeroNumberOfThisMonthVisitors() {
		numberOfThisMonthVisitors = 0;
	}

	
	/* Get total number of new visitors for 
	 * the current month.*/
	@Override
	public int getNumberOfThisMonthNewVisitors() {
		return numberOfThisMonthNewVisitors;
	}

	/* Increase total number of new visitors for 
	 * the current month.*/
	@Override
	public void increaseNumberOfThisMonthNewVisitors() {
		numberOfThisMonthNewVisitors++;
	}
	
	/* Zero total number of new visitors for 
	 * the current month.*/
	@Override
	public void zeroNumberOfThisMonthNewVisitors() {
		numberOfThisMonthNewVisitors = 0;
	}
	

	/* Get total number of visitors for
	 * the current year.*/
	@Override
	public int getNumberOfThisYearVisitors() {
		return numberOfThisYearVisitors;
	}

	/* Increase total number of visitors for
	 * the current year.*/
	@Override
	public void increaseNumberOfThisYearVisitors() {
		numberOfThisYearVisitors++;
	}

	/* Zero total number of visitors for 
	 * the current year.*/
	@Override
	public void zeroNumberOfThisYearVisitors() {
		numberOfThisYearVisitors = 0;
	}
	
	
	/* Get total number of new visitors for
	 * the current year.*/
	@Override
	public int getNumberOfThisYearNewVisitors() {
		return numberOfThisYearNewVisitors;
	}

	/* Increase total number of new visitors for
	 * the current year.*/
	@Override
	public void increaseNumberOfThisYearNewVisitors() {
		this.numberOfThisYearNewVisitors++;
	}
	
	/* Zero total number of new visitors for 
	 * the current year.*/
	@Override
	public void zeroNumberOfThisYearNewVisitors() {
		numberOfThisYearNewVisitors = 0;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
