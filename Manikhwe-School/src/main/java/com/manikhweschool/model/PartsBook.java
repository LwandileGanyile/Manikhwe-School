package com.manikhweschool.model;

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

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "PARTS_BOOK")
@Component
@Primary
public class PartsBook extends Book implements Serializable{
    
	private static final long serialVersionUID = -6239092479830375L;

	@ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "Book_ISBN"),
    inverseJoinColumns = @JoinColumn(name = "Part_Number"))
    private Collection<Part> parts;
    
    public PartsBook() throws FileNotFoundException{      
        parts = new LinkedHashSet<>();   
    }
    
    public PartsBook(String title, String author, int publishedYear,
    String pdfLocation, byte edition, boolean isLatestVersion,
    Collection<Part> parts, String isbn) {
    	super(title, author, publishedYear, pdfLocation, 
    	edition, isLatestVersion, isbn);
    	setParts(parts);
    }

    public Collection<Part> getParts(){ return parts;}
    public void setParts(Collection<Part> parts){ this.parts = parts;}
    
    public void addPart(Part part) {
    	
    	if(!parts.contains(part))
    		parts.add(part);
    } 
}
