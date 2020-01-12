package com.manikhweschool.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikhweschool.model.PartsBook;

@Repository
public interface PartsBookRepository extends JpaRepository<PartsBook,String>{

	public List<PartsBook> findByTitle(String title);
	public List<PartsBook> findByAuthor(String author);
	public List<PartsBook> findByIsLatestVersion(boolean isLatestVersion);
	
	public List<PartsBook> findByPublishedYear(int publishedYear);
	public List<PartsBook> findByPublishedYearGreaterThan(int publishedYear);
	public List<PartsBook> findByPublishedYearLessThan(int publishedYear);
}
