package com.manikhweschool.model;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import javax.persistence.JoinColumn;

@Entity
@Table(name = "EXERCISE_VIDEO_ALBUM")
@Inheritance(strategy = InheritanceType.JOINED)
@Component
public class ExerciseVideoAlbum implements Cloneable{
    
	@Column(name = "Technology", nullable = false)
    private String technology;
	
    // Key : Exercise Number Value : number of solutions.
	//nResearch needed
	@ElementCollection
    @CollectionTable(name = "Exercise_Solutions_Mapping", 
      joinColumns = {@JoinColumn(name = "Album_Number", referencedColumnName = "Exercise_Album_Number")})
    @MapKeyColumn(name = "Exercise_Number")
    @Column(name = "Number_Of_Solutions")
    protected Map<String,Byte> numberOfSolutions;
    
	@Id
	@Column(name = "Exercise_Album_Number", nullable = false)
	// JAVA ALBUMS START WITH JAVA_ALBUM_ AND THEN THE CHAPTER NUMBER IN WORDS.
	protected String albumNumber;
	
	@OneToMany
	protected Collection<Exercise> album;
    
    public ExerciseVideoAlbum(){
    	
    	numberOfSolutions = new LinkedHashMap<>();
    	album = new LinkedHashSet<>();
    	albumNumber = "-----";
    	technology = "----";
    }

	public Map<String, Byte> getNumberOfSolutions() {
		return numberOfSolutions;
	}
	
	public void addNumberOfSolutions(String exercise, byte numberOfSolutions) {
		
		if(!this.numberOfSolutions.containsKey(exercise))
			this.numberOfSolutions.put(exercise, numberOfSolutions);
	}

	public void setNumberOfSolutions(Map<String, Byte> numberOfSolutions) {
		this.numberOfSolutions = numberOfSolutions;
	}

	public String getAlbumNumber() {
		return albumNumber;
	}
	
	public void setAlbumNumber(String albumNumber) {
		this.albumNumber = albumNumber;
	}
	
	public Collection<Exercise> getAlbum() {
		return album;
	}

	public void setAlbum(Collection<Exercise> album) {
		this.album = album;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
}
