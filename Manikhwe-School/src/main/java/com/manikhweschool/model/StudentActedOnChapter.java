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
@Table(name = "STUDENT_ACTED_ON_PART")
@Component
public class StudentActedOnChapter extends PartChapterAction implements HttpSessionBindingListener, Cloneable, Serializable{

	private static final long serialVersionUID = -7102676249179992169L;

    @OneToOne
    @Autowired
	protected Chapter chapter;
    
    // @ManyToMany(mappedBy = "studentActedOnChapter")
    // protected Set<Student> students;
	
	public StudentActedOnChapter() {
		
		//students = new HashSet<Student>();
	}
	
	public StudentActedOnChapter(Chapter chapter,ToBeVisited toBeVisited, HashSet<Student> students) {
		super(0,toBeVisited);
		//this.students = students;
		this.chapter = chapter;
	}

	public Chapter getChapter() {
		return chapter;
	}
	
	@Override
	public boolean equals(Object object) {
		  
		Chapter newChapter = (Chapter)(object);
		
		return chapter.getChapterName().
		equals(newChapter.getChapterName());
	}
	/*
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	*/
	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
	/*
	public void addStudent(Student student) {
		students.add(student);
	}*/
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
