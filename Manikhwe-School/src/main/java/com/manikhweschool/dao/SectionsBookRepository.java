package com.manikhweschool.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manikhweschool.model.SectionsBook;

@Repository
public interface SectionsBookRepository extends JpaRepository<SectionsBook, String>{

	public List<SectionsBook> findByTitle(String title);
	public List<SectionsBook> findByAuthor(String author);
	public List<SectionsBook> findByIsLatestVersion(boolean isLatestVersion);
	
	public List<SectionsBook> findByPublishedYear(int publishedYear);
	public List<SectionsBook> findByPublishedYearGreaterThan(int publishedYear);
	public List<SectionsBook> findByPublishedYearLessThan(int publishedYear);
}
