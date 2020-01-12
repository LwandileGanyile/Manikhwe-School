package com.manikhweschool.book.java;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manikhweschool.model.Part;
import com.manikhweschool.model.PartsBook;

@Component
public class JavaPartsBook implements com.manikhweschool.book.Readable{

	@Autowired
	private PartsBook partsBook;
	
	@Autowired
	private JavaPartOne javaPartOne;
	
	
	public JavaPartsBook(){
	        
		
	}
	      
	public PartsBook getPartsBook() {
		return partsBook;
	}
	
	public void setJavaPartOne(JavaPartOne javaPartOne) {
		this.javaPartOne = javaPartOne;
	}

	public void setPartsBook(PartsBook partsBook) {
		this.partsBook = partsBook;
	}
	
	public JavaPart getJavaPart(PartName partName) {
		
		if(partName == PartName.Fundamentals_Of_Programming)
			return javaPartOne;
		
		
		return null;
	}
	
	@Override
	public void createBuildingBlock() throws CloneNotSupportedException {
	    
	    // Other parts are not yet implemented.	
		Part partOne = javaPartOne.getPart();
		partsBook.addPart(partOne);
	    partsBook.setTechnology("Java");
	}
}
