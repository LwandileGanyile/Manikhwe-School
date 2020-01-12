package com.manikhweschool.model;

import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nimbusds.openid.connect.sdk.claims.Gender;

@Entity
@Table(name = "INSTRUCTOR")
@Component
public class Instructor implements Serializable{
    
	private static final long serialVersionUID = -495772202044867561L;

	@Column(name = "Instructor_First_Name", nullable = false)
    private String instructorFirstName;
    
    @Column(name = "Instructor_Last_Name", nullable = false)
    private String instructorLastName;
    
    @Column(name = "Instructor_Email", nullable = false)
    private String instructorEmail;
    
    @Column(name = "Gender", nullable = false)
    private String instructorGender;
    
    @Id
    @Column(name = "Instructor_Mobile_Number", nullable = false)
    private String instructorMobileNumber;
    
    @Column(name = "Instructor_Joining_Date", nullable = false)
    private Date joiningDate;
    
    @Embedded
    @Autowired
    private InstructorAddress address;
    
    @ManyToOne
    @Autowired
    private Book book;
    
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "Instructor_Mobile_Number"),
    inverseJoinColumns = @JoinColumn(name = "Exercise_Number"))
    private Collection<Exercise> answeredExercises;
    
    public Instructor() throws FileNotFoundException{
    
        instructorFirstName = "Lwandile";
        instructorLastName = "Ganyile";
        
        instructorEmail = "ganyile@yahoo.com";
        instructorMobileNumber = "0717572711"; 
        // Date is depreciated.
        joiningDate = new Date();
        answeredExercises = new ArrayList<>();
        
    }
    
    public Instructor(String instructorFirstName, 
    String instructorLastName, Gender instructorGender,
    String instructorEmail, String instructorMobileNumber, 
    InstructorAddress address,Book book){
    
        setInstructorFirstName(instructorFirstName);
        setInstructorLastName(instructorLastName);
        setInstructorEmail(instructorEmail);
        setInstructorMobileNumber(instructorMobileNumber);
        setBook(book);
        
    }
    
    public Instructor(Date joiningDate,String instructorFirstName, 
    String instructorLastName, Gender instructorGender,String instructorEmail, 
    String instructorMobileNumber, Book book, InstructorAddress address,
    Collection<Exercise> exercises){
    	this(instructorFirstName, 
        instructorLastName, instructorGender,
        instructorEmail, instructorMobileNumber, 
        address,book);
    	
    	this.joiningDate = joiningDate;
    	exercises = new HashSet<>();
    }
    
    public void addLesson() {
    	
    }
    
    public Book getBook() {return book;}

	public void setBook(Book book) {this.book = book;}

    public void setInstructorFirstName(String instructorFirstName){ this.instructorFirstName = instructorFirstName;}
    
    public void setInstructorLastName(String instructorLastName){ this.instructorLastName = instructorLastName;}

    public void setInstructorEmail(String instructorEmail){ this.instructorEmail = instructorEmail;}

    public void setInstructorMobileNumber(String instructorMobileNumber){ this.instructorMobileNumber = instructorMobileNumber;}

    public String getInstructorFirstName(String instructorFirstName){ return instructorFirstName;}

    public String getInstructorLastName(String instructorLastName){ return instructorLastName;}

    public String getInstructorEmail(String instructorEmail){ return instructorEmail;}

    public String getInstructorMobileNumber(String instructorMobileNumber){ return instructorMobileNumber;}

	public InstructorAddress getAddress() {
		return address;
	}

	public void setAddress(InstructorAddress address) {
		this.address = address;
	}
	
	public Collection<Exercise> getAnsweredExercises() {
		return answeredExercises;
	}

	public void setAnsweredExercises(Collection<Exercise> answeredExercises) {
		this.answeredExercises = answeredExercises;
	}
	
	public String getInstructorFirstName() {
		return instructorFirstName;
	}

	public String getInstructorLastName() {
		return instructorLastName;
	}

	public String getInstructorEmail() {
		return instructorEmail;
	}

	public String getInstructorMobileNumber() {
		return instructorMobileNumber;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public Gender getGender() {
		return instructorGender.equalsIgnoreCase("male")?Gender.MALE:Gender.FEMALE;
	}

	public void setGender(Gender gender) {
		this.instructorGender = (gender==Gender.MALE)?"Male":"Female";
	}
    
    public void addAnsweredExercise(Exercise exercise) {
    	
    	answeredExercises.add(exercise);
    }
}
