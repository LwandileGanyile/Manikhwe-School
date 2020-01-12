package com.manikhweschool.book.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manikhweschool.book.java.part.one.chapter.eight.ChapterEight;
import com.manikhweschool.book.java.part.one.chapter.five.ChapterFive;
import com.manikhweschool.book.java.part.one.chapter.four.ChapterFour;
import com.manikhweschool.book.java.part.one.chapter.one.ChapterOne;
import com.manikhweschool.book.java.part.one.chapter.seven.ChapterSeven;
import com.manikhweschool.book.java.part.one.chapter.six.ChapterSix;
import com.manikhweschool.book.java.part.one.chapter.three.ChapterThree;
import com.manikhweschool.book.java.part.one.chapter.two.ChapterTwo;
import com.manikhweschool.model.Chapter;
import com.manikhweschool.model.Exercise;

@Component
public class JavaPartOne extends JavaPart{
	
	@Autowired
	private ChapterOne chapterOne;	
	@Autowired
	private ChapterTwo chapterTwo;
	@Autowired
	private ChapterThree chapterThree;	
	@Autowired
	private ChapterFour chapterFour;
	@Autowired
	private ChapterFive chapterFive;	
	@Autowired
	private ChapterSix chapterSix;
	@Autowired
	private ChapterSeven chapterSeven;	
	@Autowired
	private ChapterEight chapterEight;
	
	public JavaPartOne(){
		partName = PartName.Fundamentals_Of_Programming;

	}
	
	@Override
	public void createBuildingBlock() {
		
		LinkedHashSet<Chapter> partOneChapters = new LinkedHashSet<>();

		partOneChapters.add(chapterOne.getChapter());
		partOneChapters.add(chapterTwo.getChapter());
		partOneChapters.add(chapterThree.getChapter()); 		
		partOneChapters.add(chapterFour.getChapter());
		partOneChapters.add(chapterFive.getChapter());
		partOneChapters.add(chapterSix.getChapter());
		partOneChapters.add(chapterSeven.getChapter());
		partOneChapters.add(chapterEight.getChapter());
	    
	    part.setChapters(partOneChapters);
	    part.setPartNumber(1);
	}

	public ChapterOne getChapterOne() {
		return chapterOne;
	}

	public void setChapterOne(ChapterOne chapterOne) {
		this.chapterOne = chapterOne;
	}

	public ChapterTwo getChapterTwo() {
		return chapterTwo;
	}

	public void setChapterTwo(ChapterTwo chapterTwo) {
		this.chapterTwo = chapterTwo;
	}

	public ChapterThree getChapterThree() {
		return chapterThree;
	}

	public void setChapterThree(ChapterThree chapterThree) {
		this.chapterThree = chapterThree;
	}

	public ChapterFour getChapterFour() {
		return chapterFour;
	}

	public void setChapterFour(ChapterFour chapterFour) {
		this.chapterFour = chapterFour;
	}

	public ChapterFive getChapterFive() {
		return chapterFive;
	}

	public void setChapterFive(ChapterFive chapterFive) {
		this.chapterFive = chapterFive;
	}

	public ChapterSix getChapterSix() {
		return chapterSix;
	}

	public void setChapterSix(ChapterSix chapterSix) {
		this.chapterSix = chapterSix;
	}

	public ChapterSeven getChapterSeven() {
		return chapterSeven;
	}

	public void setChapterSeven(ChapterSeven chapterSeven) {
		this.chapterSeven = chapterSeven;
	}

	public ChapterEight getChapterEight() {
		return chapterEight;
	}

	public void setChapterEight(ChapterEight chapterEight) {
		this.chapterEight = chapterEight;
	}
}
