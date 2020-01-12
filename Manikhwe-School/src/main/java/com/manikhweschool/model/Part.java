package com.manikhweschool.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "PART")
@Component
public class Part implements Serializable, Cloneable{

	private static final long serialVersionUID = -8305735662694415350L;

	@Column(name = "Technology", nullable = false)
    private String technology;
	
	@Id
	@Column(name = "Part_Number", nullable = false)
	private int partNumber;

    @OneToMany (mappedBy = "part")
	private Collection<Chapter> chapters;
    
    //@OneToMany
    //@Autowired
    //private Collection<StudentActedOnPart> studentActedOnParts;
	
	public Part() {
		partNumber = -1;
		chapters = new LinkedHashSet<>();
		technology = "-----";
	}
	
	public Part(int partNumber, LinkedHashSet<Chapter> chapters, StudentActedOnPart studentActedOnPart) {
		this.chapters = chapters;
		this.partNumber = partNumber;
		technology = "-----";
	}

	public int getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}

	public Collection<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(LinkedHashSet<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	public void addChapter(Chapter chapter) {
		if(chapters == null) {
			chapters = new HashSet<Chapter>();
			System.out.println("chapters collection was initially null."
			+ "\nSo, a new collection is created.");
		}
		
		chapters.add(chapter);
	}
	
	public void setChapters(Collection<Chapter> chapters) {
		this.chapters = chapters;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public boolean equals(Object object){
		return ((Part)object).getPartNumber()==partNumber;
	}
}
