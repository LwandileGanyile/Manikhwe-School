package com.manikhweschool.model;

import java.io.Serializable;
import java.util.HashSet;

import javax.servlet.http.HttpSessionBindingListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_ACTED_ON_CHAPTER")
@Component
public class StudentActedOnPart extends PartChapterAction implements HttpSessionBindingListener, Cloneable, Serializable{

	private static final long serialVersionUID = -6543754589284895678L;

    @OneToOne
    @Autowired
	private Part part;
    
    // @ManyToMany(mappedBy = "studentActedOnPart")
    // private Set<Student> students;
    
    //@ManyToOne
    //@Autowired
    //private Part part;
        
	public StudentActedOnPart() {
		
		//students = new HashSet<>();
	}
	
	public StudentActedOnPart(Part part, ToBeVisited toBeVisited, HashSet<Student> students) {
		super(0,toBeVisited);
		//this.students = students;
		this.part = part;
	}

	public Part getPart() {
		return part;
	}
	
	@Override
	public boolean equals(Object object) {
		
		Part newPart = (Part)(object);
		
		return part.getPartNumber()==(newPart.getPartNumber());
	}
	/*
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(HashSet<Student> students) {
		this.students = students;
	}
	*/
	public void setPart(Part part) {
		this.part = part;
	}
	/*
	public void setStudents(Set<Student> students) {
		this.students = students;
	}*/
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
