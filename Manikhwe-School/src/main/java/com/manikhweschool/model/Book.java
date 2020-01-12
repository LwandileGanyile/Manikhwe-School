package com.manikhweschool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
@Inheritance(strategy = InheritanceType.JOINED)
public class Book{
    
	@Column(name = "Technology", nullable = false)
    protected String technology;
	
    @Column(name = "Book_Title", nullable = false)
    protected String title;
    
    @Column(name = "Book_Author", nullable = false)
    protected String author;
    
    @Column(name = "Book_Published_Year", nullable = false)
    protected int publishedYear;
    
    @Column(name = "Book_PDF_Location", nullable = false)
    protected String pdfLocation;
    
    @Column(name = "Book_Edition", nullable = false)
    protected byte edition;
    
    @Id
    @Column(name = "Book_ISBN", nullable = false)
    protected String isbn;
    
    @Column(name = "Lastest_Book_Edition", nullable = false)
    protected boolean isLatestVersion;
    
    public Book(){
    
        title = "Introduction To Java Programming";
        edition = 10;
        author = "Y. Daniel Liang";
        publishedYear = 2015;
        pdfLocation = ""; 
        isLatestVersion = false;
        technology = "Java";
        isbn = "978-0-13-376131-3";
    }
    
    public Book(String title, String author, 
    int publishedYear, String pdfLocation, 
    byte edition, boolean isLatestVersion,
    String isbn){
    
        this.author = author;
        this.title = title;
        this.edition = edition;
        this.publishedYear = publishedYear;
        this.pdfLocation = pdfLocation;
        this.isLatestVersion = isLatestVersion;
        this.isbn = isbn;
    }
    
    public void setIsLatestVersion(boolean isLatestVersion){ this.isLatestVersion = isLatestVersion;}

    public void setPDFLocation(String pdfLocation){ this.pdfLocation = pdfLocation;}

    public void setPublishdYear(int publishedYear){ this.publishedYear = publishedYear;}

    public void setEdition(byte edition){ this.edition = edition;}

    public void setAuthor(String author){this.author = author;}

    public void setTitle(String title){this.title = title;}

    public boolean isLatestVersion(){ return isLatestVersion;}

    public byte getEdition(){ return edition;}

    public String getPDFLocation(){ return pdfLocation;}

    public int getPublishedYear(){ return publishedYear;}

    public String getAuthor(){ return author;}

    public String getTitle(){ return title;}
    
    public String getISBN() { return isbn;}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
}

