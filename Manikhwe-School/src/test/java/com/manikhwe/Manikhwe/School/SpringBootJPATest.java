package com.manikhwe.Manikhwe.School;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.manikhweschool.book.java.model.JavaExercise;


public class SpringBootJPATest {
     
    @Autowired
    private GenericEntityController genericEntityController;
    
    @Autowired
	JavaExercise exercise;
    
    @Test
	void contextLoads() {
    	
    	System.out.println("Saving All GenericEntity entities.");
    	genericEntityController.saveAll();
    	System.out.println("\nRetieving All GenericEntity entities.");
    	 
    	List<GenericEntity> entities = genericEntityController.findAll();
    	
    	for(GenericEntity entity : entities)
    		System.out.println("ID : " + entity.getId() + "\tVALUE : " + entity.getValue());
    	
    	/*
    	JavaExercise exerciseEntity = exerciseController.save(exercise);
    	Optional<JavaExercise> foundedExerciseEntity = 
    	  exerciseController.findById(exerciseEntity.getExerciseNumber());
    	    	         
    	assertNotNull(foundedExerciseEntity);
    	assertEquals(exerciseEntity.getExerciseNumber(), foundedExerciseEntity.get().getExerciseNumber());
    	*/
    }
}
