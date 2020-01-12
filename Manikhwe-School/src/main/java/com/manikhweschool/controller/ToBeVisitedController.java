package com.manikhweschool.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.manikhweschool.model.ToBeVisited;
import com.manikhweschool.service.ToBeVisitedService;

@Controller
public class ToBeVisitedController {

	@Autowired
	private ToBeVisitedService service;
	
	public List<ToBeVisited> findByNumberOfTodayVisitors(int numberOfTodayVisitors){
		return service.findByNumberOfTodayVisitors(numberOfTodayVisitors);
	}
	public List<ToBeVisited> findByNumberOfTodayVisitorsGreaterThan(int numberOfTodayVisitors){
		return service.findByNumberOfTodayVisitorsGreaterThan(numberOfTodayVisitors);
	}
	public List<ToBeVisited> findByNumberOfTodayVisitorsLessThan(int numberOfTodayVisitors){
		return service.findByNumberOfTodayVisitorsLessThan(numberOfTodayVisitors);
	}
	
	public List<ToBeVisited> findByNumberOfTodayNewVisitors(int numberOfTodayNewVisitors){
		return service.findByNumberOfTodayNewVisitors(numberOfTodayNewVisitors);
	}
	public List<ToBeVisited> findByNumberOfTodayNewVisitorsGreaterThan(int numberOfTodayNewVisitors){
		return service.findByNumberOfTodayNewVisitorsGreaterThan(numberOfTodayNewVisitors);
	}
	public List<ToBeVisited> findByNumberOfTodayNewVisitorsLessThan(int numberOfTodayNewVisitors){
		return service.findByNumberOfTodayNewVisitorsLessThan(numberOfTodayNewVisitors);
	}
		
	public List<ToBeVisited> findByNumberOfThisWeekVisitors(int numberOfThisWeekVisitors){
		return service.findByNumberOfThisWeekVisitors(numberOfThisWeekVisitors);
	}
	public List<ToBeVisited> findByNumberOfThisWeekVisitorsGreaterThan(int numberOfThisWeekVisitors){
		return service.findByNumberOfThisWeekVisitorsGreaterThan(numberOfThisWeekVisitors);
	}
	public List<ToBeVisited> findByNumberOfThisWeekVisitorsLessThan(int numberOfThisWeekVisitors){
		return service.findByNumberOfThisWeekVisitorsLessThan(numberOfThisWeekVisitors);
	}
	
	public List<ToBeVisited> findByNumberOfThisWeekNewVisitors(int numberOfThisWeekNewVisitors){
		return service.findByNumberOfThisWeekNewVisitors(numberOfThisWeekNewVisitors);
	}
	public List<ToBeVisited> findByNumberOfThisWeekNewVisitorsGreaterThan(int numberOfThisWeekNewVisitors){
		return service.findByNumberOfThisWeekNewVisitorsGreaterThan(numberOfThisWeekNewVisitors);
	}
	public List<ToBeVisited> findByNumberOfThisWeekNewVisitorsLessThan(int numberOfThisWeekNewVisitors){
		return service.findByNumberOfThisWeekNewVisitorsLessThan(numberOfThisWeekNewVisitors);
	}

	public List<ToBeVisited> findByNumberOfThisMonthVisitors(int numberOfThisMonthVisitors){
		return service.findByNumberOfThisMonthVisitors(numberOfThisMonthVisitors);
	}
	public List<ToBeVisited> findByNumberOfThisMonthVisitorsGreaterThan(int numberOfThisMonthVisitors){
		return service.findByNumberOfThisMonthVisitorsGreaterThan(numberOfThisMonthVisitors);
	}
	public List<ToBeVisited> findByNumberOfThisMonthVisitorsLessThan(int numberOfThisMonthVisitors){
		return service.findByNumberOfThisMonthVisitorsLessThan(numberOfThisMonthVisitors);
	}
	
	public List<ToBeVisited> findByNumberOfThisMonthNewVisitors(int numberOfThisMonthNewVisitors){
		return service.findByNumberOfThisMonthNewVisitors(numberOfThisMonthNewVisitors);
	}
	public List<ToBeVisited> findByNumberOfThisMonthNewVisitorsGreaterThan(int numberOfThisMonthNewVisitors){
		return service.findByNumberOfThisMonthNewVisitorsGreaterThan(numberOfThisMonthNewVisitors);
	}
	public List<ToBeVisited> findByNumberOfThisMonthNewVisitorsLessThan(int numberOfThisMonthNewVisitors){
		return service.findByNumberOfThisMonthNewVisitorsLessThan(numberOfThisMonthNewVisitors);
	}
	
	public List<ToBeVisited> findByNumberOfThisYearVisitors(int numberOfThisYearVisitors){
		return service.findByNumberOfThisYearVisitors(numberOfThisYearVisitors);
	}
	public List<ToBeVisited> findByNumberOfThisYearVisitorsGreaterThan(int numberOfThisYearVisitors){
		return service.findByNumberOfThisYearVisitorsGreaterThan(numberOfThisYearVisitors);
	}
	public List<ToBeVisited> findByNumberOfThisYearVisitorsLessThan(int numberOfThisYearVisitors){
		return service.findByNumberOfThisYearVisitorsLessThan(numberOfThisYearVisitors);
	}

	public List<ToBeVisited> findByNumberOfThisYearNewVisitors(int numberOfThisYearNewVisitors){
		return service.findByNumberOfThisYearNewVisitors(numberOfThisYearNewVisitors);
	}
	public List<ToBeVisited> findByNumberOfThisYearNewVisitorsGreaterThan(int numberOfThisYearNewVisitors){
		return service.findByNumberOfThisYearNewVisitorsGreaterThan(numberOfThisYearNewVisitors);
	}
	public List<ToBeVisited> findByNumberOfThisYearNewVisitorsLessThan(int numberOfThisYearNewVisitors){
		return service.findByNumberOfThisYearNewVisitorsLessThan(numberOfThisYearNewVisitors);
	}
	
	public Optional<ToBeVisited> findById(String id){
		return service.findById(id);
	}
	
	public List<ToBeVisited> findAll(){
		return service.findAll();
	}
	
	public void save(ToBeVisited toBeVisited) {
		service.save(toBeVisited);
	}
	
	public void saveAll(List<ToBeVisited> toBeVisitedList) {
		service.saveAll(toBeVisitedList);
	}
}
