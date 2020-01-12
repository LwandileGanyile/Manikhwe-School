package com.manikhweschool.model;

import java.io.FileNotFoundException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "SECTION")
@Component
// The class is incomplete.
public class Section {
	
	@Column(name = "Technology", nullable = false)
    private String technology;
	
	@Id
	@Column(name = "Section_Name", nullable = false)
	private String sectionName;
	
	//@ManyToMany(mappedBy = "sections")
	//private Collection<SectionsBook> books;
	
	public Section() throws FileNotFoundException {
		sectionName = "----";
		//books = new HashSet<SectionsBook>();
	}

	
	//public void setSectionsBooks(Collection<SectionsBook> books) {this.books = books;}
	
	//public Collection<SectionsBook> getSectionsBook() { return books;}

	public String getSectionName() {
		return sectionName;
	}

	/*
	public void addSectionBook(SectionsBook sectionBook) {
		books.add(sectionBook);
	}*/

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}


	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
}
