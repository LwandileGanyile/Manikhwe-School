package com.manikhweschool.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikhweschool.model.ToBeVisited;

@Repository
public interface ToBeVisitedRepository extends JpaRepository<ToBeVisited,String>{

	public List<ToBeVisited> findByNumberOfTodayVisitors(int numberOfTodayVisitors);
	public List<ToBeVisited> findByNumberOfTodayVisitorsGreaterThan(int numberOfTodayVisitors);
	public List<ToBeVisited> findByNumberOfTodayVisitorsLessThan(int numberOfTodayVisitors);
	
	public List<ToBeVisited> findByNumberOfTodayNewVisitors(int numberOfTodayNewVisitors);
	public List<ToBeVisited> findByNumberOfTodayNewVisitorsGreaterThan(int numberOfTodayNewVisitors);
	public List<ToBeVisited> findByNumberOfTodayNewVisitorsLessThan(int numberOfTodayNewVisitors);
		
	public List<ToBeVisited> findByNumberOfThisWeekVisitors(int numberOfThisWeekVisitors);
	public List<ToBeVisited> findByNumberOfThisWeekVisitorsGreaterThan(int numberOfThisWeekVisitors);
	public List<ToBeVisited> findByNumberOfThisWeekVisitorsLessThan(int numberOfThisWeekVisitors);
	
	public List<ToBeVisited> findByNumberOfThisWeekNewVisitors(int numberOfThisWeekNewVisitors);
	public List<ToBeVisited> findByNumberOfThisWeekNewVisitorsGreaterThan(int numberOfThisWeekNewVisitors);
	public List<ToBeVisited> findByNumberOfThisWeekNewVisitorsLessThan(int numberOfThisWeekNewVisitors);

	public List<ToBeVisited> findByNumberOfThisMonthVisitors(int numberOfThisMonthVisitors);
	public List<ToBeVisited> findByNumberOfThisMonthVisitorsGreaterThan(int numberOfThisMonthVisitors);
	public List<ToBeVisited> findByNumberOfThisMonthVisitorsLessThan(int numberOfThisMonthVisitors);
	
	public List<ToBeVisited> findByNumberOfThisMonthNewVisitors(int numberOfThisMonthNewVisitors);
	public List<ToBeVisited> findByNumberOfThisMonthNewVisitorsGreaterThan(int numberOfThisMonthNewVisitors);
	public List<ToBeVisited> findByNumberOfThisMonthNewVisitorsLessThan(int numberOfThisMonthNewVisitors);
	
	public List<ToBeVisited> findByNumberOfThisYearVisitors(int numberOfThisYearVisitors);
	public List<ToBeVisited> findByNumberOfThisYearVisitorsGreaterThan(int numberOfThisYearVisitors);
	public List<ToBeVisited> findByNumberOfThisYearVisitorsLessThan(int numberOfThisYearVisitors);

	public List<ToBeVisited> findByNumberOfThisYearNewVisitors(int numberOfThisYearNewVisitors);
	public List<ToBeVisited> findByNumberOfThisYearNewVisitorsGreaterThan(int numberOfThisYearNewVisitors);
	public List<ToBeVisited> findByNumberOfThisYearNewVisitorsLessThan(int numberOfThisYearNewVisitors);
}
