package com.manikhweschool.book;

import java.io.FileNotFoundException;

import com.manikhweschool.book.java.model.JavaExercise;

public interface ReadableChapter {  
    
    public <T extends JavaExercise> void createBuildingBlock(T exercise)throws CloneNotSupportedException, FileNotFoundException;
}
