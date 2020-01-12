package com.manikhweschool.model;

public interface Visitable {

	public abstract int getNumberOfTodayVisitors();
	public abstract void increaseNumberOfTodayVisitors() ;
	public abstract void zeroNumberOfTodayVisitors();
	
	public abstract int getNumberOfTodayNewVisitors();
	public abstract void increaseNumberOfTodayNewVisitors() ;
	public abstract void zeroNumberOfTodayNewVisitors();
	
	public abstract int getNumberOfThisWeekVisitors();
	public abstract void increaseNumberOfThisWeekVisitors() ;
	public abstract void zeroNumberOfThisWeekVisitors();
	
	public abstract int getNumberOfThisWeekNewVisitors();
	public abstract void increaseNumberOfThisWeekNewVisitors() ;
	public abstract void zeroNumberOfThisWeekNewVisitors();
	
	public abstract int getNumberOfThisMonthVisitors();
	public abstract void increaseNumberOfThisMonthVisitors() ;
	public abstract void zeroNumberOfThisMonthVisitors();
	
	public abstract int getNumberOfThisMonthNewVisitors();
	public abstract void increaseNumberOfThisMonthNewVisitors() ;
	public abstract void zeroNumberOfThisMonthNewVisitors();
	
	public abstract int getNumberOfThisYearVisitors();
	public abstract void increaseNumberOfThisYearVisitors() ;
	public abstract void zeroNumberOfThisYearVisitors();
	
	public abstract int getNumberOfThisYearNewVisitors();
	public abstract void increaseNumberOfThisYearNewVisitors() ;
	public abstract void zeroNumberOfThisYearNewVisitors();
	
}
