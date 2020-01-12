package com.manikhweschool.book.java.model;

import com.manikhweschool.book.java.part.five.PartFiveChapter;
import com.manikhweschool.book.java.part.four.PartFourChapter;
import com.manikhweschool.book.java.part.one.PartOneChapter;
import com.manikhweschool.book.java.part.three.PartThreeChapter;
import com.manikhweschool.book.java.part.two.PartTwoChapter;
import com.manikhweschool.model.Chapter;
import com.manikhweschool.model.StudentActedOnChapter;
import com.manikhweschool.model.ToBeVisited;

public class JavaChapterMapping {
	
	
	public static void mapJavaChapterName(Chapter chapter,PartOneChapter name) {
		
		String chapterName;
		
		switch(name) {
		case Introduction_To_Computers_Programs_And_Java:
			chapterName = "Introduction To Computers Programs And Java";
			break;
		case Elementary_Programming:
			chapterName = "Elementary Programming";
			break;
		case Selections:
			chapterName = "Selections";
			break;
		case Mathematical_Functions_Character_And_Strings:
			chapterName = "Mathematical Functions Character And Strings";
			break;
		case Loops:
			chapterName = "Loops";
			break;
		case Methods:
			chapterName = "Methods";
			break;
		case Single_Dimensional_Arrays:
			chapterName = "Single Dimensional Arrays";
			break;
		default:
			chapterName = "Multidimensional Arrays";
		}
		
		finilize(new Chapter(), chapterName);
	}
	
	public static void mapJavaChapterName(Chapter chapter,PartTwoChapter name) {
		
		String chapterName;
		
		switch(name) {
		case Objects_And_Classes:
			chapterName = "Objects And Classes";
			break;
		case Thinking_In_Objects:
			chapterName = "Thinking In Objects";
			break;
		case Inheritance_And_Polymorphism:
			chapterName = "Inheritance And Polymorphism";
			break;
		case Exception_Handling_And_Text_IO:
			chapterName = "Exception Handling And Text I/O";
			break;
		case Abstract_Classes_And_Interfaces:
			chapterName = "Abstract Classes And Interfaces";
			break;
		case Binary_IO:
			chapterName = "Binary/IO";
			break;

		default:
			chapterName = "Binary/IO";
		}
		
		finilize(chapter, chapterName);
	}
	
	public static void mapJavaChapterName(Chapter chapter,PartThreeChapter name) {
		
		String chapterName;
		
		switch(name) {
		case JavaFX_Basics:
			chapterName = "JavaFX Basics";
			break;
		case Event_Driven_Programming_And_Animations:
			chapterName = "Event Driven Programming And Animations";
			break;
		case JavaFX_Controls_And_Multimedia:
			chapterName = "JavaFX Controls And Multimedia";
			break;
		default:
			chapterName = "Advanced GUI Programming";
		}
		
		finilize(chapter, chapterName);
	}
	
	public static void mapJavaChapterName(Chapter chapter,PartFourChapter name) {
	
	String chapterName;
	
	switch(name) {
	case Recursion:
		chapterName = "Recursion";
		break;
	case Generics:
		chapterName = "Generics";
		break;
	case Lists_Stacks_Queues_And_Priority_Queues:
		chapterName = "Lists, Stacks, Queues And Priority Queues";
		break;
	case Sets_and_Maps:
		chapterName = "Sets and Maps";
		break;
	case Developing_Efficient_Algorithms:
		chapterName = "Developing Efficient Algorithms";
		break;
	case Sorting:
		chapterName = "Sorting";
		break;
	case Implementing_Lists_Stacks_Queues_And_Priority_Queues:
		chapterName = "Implementing Lists Stacks Queues And Priority Queues";
		break;
	case Binary_Search_Trees:
		chapterName = "Binary Search Trees";
		break;
	case AVL_Trees:
		chapterName = "AVL Trees";
		break;
	case Hashing:
		chapterName = "Hashing";
		break;
	case Graphs_And_Applications:
		chapterName = "Graphs And Applications";
		break;
	default:
		chapterName = "Weighted Graphs And Applications";
	}
	
	finilize(chapter, chapterName);
}

	public static void mapJavaChapterName(Chapter chapter,PartFiveChapter name) {
	
		String chapterName;
		
		switch(name) {
		case Multithreading_And_Parallel_Programming:
			chapterName = "Multithreading And Parallel Programming";
			break;
		case Networking:
			chapterName = "Networking";
			break;
		case Java_Database_Programming:
			chapterName = "Java Database Programming";
			break;
		default:
			chapterName = "Java Server Faces";
		}
		
		finilize(chapter, chapterName);
	}

	private static void finilize(Chapter chapter, String chapterName) {
		
		chapter.getExercises().clear();
		chapter.setCompleted(false);
		chapter.setChapterName(chapterName);
		chapter.setTechnology("Java");
		
		StudentActedOnChapter studentActedOnChapter = new StudentActedOnChapter();
		ToBeVisited toBeVisited = new ToBeVisited();

		studentActedOnChapter.setToBeVisited(toBeVisited);
	}
	
}
