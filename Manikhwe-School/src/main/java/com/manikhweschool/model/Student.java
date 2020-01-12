package com.manikhweschool.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import com.manikhweschool.controller.StudentController;
import com.nimbusds.openid.connect.sdk.claims.Gender;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Table(name = "STUDENT")
@Inheritance(strategy = InheritanceType.JOINED)
@Component
public class Student implements Serializable{

	private static final long serialVersionUID = -3260535014484825041L;

    @Column(name = "Student_First_Name", nullable = false)
    private String firstName;
	
    @Column(name = "Student_last_Name", nullable = false)
    private String lastName;
	
    @Column(name = "Student_Password", nullable = false)
    private String password;
	
    @Id
	@Column(name = "Student_Email", nullable = false)
    private String email;
    
    @Column(name = "Guardian_Email", nullable = false)
    private String guardianEmail;

    @Column(name = "Sign_For_Updates", nullable = false)
    private String signedForUpdates;
	
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Student_Joined_Date", nullable = false)
    private Date joinedDate;
    
    @Column(name = "Gender", nullable = false)
    private String gender;
    
    @ElementCollection
    private Collection<String> courses;
	
	// Used to store a pair of exercises and the it's rated values;	
    @ManyToMany
    @JoinTable(name = "STUDENT_RATE_EXERCISE_BRIDGE",
    joinColumns = @JoinColumn(name = "Student_Email"),
    inverseJoinColumns = @JoinColumn(name = "Exercise"))
    /* Problem Exercise is an entity, so I don't know whether 
     * to use Exercise or Exercise Number for the inverse column name.
     */
    private Set<StudentRatedExercise> ratedExercises;
			
	// Used to store the pair of an exercises and the number of times they are shared.
    @ManyToMany
    @JoinTable(name = "STUDENT_SHARE_EXERCISE_BRIDGE",
    joinColumns = @JoinColumn(name = "Student_Email"),
    inverseJoinColumns = @JoinColumn(name = "Exercise"))
    /* Problem Exercise is an entity, so I don't know whether 
     * to use Exercise or Exercise Number for the inverse column name.
     */
    private Collection<StudentSharedExercise> sharedExercises;
	
    @ManyToMany
    @JoinTable(name = "STUDENT_PART_ACTION_BRIDGE",
    joinColumns = @JoinColumn(name = "Student_Email"),
    inverseJoinColumns = @JoinColumn(name = "Part"))
    /* Problem Part is an entity, so I don't know whether 
     * to use Part or Part Number for the inverse column name.
     */
    private Set<StudentActedOnPart> studentActedOnPart;
    
    @ManyToMany
    @JoinTable(name = "STUDENT_CHAPTER_ACTION_BRIDGE",
    joinColumns = @JoinColumn(name = "Student_Email"),
    inverseJoinColumns = @JoinColumn(name = "Chapter"))
    /* Problem Chapter is an entity, so I don't know whether 
     * to use Chapter or Exercise Number for the inverse column name.
     */
    private Set<StudentActedOnChapter> studentActedOnChapter;
	
	public Student() {
		
		firstName = "Lwandile";
		lastName = "Ganyile";
		gender = "Male";
		password = "qwerty321";
		email = "ganyile@gmail.com";
		signedForUpdates = "Yes";
		initializeRatingAndSharingCollections();
	}
	
