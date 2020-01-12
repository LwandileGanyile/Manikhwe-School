package com.manikhweschool;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.manikhweschool.book.java.JavaPartOne;
import com.manikhweschool.book.java.JavaPartsBook;
import com.manikhweschool.book.java.PartName;
import com.manikhweschool.book.java.controller.JavaExerciseController;
import com.manikhweschool.book.java.controller.JavaPartsBookController;
import com.manikhweschool.book.java.model.ExerciseNumber;
import com.manikhweschool.book.java.model.JavaExercise;
import com.manikhweschool.book.java.part.one.chapter.eight.ChapterEight;
import com.manikhweschool.book.java.part.one.chapter.eight.ChapterEightExercise;
import com.manikhweschool.book.java.part.one.chapter.eight.ChapterEightExerciseAlbum;
import com.manikhweschool.book.java.part.one.chapter.five.ChapterFive;
import com.manikhweschool.book.java.part.one.chapter.five.ChapterFiveExercise;
import com.manikhweschool.book.java.part.one.chapter.five.ChapterFiveExerciseAlbum;
import com.manikhweschool.book.java.part.one.chapter.four.ChapterFour;
import com.manikhweschool.book.java.part.one.chapter.four.ChapterFourExercise;
import com.manikhweschool.book.java.part.one.chapter.four.ChapterFourExerciseAlbum;
import com.manikhweschool.book.java.part.one.chapter.one.ChapterOne;
import com.manikhweschool.book.java.part.one.chapter.one.ChapterOneExercise;
import com.manikhweschool.book.java.part.one.chapter.one.ChapterOneExerciseAlbum;
import com.manikhweschool.book.java.part.one.chapter.one.ChapterOneExerciseNumber;
import com.manikhweschool.book.java.part.one.chapter.seven.ChapterSeven;
import com.manikhweschool.book.java.part.one.chapter.seven.ChapterSevenExercise;
import com.manikhweschool.book.java.part.one.chapter.seven.ChapterSevenExerciseAlbum;
import com.manikhweschool.book.java.part.one.chapter.six.ChapterSix;
import com.manikhweschool.book.java.part.one.chapter.six.ChapterSixExercise;
import com.manikhweschool.book.java.part.one.chapter.six.ChapterSixExerciseAlbum;
import com.manikhweschool.book.java.part.one.chapter.three.ChapterThree;
import com.manikhweschool.book.java.part.one.chapter.three.ChapterThreeExercise;
import com.manikhweschool.book.java.part.one.chapter.three.ChapterThreeExerciseAlbum;
import com.manikhweschool.book.java.part.one.chapter.two.ChapterTwo;
import com.manikhweschool.book.java.part.one.chapter.two.ChapterTwoExercise;
import com.manikhweschool.book.java.part.one.chapter.two.ChapterTwoExerciseAlbum;
import com.manikhweschool.book.java.part.one.chapter.two.ChapterTwoExerciseNumber;
import com.manikhweschool.controller.ChapterController;
import com.manikhweschool.controller.PartController;
import com.manikhweschool.controller.PartsBookController;
import com.manikhweschool.controller.StudentActedOnChapterController;
import com.manikhweschool.controller.StudentActedOnPartController;
import com.manikhweschool.controller.StudentRatedExerciseController;
import com.manikhweschool.controller.StudentSharedExerciseController;
import com.manikhweschool.controller.ToBeVisitedController;
import com.manikhweschool.model.Chapter;
import com.manikhweschool.model.Exercise;
import com.manikhweschool.model.ExerciseVideoAlbum;
import com.manikhweschool.model.Instructor;
import com.manikhweschool.model.InstructorAddress;
import com.manikhweschool.model.Part;
import com.manikhweschool.model.PartsBook;
import com.manikhweschool.model.Section;
import com.manikhweschool.model.SectionsBook;
import com.manikhweschool.model.Student;
import com.manikhweschool.model.StudentActedOnChapter;
import com.manikhweschool.model.StudentActedOnPart;
import com.manikhweschool.model.StudentRatedExercise;
import com.manikhweschool.model.StudentSharedExercise;
import com.manikhweschool.model.ToBeVisited;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

import javax.faces.webapp.FacesServlet;

import javax.servlet.DispatcherType;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;


