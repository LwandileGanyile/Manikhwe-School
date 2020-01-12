package com.manikhweschool.book.java;

import org.springframework.beans.factory.annotation.Autowired;

import com.manikhweschool.model.Part;

public  abstract class JavaPart implements com.manikhweschool.book.Readable{

	@Autowired
	protected Part part;
	
	protected PartName partName;
	
	protected JavaPart() {
		
	}
	
	public Part getPart() {
		return part;
	}
	
	public PartName getPartName() {
		return partName;
	}

	public void setPartName(PartName partName) {
		this.partName = partName;
	}
}
