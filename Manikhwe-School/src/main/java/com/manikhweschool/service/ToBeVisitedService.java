package com.manikhweschool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.ToBeVisitedRepository;
import com.manikhweschool.model.ToBeVisited;

@Service
public class ToBeVisitedService {

	@Autowired
	private ToBeVisitedRepository repository;
	
	public Optional<ToBeVisited> findById(String id){
		return repository.findById(id);
	}
	
	public List<ToBeVisited> findAll(){
		return repository.findAll();
	}
	
	public void save(ToBeVisited toBeVisited) {
		repository.save(toBeVisited);
	}
	
	public void saveAll(List<ToBeVisited> toBeVisitedList) {
		repository.saveAll(toBeVisitedList);
	}
	
	public List<ToBeVisited> findByNumberOfTodayVisitors(int numberOfTodayVisitors){ return repository.findByNumberOfTodayVisitors(numberOfTodayVisitors);}
	public List<ToBeVisited> findByNumberOfTodayVisitorsGreaterThan(int numberOfTodayVisitors){ return repository.findByNumberOfTodayVisitorsGreaterThan(numberOfTodayVisitors);}
	public List<ToBeVisited> findByNumberOfTodayVisitorsLessThan(int numberOfTodayVisitors){ return repository.findByNumberOfTodayVisitorsLessThan(numberOfTodayVisitors);}
	
	public List<ToBeVisited> findByNumberOfTodayNewVisitors(int numberOfTodayNewVisitors){ return repository.findByNumberOfTodayNewVisitors(numberOfTodayNewVisitors);}
	public List<ToBeVisited> findByNumberOfTodayNewVisitorsGreaterThan(int numberOfTodayNewVisitors){ return repository.findByNumberOfTodayNewVisitorsGreaterThan(numberOfTodayNewVisitors);}
	public List<ToBeVisited> findByNumberOfTodayNewVisitorsLessThan(int numberOfTodayNewVisitors){ return repository.findByNumberOfTodayNewVisitorsLessThan(numberOfTodayNewVisitors);}
		
	public List<ToBeVisited> findByNumberOfThisWeekVisitors(int numberOfThisWeekVisitors){ return repository.findByNumberOfThisWeekVisitors(numberOfThisWeekVisitors);}
	public List<ToBeVisited> findByNumberOfThisWeekVisitorsGreaterThan(int numberOfThisWeekVisitors){ return repository.findByNumberOfThisWeekVisitorsGreaterThan(numberOfThisWeekVisitors);}
	public List<ToBeVisited> findByNumberOfThisWeekVisitorsLessThan(int numberOfThisWeekVisitors){ return repository.findByNumberOfThisWeekVisitorsLessThan(numberOfThisWeekVisitors);}
	
	public List<ToBeVisited> findByNumberOfThisWeekNewVisitors(int numberOfThisWeekNewVisitors){ return repository.findByNumberOfThisWeekNewVisitors(numberOfThisWeekNewVisitors);}
	public List<ToBeVisited> findByNumberOfThisWeekNewVisitorsGreaterThan(int numberOfThisWeekNewVisitors){ return repository.findByNumberOfThisWeekNewVisitorsGreaterThan(numberOfThisWeekNewVisitors);}
	public List<ToBeVisited> findByNumberOfThisWeekNewVisitorsLessThan(int numberOfThisWeekNewVisitors){ return repository.findByNumberOfThisWeekNewVisitorsLessThan(numberOfThisWeekNewVisitors);}

	public List<ToBeVisited> findByNumberOfThisMonthVisitors(int numberOfThisMonthVisitors){ return repository.findByNumberOfThisMonthVisitors(numberOfThisMonthVisitors);}
	public List<ToBeVisited> findByNumberOfThisMonthVisitorsGreaterThan(int numberOfThisMonthVisitors){ return repository.findByNumberOfThisMonthVisitorsGreaterThan(numberOfThisMonthVisitors);}
	public List<ToBeVisited> findByNumberOfThisMonthVisitorsLessThan(int numberOfThisMonthVisitors){ return repository.findByNumberOfThisMonthVisitorsLessThan(numberOfThisMonthVisitors);}
	
	public List<ToBeVisited> findByNumberOfThisMonthNewVisitors(int numberOfThisMonthNewVisitors){ return repository.findByNumberOfThisMonthNewVisitors(numberOfThisMonthNewVisitors);}
	public List<ToBeVisited> findByNumberOfThisMonthNewVisitorsGreaterThan(int numberOfThisMonthNewVisitors){ return repository.findByNumberOfThisMonthNewVisitorsGreaterThan(numberOfThisMonthNewVisitors);}
	public List<ToBeVisited> findByNumberOfThisMonthNewVisitorsLessThan(int numberOfThisMonthNewVisitors){ return repository.findByNumberOfThisMonthNewVisitorsLessThan(numberOfThisMonthNewVisitors);}
	
	public List<ToBeVisited> findByNumberOfThisYearVisitors(int numberOfThisYearVisitors){ return repository.findByNumberOfThisYearVisitors(numberOfThisYearVisitors);}
	public List<ToBeVisited> findByNumberOfThisYearVisitorsGreaterThan(int numberOfThisYearVisitors){ return repository.findByNumberOfThisYearVisitorsGreaterThan(numberOfThisYearVisitors);}
	public List<ToBeVisited> findByNumberOfThisYearVisitorsLessThan(int numberOfThisYearVisitors){ return repository.findByNumberOfThisYearVisitorsLessThan(numberOfThisYearVisitors);}

	public List<ToBeVisited> findByNumberOfThisYearNewVisitors(int numberOfThisYearNewVisitors){ return repository.findByNumberOfThisYearNewVisitors(numberOfThisYearNewVisitors);}
	public List<ToBeVisited> findByNumberOfThisYearNewVisitorsGreaterThan(int numberOfThisYearNewVisitors){ return repository.findByNumberOfThisYearNewVisitorsGreaterThan(numberOfThisYearNewVisitors);}
	public List<ToBeVisited> findByNumberOfThisYearNewVisitorsLessThan(int numberOfThisYearNewVisitors){return repository.findByNumberOfThisYearNewVisitorsLessThan(numberOfThisYearNewVisitors);}
	
	public ToBeVisitedRepository getRepository() {
		return repository;
	}
	public void setRepository(ToBeVisitedRepository repository) {
		this.repository = repository;
	}
}
