package com.manikhweschool.model;

import com.manikhweschool.model.Book;


import java.io.FileNotFoundException;
import java.io.Serializable;

import java.util.LinkedHashSet;
import java.util.Collection;

// I know some text books don't have parts, they have sections.
// I decided to assume all java books have parts for starters.
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "SECTIONS_BOOK")
@Component
public class SectionsBook extends Book implements Serializable{
    
	private static final long serialVersionUID = -6239092479830375L;
    
	@Autowired
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "Book_ISBN"),
    inverseJoinColumns = @JoinColumn(name = "Section_Name"))	
    private Collection<Section> sections;
    
    public SectionsBook() throws FileNotFoundException{
       
    	sections = new LinkedHashSet<>();
        
    }
    
    public SectionsBook(String title, String author, int publishedYear, 
    String pdfLocation, byte edition, boolean isLatestVersion,
    Collection<Section> sections, String isbn) {
    	super(title, author, publishedYear, pdfLocation, 
    	edition, isLatestVersion,isbn);
    	setSections(sections);
    }
    
    public Collection<Section> getSections(){ return sections;}
    public void setSections(Collection<Section> sections){ this.sections = sections;} 

    public void addSection(Section section) {
    	
    	if(!sections.contains(section))
    		sections.add(section);
    }
}