	public Student(String firstName, 
	String lastName, Gender gender,String password, 
	String email, String guardianEmail,boolean signedForUpdates) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.guardianEmail = guardianEmail;
		this.signedForUpdates = (signedForUpdates)?"Yes":"No";
		initializeRatingAndSharingCollections();
	}
	
	// Initialize the data structures holding rated and shared exercises and lessons.
	private void initializeRatingAndSharingCollections() {
		ratedExercises = new HashSet<>();
		sharedExercises = new HashSet<>();
	}
	
	// Retrieve first name for this user.
	public String getFirstName() {
		return firstName;
	}

	// Change first name for this user.
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Retrieve last name for this user.
	public String getLastName() {
		return lastName;
	}

	// Change last name for this user.
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Retrieve password for this user.
	public String getPassword() {
		return password;
	}

	// Change password for this user.
	public void setPassword(String password) {
		this.password = password;
	}

	// Retrieve the email address of this user.
	public String getEmail() {
		return email;
	}

	// Change the email address of this user.
	public void setEmail(String email) {
		this.email = email;
	}

	// Return the date this user registered became a member.
	public Date getJoinedDate() {
		return joinedDate;
	}
		
	// Retrieve a value determining whether or not a user is signed for updates.
	public String getSignedForUpdates() {
		return signedForUpdates;
	}
	
	public Set<StudentRatedExercise> getRatedExercises() {
		return ratedExercises;
	}

	public void setRatedExercises(Set<StudentRatedExercise> ratedExercises) {
		this.ratedExercises = ratedExercises;
	}
	
	public Collection<StudentSharedExercise> getSharedExercises() {
		return sharedExercises;
	}

	public void setSharedExercises(Set<StudentSharedExercise> sharedExercises) {
		this.sharedExercises = sharedExercises;
	}
		
	public Gender getGender() {
		return gender.equalsIgnoreCase("male")?Gender.MALE:Gender.FEMALE;
	}

	public void setGender(Gender gender) {
		this.gender = (gender==Gender.MALE)?"Male":"Female";
	}

	// Remove all rated exercises.
	public void removeRatedExercises() {
		ratedExercises.clear();
	}
	
	// Remove all shared exercises.
	public void removeSharedExercises() {
		sharedExercises.clear();
	}
			
	public void setSignedForUpdates(String signedForUpdates) {
		this.signedForUpdates = signedForUpdates;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	// Add new rated exercise or update and existing one by stating whether this user liked it.
		public void addRatedExercise(Exercise exercise,  ToBeVisited toBeVisited,boolean watchedAndFinished,Boolean videoExerciseLiked) throws Exception 
		{
			
			boolean exerciseFound = false;
			Exercise someExercise;
				
			for(StudentRatedExercise ratedExercise : ratedExercises) {
				someExercise = ratedExercise.getExercise();
				if(someExercise.getExerciseNumber().equals(exercise.getExerciseNumber())) {
					exerciseFound = true;
					ratedExercise.setVideoExerciseLiked(videoExerciseLiked);
					break;
				}
			}
			if(!exerciseFound)
				ratedExercises.add(new StudentRatedExercise(exercise, toBeVisited, watchedAndFinished?"Yes":"No",videoExerciseLiked));
		}
			
		// Add new shared exercise or update and existing one by increasing it number of sharing.
		public void addSharedExercise(Exercise exercise, ToBeVisited toBeVisited, String watchedAndFinished,int videoExerciseNumberOfSharing) 
		{
			
			boolean exerciseFound = false;
			Exercise someExercise;
				
			for(StudentSharedExercise sharedExercise : sharedExercises) {
				someExercise =sharedExercise.getExercise();
				if(!someExercise.getExerciseNumber().equals(exercise.getExerciseNumber())) {
	             } 
				else {
	                 exerciseFound = true;
	                 sharedExercise.increaseVideoNumberOfSharing();
					break;
	           }
			}
			if(!exerciseFound)
				sharedExercises.add(new StudentSharedExercise(exercise, toBeVisited, watchedAndFinished, videoExerciseNumberOfSharing));
			
		}

	

	public String getGuardianEmail() {
			return guardianEmail;
		}

		public void setGuardianEmail(String guardianEmail) {
			this.guardianEmail = guardianEmail;
		}

	public Collection<String> getCaurses() {
		return courses;
	}

	public void setCaurses(Collection<String> courses) {
		this.courses = courses;
	}
	
	public void addCaurse(Course course) {
		
		if(course == Course.Introduction_To_Java_Programming)
			courses.add("Introduction To Java Programming");	
	}
	
	public String processStudentRegistration(){
        
        if(!StudentController.studentExist(this)) return "Confirm_Registration";
        else return "";
            
    }
	
	@Override
	public boolean equals(Object object) {
		
		return email.equals(((Student)object).getEmail());
	}
	
	public boolean doPasswordsMatch(String confirmationEmail){ return email.equals(confirmationEmail);} 
    
	public String processStudentLogin(){
        
        if(StudentController.studentExist(this)) {
            return "index";
        }
        else
            return "";
    }
}