@SpringBootApplication
public class ManikhweSchoolApplication extends SpringBootServletInitializer implements CommandLineRunner{	
	
	public static void main(String[] args) {
		SpringApplication.run(ManikhweSchoolApplication.class, args);
	
	}

	@Bean
    public ServletRegistrationBean servletRegistrationBean() {
        FacesServlet servlet = new FacesServlet();
        return new ServletRegistrationBean(servlet, "*.jsf");
    }
	
	/*@Bean
    public FilterRegistrationBean rewriteFilter() {
        FilterRegistrationBean rwFilter = new FilterRegistrationBean(new RewriteFilter());
        rwFilter.setDispatcherTypes(EnumSet.of(DispatcherType.FORWARD, DispatcherType.REQUEST,
                DispatcherType.ASYNC, DispatcherType.ERROR));
        rwFilter.addUrlPatterns("/*");
        return rwFilter;
    }*/
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) { 
	  return app.sources(ManikhweSchoolApplication.class); 
	}
	
	/*It retrieves all the beans that were created either by your app 
	 * or were automatically added thanks to Spring Boot. It sorts them 
	 * and prints them out.*/
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");
            
            ArrayList<ToBeVisited> toBeVisited = new ArrayList<>();
            
            ArrayList<Exercise> exercises = new ArrayList<>();
            ArrayList<StudentRatedExercise> exercisesRated = new ArrayList<>();
            ArrayList<StudentSharedExercise> exercisesShared = new ArrayList<>();
            
            ArrayList<Chapter> chapters = new ArrayList<>();
            ArrayList<StudentActedOnChapter> studentActedOnChapters = new ArrayList<>();
            
            LinkedHashSet<Part> parts = new LinkedHashSet<>();
            ArrayList<StudentActedOnPart> studentActedOnParts = new ArrayList<>();
            
            buildJavaChapterOne(parts, studentActedOnParts, chapters, studentActedOnChapters, exercises, exercisesShared, exercisesRated, toBeVisited, ctx);
            /*buildJavaChapterTwo(chapters, ctx);
            buildJavaChapterThree(chapters, ctx);
            buildJavaChapterFour(chapters, ctx);
            buildJavaChapterFive(chapters, ctx);
            buildJavaChapterSix(chapters, ctx);
            buildJavaChapterSeven(chapters, ctx);
            buildJavaChapterEight(chapters, ctx);
            
            buildJavaPartOne(chapters, ctx);*/
            
            saveToBeVisited(toBeVisited, ctx);
 
            saveJavaParts(parts, ctx);
            saveJavaExercise(exercises,ctx);
            saveJavaChapters(chapters, ctx);
            saveStudentActedOnJavaPart(studentActedOnParts, ctx);
            saveStudentActedOnJavaChapter(studentActedOnChapters, ctx);
            
              
            saveStudentRatedJavaExercises(exercisesRated,ctx);
            saveStudentSharedJavaExercises(exercisesShared,ctx);
            
            
            System.out.println("Exercises List : " + exercises.size());
            System.out.println("Exercises Rated List : " + exercisesRated.size());
            System.out.println("Exercises Shared List : " + exercisesShared.size());
            
            System.out.println("Chapters List : " + chapters.size());
            System.out.println("Student Acted On Chapters List : " + studentActedOnChapters.size());
            
            System.out.println("Parts List : " + parts.size());
            System.out.println("Student Acted On Parts List : " + studentActedOnParts.size());
            
            System.out.println("To Be Visited List : " + toBeVisited.size());
            
        }; 
        
    }

	@Override
	public void run(String... args) throws Exception {
		
		/*
		int numberOfLikes = 1;
		
		// update 3rd January income(s) amount to 500
		Iterable<Exercise> exercises = exerciseController.findAll();
        exercises.forEach(exercise -> {
            exercise.dislikeVideo();
            exercise.setNumberOfLikes(10);
            exerciseController.save(exercise);
        });
		*/
	}
	
	
	private Exercise buildJavaExercise(ApplicationContext ctx) {
		
        Exercise exercise = (Exercise) ctx.getBean("exercise");

		return exercise;
	}
	
	
	private void buildJavaChapterOne(LinkedHashSet<Part> parts, ArrayList<StudentActedOnPart> studentActedOnParts, ArrayList<Chapter> chapters, ArrayList<StudentActedOnChapter> studentActedOnChapters, ArrayList<Exercise> exercises, ArrayList<StudentSharedExercise> exercisesShared, ArrayList<StudentRatedExercise> exercisesRated, ArrayList<ToBeVisited> data, ApplicationContext ctx) {
		
		ChapterOne chapterOne = (ChapterOne)ctx.getBean("chapterOne");
		ToBeVisited toBeVisited = (ToBeVisited) ctx.getBean("toBeVisited");

		Chapter chapter = chapterOne.getChapter();
		chapter.setChapterName("Introduction To Java Programming"); 
		chapter.setTechnology("Java");
		
		Part part = (Part) ctx.getBean("part");
		StudentActedOnPart studentActedOnPart = (StudentActedOnPart) ctx.getBean("studentActedOnPart");
		ToBeVisited toBeVisited1 = toBeVisited;
		
		try {
			toBeVisited1 = (ToBeVisited) (toBeVisited).clone();
		} catch (BeansException | CloneNotSupportedException e1) {
			e1.printStackTrace();
		}
		toBeVisited1.setDescription("Java Part One 2020");
		part.setPartNumber(1); 
		part.setTechnology("Java");
		studentActedOnPart.setPart(part);
		studentActedOnPart.setToBeVisited(toBeVisited1);
		chapter.setPart(part);
			
		ToBeVisited toBeVisited2 = toBeVisited;
		
		try {
			toBeVisited2 = (ToBeVisited) (toBeVisited).clone();
		} catch (BeansException | CloneNotSupportedException e1) {
			e1.printStackTrace();
		}
		
	    toBeVisited2.setDescription("Java Chapter One 2020"); 
		
		Exercise exercise = buildJavaExercise(ctx);
			 
		StudentActedOnChapter studentActedOnChapter = (StudentActedOnChapter) ctx.getBean("studentActedOnChapter");
		studentActedOnChapter.setChapter(chapter);
		studentActedOnChapter.setToBeVisited(toBeVisited2);
		
	    ChapterOneExercise chapterOneExercise = (ChapterOneExercise) ctx.getBean("chapterOneExercise"); 
	    chapterOneExercise.setExercise(exercise);    
	    chapterOne.setChapter(chapter);
		
	    try {
			chapterOne.createBuildingBlock(chapterOneExercise);
		} catch (FileNotFoundException | CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
	    ArrayList<Exercise> exercisesList = (ArrayList<Exercise>) chapterOne.getExercises();
	    
		for(Exercise ex : exercisesList) {
			ex.setChapter(chapter);
			buildJavaStudentActedOnExercise(exercisesShared, exercisesRated, data, ex, ctx);
			exercises.add(ex);
		}
		
		parts.add(part);
		data.add(toBeVisited1);
		data.add(toBeVisited2);
		studentActedOnChapters.add(studentActedOnChapter);
		studentActedOnParts.add(studentActedOnPart);
		chapters.add(chapter);
		
	}
			
	private void buildJavaChapterTwo(ArrayList<Chapter> chapters, ArrayList<StudentSharedExercise> exercisesShared, ArrayList<StudentRatedExercise> exercisesRated, ArrayList<ToBeVisited> data,ApplicationContext ctx) {
		
		ChapterTwo chapterTwo = (ChapterTwo)ctx.getBean("chapterTwo");
		
		//ChapterController chapterController = (ChapterController) ctx.getBean("chapterController");
		JavaExerciseController javaExerciseController = (JavaExerciseController) ctx.getBean("javaExerciseController");	
		ToBeVisitedController toBeVisitedController = (ToBeVisitedController)ctx.getBean("toBeVisitedController");
		StudentActedOnChapterController studentActedOnChapterController = (StudentActedOnChapterController)ctx.getBean("studentActedOnChapterController");
		
		Chapter chapter = chapterTwo.getChapter();			
		chapter.setChapterName("Elementary Programming"); 
		chapter.setTechnology("Java");
		//chapterController.save(chapter);
		chapters.add(chapter);
			
		ToBeVisited toBeVisited = (ToBeVisited) ctx.getBean("toBeVisited");
		toBeVisited.setDescription("Java Chapter Two 2020");
		toBeVisitedController.save(toBeVisited);
			
		Exercise exercise = buildJavaExercise(ctx);
			
		StudentActedOnChapter studentActedOnChapter = (StudentActedOnChapter) ctx.getBean("studentActedOnChapter");
		studentActedOnChapter.setChapter(chapter);
		studentActedOnChapter.setToBeVisited(toBeVisited);
		studentActedOnChapterController.save(studentActedOnChapter);
		
	    ChapterTwoExercise chapterTwoExercise = (ChapterTwoExercise) ctx.getBean("chapterTwoExercise"); 
	    chapterTwoExercise.setExercise(exercise);
		chapterTwo.setChapter(chapter);
		
		try {
			chapterTwo.createBuildingBlock(chapterTwoExercise);
		} catch (FileNotFoundException | CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		ArrayList<Exercise> exercises = (ArrayList<Exercise>) chapterTwo.getExercises();
	    
		javaExerciseController.saveAll(exercises);
		
		for(Exercise ex : exercises)
			buildJavaStudentActedOnExercise(exercisesShared, exercisesRated, data, ex, ctx);
		
	}
	
	
	private void buildJavaChapterThree(ArrayList<Chapter> chapters, ArrayList<StudentSharedExercise> exercisesShared, ArrayList<StudentRatedExercise> exercisesRated, ArrayList<ToBeVisited> data,ApplicationContext ctx) {
		
		ChapterThree chapterThree = (ChapterThree)ctx.getBean("chapterThree");
		
		//ChapterController chapterController = (ChapterController) ctx.getBean("chapterController");
		JavaExerciseController javaExerciseController = (JavaExerciseController) ctx.getBean("javaExerciseController");	
		ToBeVisitedController toBeVisitedController = (ToBeVisitedController)ctx.getBean("toBeVisitedController");
		StudentActedOnChapterController studentActedOnChapterController = (StudentActedOnChapterController)ctx.getBean("studentActedOnChapterController");
		
		
		Chapter chapter = chapterThree.getChapter();
		chapter.setChapterName("Selections"); 
		chapter.setTechnology("Java");
		//chapterController.save(chapter);
		chapters.add(chapter);
		
		ToBeVisited toBeVisited = (ToBeVisited) ctx.getBean("toBeVisited");
		toBeVisited.setDescription("Java Chapter Three 2020");
		toBeVisitedController.save(toBeVisited);
		
		Exercise exercise = buildJavaExercise(ctx);
		 
		StudentActedOnChapter studentActedOnChapter = (StudentActedOnChapter) ctx.getBean("studentActedOnChapter");
		studentActedOnChapter.setChapter(chapter);
		studentActedOnChapter.setToBeVisited(toBeVisited);
		studentActedOnChapterController.save(studentActedOnChapter);

        ChapterThreeExercise chapterThreeExercise = (ChapterThreeExercise) ctx.getBean("chapterThreeExercise"); 
        chapterThreeExercise.setExercise(exercise);
		chapterThree.setChapter(chapter); 
		
		try {
			chapterThree.createBuildingBlock(chapterThreeExercise);
		} catch (FileNotFoundException | CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		ArrayList<Exercise> exercises = (ArrayList<Exercise>) chapterThree.getExercises();
	    
		javaExerciseController.saveAll(exercises);
		
		for(Exercise ex : exercises)
			buildJavaStudentActedOnExercise(exercisesShared, exercisesRated, data, ex, ctx);
		
	}	
	
	
	private void buildJavaChapterFour(ArrayList<Chapter> chapters, ArrayList<StudentSharedExercise> exercisesShared, ArrayList<StudentRatedExercise> exercisesRated, ArrayList<ToBeVisited> data,ApplicationContext ctx) {
		
		ChapterFour chapterFour = (ChapterFour)ctx.getBean("chapterFour");
		
		//ChapterController chapterController = (ChapterController) ctx.getBean("chapterController");
		JavaExerciseController javaExerciseController = (JavaExerciseController) ctx.getBean("javaExerciseController");	
		ToBeVisitedController toBeVisitedController = (ToBeVisitedController)ctx.getBean("toBeVisitedController");
		StudentActedOnChapterController studentActedOnChapterController = (StudentActedOnChapterController)ctx.getBean("studentActedOnChapterController");
		
		Chapter chapter = chapterFour.getChapter();
		chapter.setChapterName("Mathematical Functions, Characters,and Strings"); 
		chapter.setTechnology("Java");
		//chapterController.save(chapter);
		chapters.add(chapter);
		
		ToBeVisited toBeVisited = (ToBeVisited) ctx.getBean("toBeVisited");
		toBeVisited.setDescription("Java Chapter Four 2020");
		toBeVisitedController.save(toBeVisited);
		
		Exercise exercise = buildJavaExercise(ctx);
		 
		StudentActedOnChapter studentActedOnChapter = (StudentActedOnChapter) ctx.getBean("studentActedOnChapter");
		studentActedOnChapter.setChapter(chapter);
		studentActedOnChapter.setToBeVisited(toBeVisited);
		studentActedOnChapterController.save(studentActedOnChapter);

        ChapterFourExercise chapterFourExercise = (ChapterFourExercise) ctx.getBean("chapterFourExercise"); 
        chapterFourExercise.setExercise(exercise);		
		chapterFour.setChapter(chapter); 
		
		try {
			chapterFour.createBuildingBlock(chapterFourExercise);
		} catch (FileNotFoundException | CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		ArrayList<Exercise> exercises = (ArrayList<Exercise>) chapterFour.getExercises();
	    
		javaExerciseController.saveAll(exercises);
		
		for(Exercise ex : exercises)
			buildJavaStudentActedOnExercise(exercisesShared, exercisesRated, data, ex, ctx);
	}
	
	
	private void buildJavaChapterFive(ArrayList<Chapter> chapters, ArrayList<StudentSharedExercise> exercisesShared, ArrayList<StudentRatedExercise> exercisesRated, ArrayList<ToBeVisited> data,ApplicationContext ctx) {
		
		ChapterFive chapterFive = (ChapterFive)ctx.getBean("chapterFive");
		
		//ChapterController chapterController = (ChapterController) ctx.getBean("chapterController");
		JavaExerciseController javaExerciseController = (JavaExerciseController) ctx.getBean("javaExerciseController");	
		ToBeVisitedController toBeVisitedController = (ToBeVisitedController)ctx.getBean("toBeVisitedController");
		StudentActedOnChapterController studentActedOnChapterController = (StudentActedOnChapterController)ctx.getBean("studentActedOnChapterController");
		
		Chapter chapter = chapterFive.getChapter();
		chapter.setChapterName("Loops"); 
		chapter.setTechnology("Java");
		//chapterController.save(chapter);
		chapters.add(chapter);
		
		ToBeVisited toBeVisited = (ToBeVisited) ctx.getBean("toBeVisited");
		toBeVisited.setDescription("Java Chapter Five 2020");
		toBeVisitedController.save(toBeVisited);
		
		Exercise exercise = buildJavaExercise(ctx);
		 
		StudentActedOnChapter studentActedOnChapter = (StudentActedOnChapter) ctx.getBean("studentActedOnChapter");
		studentActedOnChapter.setChapter(chapter);
		studentActedOnChapter.setToBeVisited(toBeVisited);
		studentActedOnChapterController.save(studentActedOnChapter);
		
        ChapterFiveExercise chapterFiveExercise = (ChapterFiveExercise) ctx.getBean("chapterFiveExercise"); 
        chapterFiveExercise.setExercise(exercise);
		chapterFive.setChapter(chapter); 
		
		try {
			chapterFive.createBuildingBlock(chapterFiveExercise);
		} catch (FileNotFoundException | CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		ArrayList<Exercise> exercises = (ArrayList<Exercise>) chapterFive.getExercises();
	    
		javaExerciseController.saveAll(exercises);
		
		for(Exercise ex : exercises)
			buildJavaStudentActedOnExercise(exercisesShared, exercisesRated, data, ex, ctx);
	}
	
	
	private void buildJavaChapterSix(ArrayList<Chapter> chapters, ArrayList<StudentSharedExercise> exercisesShared, ArrayList<StudentRatedExercise> exercisesRated, ArrayList<ToBeVisited> data,ApplicationContext ctx) {
		
		ChapterSix chapterSix = (ChapterSix)ctx.getBean("chapterSix");
		
		//ChapterController chapterController = (ChapterController) ctx.getBean("chapterController");
		JavaExerciseController javaExerciseController = (JavaExerciseController) ctx.getBean("javaExerciseController");	
		ToBeVisitedController toBeVisitedController = (ToBeVisitedController)ctx.getBean("toBeVisitedController");
		StudentActedOnChapterController studentActedOnChapterController = (StudentActedOnChapterController)ctx.getBean("studentActedOnChapterController");
		
		Chapter chapter = chapterSix.getChapter();
		chapter.setChapterName("Methods"); 
		chapter.setTechnology("Java");
		//chapterController.save(chapter);
		chapters.add(chapter);
		
		ToBeVisited toBeVisited = (ToBeVisited) ctx.getBean("toBeVisited");
		toBeVisited.setDescription("Java Chapter Six 2020");
		toBeVisitedController.save(toBeVisited);
		
		Exercise exercise = buildJavaExercise(ctx);
		 
		StudentActedOnChapter studentActedOnChapter = (StudentActedOnChapter) ctx.getBean("studentActedOnChapter");
		studentActedOnChapter.setChapter(chapter);
		studentActedOnChapter.setToBeVisited(toBeVisited);
		studentActedOnChapterController.save(studentActedOnChapter);
        
        ChapterSixExercise chapterSixExercise = (ChapterSixExercise) ctx.getBean("chapterSixExercise"); 
        chapterSixExercise.setExercise(exercise);
		chapterSix.setChapter(chapter); 
		
		try {
			chapterSix.createBuildingBlock(chapterSixExercise);
		} catch (FileNotFoundException | CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		ArrayList<Exercise> exercises = (ArrayList<Exercise>) chapterSix.getExercises();
	    
		javaExerciseController.saveAll(exercises);
		
		for(Exercise ex : exercises)
			buildJavaStudentActedOnExercise(exercisesShared, exercisesRated, data, ex, ctx);
	}
	
	
	private void buildJavaChapterSeven(ArrayList<Chapter> chapters, ArrayList<StudentSharedExercise> exercisesShared, ArrayList<StudentRatedExercise> exercisesRated, ArrayList<ToBeVisited> data,ApplicationContext ctx) {
		
		ChapterSeven chapterSeven = (ChapterSeven)ctx.getBean("chapterSeven");
		
		//ChapterController chapterController = (ChapterController) ctx.getBean("chapterController");
		JavaExerciseController javaExerciseController = (JavaExerciseController) ctx.getBean("javaExerciseController");	
		ToBeVisitedController toBeVisitedController = (ToBeVisitedController)ctx.getBean("toBeVisitedController");
		StudentActedOnChapterController studentActedOnChapterController = (StudentActedOnChapterController)ctx.getBean("studentActedOnChapterController");
			
		Chapter chapter = chapterSeven.getChapter();	
		chapter.setChapterName("Single-Dimensional Arrays"); 
		chapter.setTechnology("Java");
		//chapterController.save(chapter);
		chapters.add(chapter);
		
		ToBeVisited toBeVisited = (ToBeVisited) ctx.getBean("toBeVisited");
		toBeVisited.setDescription("Java Chapter Seven 2020");
		toBeVisitedController.save(toBeVisited);
		
		Exercise exercise = buildJavaExercise(ctx);
		 
		StudentActedOnChapter studentActedOnChapter = (StudentActedOnChapter) ctx.getBean("studentActedOnChapter");
		studentActedOnChapter.setChapter(chapter);
		studentActedOnChapter.setToBeVisited(toBeVisited);
		studentActedOnChapterController.save(studentActedOnChapter);
		
        ChapterSevenExercise chapterSevenExercise = (ChapterSevenExercise) ctx.getBean("chapterSevenExercise"); 
        chapterSevenExercise.setExercise(exercise);
		chapterSeven.setChapter(chapter); 
		
		try {
			chapterSeven.createBuildingBlock(chapterSevenExercise);
		} catch (FileNotFoundException | CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		ArrayList<Exercise> exercises = (ArrayList<Exercise>) chapterSeven.getExercises();
	    
		javaExerciseController.saveAll(exercises);
		
		for(Exercise ex : exercises)
			buildJavaStudentActedOnExercise(exercisesShared, exercisesRated, data, ex, ctx);
	}
	
	
	private void buildJavaChapterEight(ArrayList<Chapter> chapters, ArrayList<StudentSharedExercise> exercisesShared, ArrayList<StudentRatedExercise> exercisesRated, ArrayList<ToBeVisited> data,ApplicationContext ctx) {
		
		ChapterEight chapterEight = (ChapterEight)ctx.getBean("chapterEight");
		
		//ChapterController chapterController = (ChapterController) ctx.getBean("chapterController");
		JavaExerciseController javaExerciseController = (JavaExerciseController) ctx.getBean("javaExerciseController");	
		ToBeVisitedController toBeVisitedController = (ToBeVisitedController)ctx.getBean("toBeVisitedController");
		StudentActedOnChapterController studentActedOnChapterController = (StudentActedOnChapterController)ctx.getBean("studentActedOnChapterController");
			
		Chapter chapter = (Chapter) chapterEight.getChapter();
		chapter.setChapterName("Multi-Dimenisonal Arrays"); 
		chapter.setTechnology("Java");
		//chapterController.save(chapter);
		chapters.add(chapter);
		
		ToBeVisited toBeVisited = (ToBeVisited) ctx.getBean("toBeVisited");
		toBeVisited.setDescription("Java Chapter Eight 2020");
		toBeVisitedController.save(toBeVisited);
		
		Exercise exercise = buildJavaExercise(ctx);
		 
		StudentActedOnChapter studentActedOnChapter = (StudentActedOnChapter) ctx.getBean("studentActedOnChapter");
		studentActedOnChapter.setChapter(chapter);
		studentActedOnChapter.setToBeVisited(toBeVisited);
		studentActedOnChapterController.save(studentActedOnChapter);
		
        ChapterEightExercise chapterEightExercise = (ChapterEightExercise) ctx.getBean("chapterEightExercise"); 
        chapterEightExercise.setExercise(exercise);
		chapterEight.setChapter(chapter); 
		
		try {
			chapterEight.createBuildingBlock(chapterEightExercise);
		} catch (FileNotFoundException | CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		ArrayList<Exercise> exercises = (ArrayList<Exercise>) chapterEight.getExercises();
	    
		javaExerciseController.saveAll(exercises);
		
		for(Exercise ex : exercises)
			buildJavaStudentActedOnExercise(exercisesShared, exercisesRated, data, ex, ctx);
	}
	
	
	private void buildJavaStudentActedOnExercise(ArrayList<StudentSharedExercise> exercisesShared, ArrayList<StudentRatedExercise> exercisesRated, ArrayList<ToBeVisited> data, Exercise exercise, ApplicationContext ctx) {

		ToBeVisited toBeVisited = (ToBeVisited) ctx.getBean("toBeVisited");
		ToBeVisited toBeVisited1 = toBeVisited;
		try {
			toBeVisited1 = (ToBeVisited) (toBeVisited).clone();
		} catch (BeansException e) {
			
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		toBeVisited1.setDescription("Java " + exercise.getExerciseNumber() + " 2020 Ratings");
		data.add(toBeVisited1);
		
		StudentRatedExercise studentRatedExercise = (StudentRatedExercise) ctx.getBean("studentRatedExercise"); 
		StudentRatedExercise stuRatedExercise = studentRatedExercise;
		try {
			stuRatedExercise = (StudentRatedExercise) studentRatedExercise.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		stuRatedExercise.setExercise(exercise);
		stuRatedExercise.setStudentActedOnExerciseID();
		stuRatedExercise.setToBeVisited(toBeVisited1);
		exercisesRated.add(stuRatedExercise);
		
		ToBeVisited toBeVisited2 = toBeVisited;
		try {
			toBeVisited2 = (ToBeVisited) (toBeVisited1).clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		toBeVisited2.setDescription("Java " + exercise.getExerciseNumber() + " 2020 Sharings");
		
		data.add(toBeVisited2);
		
		StudentSharedExercise studentSharedExercise = (StudentSharedExercise) ctx.getBean("studentSharedExercise"); 
		StudentSharedExercise stuSharedExercise = studentSharedExercise;
		try {
			stuSharedExercise = (StudentSharedExercise) studentSharedExercise.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		stuSharedExercise.setExercise(exercise);
		stuSharedExercise.setStudentActedOnExerciseID();
		stuSharedExercise.setToBeVisited(toBeVisited2);
		exercisesShared.add(stuSharedExercise);
	}
	
	private void buildJavaPartOne(ArrayList<Chapter> chapters, ApplicationContext ctx) {
		
		PartController partController = (PartController)ctx.getBean("partController");
		ChapterController chapterController = (ChapterController) ctx.getBean("chapterController");
		StudentActedOnPartController studentActedOnPartController = (StudentActedOnPartController)ctx.getBean("studentActedOnPartController");
		ToBeVisitedController toBeVisitedController = (ToBeVisitedController)ctx.getBean("toBeVisitedController");
	
		ToBeVisited toBeVisited = (ToBeVisited) ctx.getBean("toBeVisited");
		toBeVisited.setDescription("Part One 2020");
		toBeVisitedController.save(toBeVisited);

		Part part = (Part) ctx.getBean("part");
		part.setPartNumber(1); 
		part.setTechnology("Java"); 
		for(Chapter chapter : chapters) {
			part.addChapter(chapter);
			chapter.setPart(part);
			chapterController.save(chapter);
		}
		partController.save(part);

		StudentActedOnPart studentActedOnPart = (StudentActedOnPart) ctx.getBean("studentActedOnPart"); // partNumber = -1, technology = "---", studentActedOnPart = null, partsBook = null, chapters has zero elements.
		studentActedOnPart.setPart(part);
		studentActedOnPart.setToBeVisited(toBeVisited);
		studentActedOnPartController.save(studentActedOnPart); 

	}
	
	private void saveToBeVisited(ArrayList<ToBeVisited> toBeVisited, ApplicationContext ctx) {
		
		ToBeVisitedController toBeVisitedController = (ToBeVisitedController)ctx.getBean("toBeVisitedController");
		
		toBeVisitedController.saveAll(toBeVisited);
	}
	
	private void saveJavaExercise(ArrayList<Exercise> exercises, ApplicationContext ctx) {
		
		JavaExerciseController javaExerciseController = (JavaExerciseController) ctx.getBean("javaExerciseController");	
		
		javaExerciseController.saveAll(exercises);
	}
	
	private void saveStudentRatedJavaExercises(ArrayList<StudentRatedExercise> exercisesRated, ApplicationContext ctx) {
		
		StudentRatedExerciseController studentRatedExerciseController = (StudentRatedExerciseController)ctx.getBean("studentRatedExerciseController");
		
		for(StudentRatedExercise studentRatedExercise : exercisesRated) {
			System.out.println("ID : " + studentRatedExercise.getStudentActedOnExerciseID());
			studentRatedExerciseController.save(studentRatedExercise);
		}
	}
	
	private void saveStudentSharedJavaExercises(ArrayList<StudentSharedExercise> exercisesShared, ApplicationContext ctx) {
		
		StudentSharedExerciseController studentSharedExerciseController = (StudentSharedExerciseController)ctx.getBean("studentSharedExerciseController");
		
		for(StudentSharedExercise studentSharedExercise : exercisesShared)
			studentSharedExerciseController.save(studentSharedExercise);
	}
	
	private void saveJavaChapters(ArrayList<Chapter> chapters, ApplicationContext ctx) {
		
		ChapterController chapterController = (ChapterController) ctx.getBean("chapterController");	
		
		for(Chapter chapter : chapters)
			chapterController.save(chapter);
	}
	
	private void saveStudentActedOnJavaChapter(ArrayList<StudentActedOnChapter> studentActedOnChapters, ApplicationContext ctx) {
		
		StudentActedOnChapterController studentActedOnChapterController = (StudentActedOnChapterController)ctx.getBean("studentActedOnChapterController");
		
		for(StudentActedOnChapter action : studentActedOnChapters)
			studentActedOnChapterController.save(action);
	}
	
	private void saveJavaParts(LinkedHashSet<Part> parts, ApplicationContext ctx) {
		
		PartController partController = (PartController)ctx.getBean("partController");
		
		for(Part part : parts)
			partController.save(part);
	}
	
	private void saveStudentActedOnJavaPart(ArrayList<StudentActedOnPart> studentActedOnParts, ApplicationContext ctx) {
		
		StudentActedOnPartController studentActedOnPartController = (StudentActedOnPartController)ctx.getBean("studentActedOnPartController");
		
		for(StudentActedOnPart action : studentActedOnParts)
			studentActedOnPartController.save(action);
	}
}
