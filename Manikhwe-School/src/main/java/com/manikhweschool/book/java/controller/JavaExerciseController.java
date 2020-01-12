package com.manikhweschool.book.java.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manikhweschool.book.java.service.JavaExerciseService;
import com.manikhweschool.model.Exercise;

@Controller
public class JavaExerciseController {

	@Autowired
	private JavaExerciseService exerciseService;
	
	public JavaExerciseController() {
		
	}
	
	@RequestMapping("/Chapter One/Video/Download")
	public String downloadChapterOneVideo(@RequestParam("videoName") String videoName) {
				
		String video = "/Manikhwe-School/Java Course Resources/Exercises Videos/Part One/Chapter One/Exercise ";
		
		switch(videoName) {
			case "download_1_1_video" : video += "1.1.mp4";break;
			case "download_1_2_video" : video += "1.2.mp4";break;
			case "download_1_3_video" : video += "1.3.mp4";break;
			case "download_1_4_video" : video += "1.4.mp4";break;
			case "download_1_5_video" : video += "1.5.mp4";break;
			case "download_1_6_video" : video += "1.6.mp4";break;
			case "download_1_7_video" : video += "1.7.mp4";break;
			case "download_1_8_video" : video += "1.8.mp4";break;
			case "download_1_9_video" : video += "1.9.mp4";break;
			case "download_1_10_video" : video += "1.10.mp4";break;
			case "download_1_11_video" : video += "1.11.mp4";break;
			case "download_1_12_video" : video += "1.12.mp4";break;
			default : video += "1.13.mp4";break;
		}
		
		return video;
	}
	
	@RequestMapping("/Chapter One/Code/Download")
	public String downloadChapterOneCode(@RequestParam("codeName") String codeName) {
				
		String code = "/Manikhwe-School/Java Course Resources/Exercises Code/Part One/Chapter One/Exercise ";
		
		switch(codeName) {
			case "download_1_1_code" : code += "1.1.zip";break;
			case "download_1_2_code" : code += "1.2.zip";break;
			case "download_1_3_code" : code += "1.3.zip";break;
			case "download_1_4_code" : code += "1.4.zip";break;
			case "download_1_5_code" : code += "1.5.zip";break;
			case "download_1_6_code" : code += "1.6.zip";break;
			case "download_1_7_code" : code += "1.7.zip";break;
			case "download_1_8_code" : code += "1.8.zip";break;
			case "download_1_9_code" : code += "1.9.zip";break;
			case "download_1_10_code" : code += "1.10.zip";break;
			case "download_1_11_code" : code += "1.11.zip";break;
			case "download_1_12_code" : code += "1.12.zip";break;
			default : code += "1.13.zip";break;
		}
		
		return code;
	}
	
	@RequestMapping("/Chapter Two/Video/Download")
	public String downloadChapterTwoVideo(@RequestParam("videoName") String videoName) {
		
		String video = "/Manikhwe-School/Java Course Resources/Exercises Videos/Part One/Chapter Two/Exercise ";
		
		switch(videoName) {
			case "download_2_1_video" : video += "2.1.mp4";break;
			case "download_2_2_video" : video += "2.2.mp4";break;
			case "download_2_3_video" : video += "2.3.mp4";break;
			case "download_2_4_video" : video += "2.4.mp4";break;
			case "download_2_5_video" : video += "2.5.mp4";break;
			case "download_2_6_video" : video += "2.6.mp4";break;
			case "download_2_7_video" : video += "2.7.mp4";break;
			case "download_2_8_video" : video += "2.8.mp4";break;
			case "download_2_9_video" : video += "2.9.mp4";break;
			case "download_2_10_video" : video += "2.10.mp4";break;
			case "download_2_11_video" : video += "2.11.mp4";break;
			case "download_2_12_video" : video += "2.12.mp4";break;
			case "download_2_13_video" : video += "2.13.mp4";break;
			case "download_2_14_video" : video += "2.14.mp4";break;
			case "download_2_15_video" : video += "2.15.mp4";break;
			case "download_2_16_video" : video += "2.16.mp4";break;
			case "download_2_17_video" : video += "2.17.mp4";break;
			case "download_2_18_video" : video += "2.18.mp4";break;
			case "download_2_19_video" : video += "2.19.mp4";break;
			case "download_2_20_video" : video += "2.20.mp4";break;
			case "download_2_21_video" : video += "2.21.mp4";break;
			case "download_2_22_video" : video += "2.22.mp4";break;
			default : video += "2.23.mp4";break;
		}
		
		return video;
	}
	
	@RequestMapping("/Chapter Two/Code/Download")
	public String downloadChapterTwoCode(@RequestParam("codeName") String codeName) {
				
		String code = "/Manikhwe-School/Java Course Resources/Exercises Code/Part One/Chapter Two/Exercise ";
		
		switch(codeName) {
			case "download_2_1_code" : code += "2.1.zip";break;
			case "download_2_2_code" : code += "2.2.zip";break;
			case "download_2_3_code" : code += "2.3.zip";break;
			case "download_2_4_code" : code += "2.4.zip";break;
			case "download_2_5_code" : code += "2.5.zip";break;
			case "download_2_6_code" : code += "2.6.zip";break;
			case "download_2_7_code" : code += "2.7.zip";break;
			case "download_2_8_code" : code += "2.8.zip";break;
			case "download_2_9_code" : code += "2.9.zip";break;
			case "download_2_10_code" : code += "2.10.zip";break;
			case "download_2_11_code" : code += "2.11.zip";break;
			case "download_2_12_code" : code += "2.12.zip";break;
			case "download_2_13_code" : code += "2.13.zip";break;
			case "download_2_14_code" : code += "2.14.zip";break;
			case "download_2_15_code" : code += "2.15.zip";break;
			case "download_2_16_code" : code += "2.16.zip";break;
			case "download_2_17_code" : code += "2.17.zip";break;
			case "download_2_18_code" : code += "2.18.zip";break;
			case "download_2_19_code" : code += "2.19.zip";break;
			case "download_2_20_code" : code += "2.20.zip";break;
			case "download_2_21_code" : code += "2.21.zip";break;
			case "download_2_22_code" : code += "2.22.zip";break;
			default : code += "2.23.zip";break;
		}
		
		return code;
	}
	
	@RequestMapping("/Chapter Three/Video/Download")
	public String downloadChapterThreeVideo(@RequestParam("videoName") String videoName) {
		
		String video = "/Manikhwe-School/Java Course Resources/Exercises Videos/Part One/Chapter Three/Exercise ";
		
		switch(videoName) {
			case "download_3_1_video" : video += "3.1.mp4";break;
			case "download_3_2_video" : video += "3.2.mp4";break;
			case "download_3_3_video" : video += "3.3.mp4";break;
			case "download_3_4_video" : video += "3.4.mp4";break;
			case "download_3_5_video" : video += "3.5.mp4";break;
			case "download_3_6_video" : video += "3.6.mp4";break;
			case "download_3_7_video" : video += "3.7.mp4";break;
			case "download_3_8_video" : video += "3.8.mp4";break;
			case "download_3_9_video" : video += "3.9.mp4";break;
			case "download_3_10_video" : video += "3.10.mp4";break;
			case "download_3_11_video" : video += "3.11.mp4";break;
			case "download_3_12_video" : video += "3.12.mp4";break;
			case "download_3_13_video" : video += "3.13.mp4";break;
			case "download_3_14_video" : video += "3.14.mp4";break;
			case "download_3_15_video" : video += "3.15.mp4";break;
			case "download_3_16_video" : video += "3.16.mp4";break;
			case "download_3_17_video" : video += "3.17.mp4";break;
			case "download_3_18_video" : video += "3.18.mp4";break;
			case "download_3_19_video" : video += "3.19.mp4";break;
			case "download_3_20_video" : video += "3.20.mp4";break;
			case "download_3_21_video" : video += "3.21.mp4";break;
			case "download_3_22_video" : video += "3.22.mp4";break;
			case "download_3_23_video" : video += "3.23.mp4";break;
			case "download_3_24_video" : video += "3.24.mp4";break;
			case "download_3_25_video" : video += "3.25.mp4";break;
			case "download_3_26_video" : video += "3.26.mp4";break;
			case "download_3_27_video" : video += "3.27.mp4";break;
			case "download_3_28_video" : video += "3.28.mp4";break;
			case "download_3_29_video" : video += "3.29.mp4";break;
			case "download_3_30_video" : video += "3.30.mp4";break;
			case "download_3_31_video" : video += "3.31.mp4";break;
			case "download_3_32_video" : video += "3.32.mp4";break;
			default : video += "3.33.mp4";break;
		}
		
		return video;
	}
	
	@RequestMapping("/Chapter Three/Code/Download")
	public String downloadChapterThreeCode(@RequestParam("codeName") String codeName) {
				
		String code = "/Manikhwe-School/Java Course Resources/Exercises Code/Part One/Chapter Three/Exercise ";
		
		switch(codeName) {
			case "download_3_1_code" : code += "3.1.zip";break;
			case "download_3_2_code" : code += "3.2.zip";break;
			case "download_3_3_code" : code += "3.3.zip";break;
			case "download_3_4_code" : code += "3.4.zip";break;
			case "download_3_5_code" : code += "3.5.zip";break;
			case "download_3_6_code" : code += "3.6.zip";break;
			case "download_3_7_code" : code += "3.7.zip";break;
			case "download_3_8_code" : code += "3.8.zip";break;
			case "download_3_9_code" : code += "3.9.zip";break;
			case "download_3_10_code" : code += "3.10.zip";break;
			case "download_3_11_code" : code += "3.11.zip";break;
			case "download_3_12_code" : code += "3.12.zip";break;
			case "download_3_13_code" : code += "3.13.zip";break;
			case "download_3_14_code" : code += "3.14.zip";break;
			case "download_3_15_code" : code += "3.15.zip";break;
			case "download_3_16_code" : code += "3.16.zip";break;
			case "download_3_17_code" : code += "3.17.zip";break;
			case "download_3_18_code" : code += "3.18.zip";break;
			case "download_3_19_code" : code += "3.19.zip";break;
			case "download_3_20_code" : code += "3.20.zip";break;
			case "download_3_21_code" : code += "3.21.zip";break;
			case "download_3_22_code" : code += "3.22.zip";break;
			case "download_3_23_code" : code += "3.23.zip";break;
			case "download_3_24_code" : code += "3.24.zip";break;
			case "download_3_25_code" : code += "3.25.zip";break;
			case "download_3_26_code" : code += "3.26.zip";break;
			case "download_3_27_code" : code += "3.27.zip";break;
			case "download_3_28_code" : code += "3.28.zip";break;
			case "download_3_29_code" : code += "3.29.zip";break;
			case "download_3_30_code" : code += "3.30.zip";break;
			case "download_3_31_code" : code += "3.31.zip";break;
			case "download_3_32_code" : code += "3.32.zip";break;
			case "download_3_33_code" : code += "3.33.zip";break;
			default : code += "3.34.zip";break;
		}
		
		return code;
	}
	

	@RequestMapping("/Chapter Four/Video/Download")
	public String downloadChapterFourVideo(@RequestParam("videoName") String videoName) {
		
		String video = "/Manikhwe-School/Java Course Resources/Exercises Videos/Part One/Chapter Four/Exercise ";
		
		switch(videoName) {
			case "download_4_1_video" : video += "4.1.mp4";break;
			case "download_4_2_video" : video += "4.2.mp4";break;
			case "download_4_3_video" : video += "4.3.mp4";break;
			case "download_4_4_video" : video += "4.4.mp4";break;
			case "download_4_5_video" : video += "4.5.mp4";break;
			case "download_4_6_video" : video += "4.6.mp4";break;
			case "download_4_7_video" : video += "4.7.mp4";break;
			case "download_4_8_video" : video += "4.8.mp4";break;
			case "download_4_9_video" : video += "4.9.mp4";break;
			case "download_4_10_video" : video += "4.10.mp4";break;
			case "download_4_11_video" : video += "4.11.mp4";break;
			case "download_4_12_video" : video += "4.12.mp4";break;
			case "download_4_13_video" : video += "4.13.mp4";break;
			case "download_4_14_video" : video += "4.14.mp4";break;
			case "download_4_15_video" : video += "4.15.mp4";break;
			case "download_4_16_video" : video += "4.16.mp4";break;
			case "download_4_17_video" : video += "4.17.mp4";break;
			case "download_4_18_video" : video += "4.18.mp4";break;
			case "download_4_19_video" : video += "4.19.mp4";break;
			case "download_4_20_video" : video += "4.20.mp4";break;
			case "download_4_21_video" : video += "4.21.mp4";break;
			case "download_4_22_video" : video += "4.22.mp4";break;
			case "download_4_23_video" : video += "4.23.mp4";break;
			case "download_4_24_video" : video += "4.24.mp4";break;
			case "download_4_25_video" : video += "4.25.mp4";break;
			default : video += "4.26.mp4";break;
		}
		
		return video;
	}
	
	@RequestMapping("/Chapter Four/Code/Download")
	public String downloadChapterFourCode(@RequestParam("codeName") String codeName) {
				
		String code = "/Manikhwe-School/Java Course Resources/Exercises Code/Part One/Chapter Four/Exercise ";
		
		switch(codeName) {
			case "download_4_1_code" : code += "4.1.zip";break;
			case "download_4_2_code" : code += "4.2.zip";break;
			case "download_4_3_code" : code += "4.3.zip";break;
			case "download_4_4_code" : code += "4.4.zip";break;
			case "download_4_5_code" : code += "4.5.zip";break;
			case "download_4_6_code" : code += "4.6.zip";break;
			case "download_4_7_code" : code += "4.7.zip";break;
			case "download_4_8_code" : code += "4.8.zip";break;
			case "download_4_9_code" : code += "4.9.zip";break;
			case "download_4_10_code" : code += "4.10.zip";break;
			case "download_4_11_code" : code += "4.11.zip";break;
			case "download_4_12_code" : code += "4.12.zip";break;
			case "download_4_13_code" : code += "4.13.zip";break;
			case "download_4_14_code" : code += "4.14.zip";break;
			case "download_4_15_code" : code += "4.15.zip";break;
			case "download_4_16_code" : code += "4.16.zip";break;
			case "download_4_17_code" : code += "4.17.zip";break;
			case "download_4_18_code" : code += "4.18.zip";break;
			case "download_4_19_code" : code += "4.19.zip";break;
			case "download_4_20_code" : code += "4.20.zip";break;
			case "download_4_21_code" : code += "4.21.zip";break;
			case "download_4_22_code" : code += "4.22.zip";break;
			case "download_4_23_code" : code += "4.23.zip";break;
			case "download_4_24_code" : code += "4.24.zip";break;
			case "download_4_25_code" : code += "4.25.zip";break;
			default : code += "4.26.zip";break;
		}
		
		return code;
	}
	
	
	@RequestMapping("/Chapter Five/Video/Download")
	public String downloadChapterFiveVideo(@RequestParam("videoName") String videoName) {
		
		String video = "/Manikhwe-School/Java Course Resources/Exercises Videos/Part One/Chapter Five/Exercise ";
		
		switch(videoName) {
			case "download_5_1_video" : video += "5.1.mp4";break;
			case "download_5_2_video" : video += "5.2.mp4";break;
			case "download_5_3_video" : video += "5.3.mp4";break;
			case "download_5_4_video" : video += "5.4.mp4";break;
			case "download_5_5_video" : video += "5.5.mp4";break;
			case "download_5_6_video" : video += "5.6.mp4";break;
			case "download_5_7_video" : video += "5.7.mp4";break;
			case "download_5_8_video" : video += "5.8.mp4";break;
			case "download_5_9_video" : video += "5.9.mp4";break;
			case "download_5_10_video" : video += "5.10.mp4";break;
			case "download_5_11_video" : video += "5.11.mp4";break;
			case "download_5_12_video" : video += "5.12.mp4";break;
			case "download_5_13_video" : video += "5.13.mp4";break;
			case "download_5_14_video" : video += "5.14.mp4";break;
			case "download_5_15_video" : video += "5.15.mp4";break;
			case "download_5_16_video" : video += "5.16.mp4";break;
			case "download_5_17_video" : video += "5.17.mp4";break;
			case "download_5_18_video" : video += "5.18.mp4";break;
			case "download_5_19_video" : video += "5.19.mp4";break;
			case "download_5_20_video" : video += "5.20.mp4";break;
			case "download_5_21_video" : video += "5.21.mp4";break;
			case "download_5_22_video" : video += "5.22.mp4";break;
			case "download_5_23_video" : video += "5.23.mp4";break;
			case "download_5_24_video" : video += "5.24.mp4";break;
			case "download_5_25_video" : video += "5.25.mp4";break;
			case "download_5_26_video" : video += "5.26.mp4";break;
			case "download_5_27_video" : video += "5.27.mp4";break;
			case "download_5_28_video" : video += "5.28.mp4";break;
			case "download_5_29_video" : video += "5.29.mp4";break;
			case "download_5_30_video" : video += "5.30.mp4";break;
			case "download_5_31_video" : video += "5.31.mp4";break;
			case "download_5_32_video" : video += "5.32.mp4";break;
			case "download_5_33_video" : video += "5.33.mp4";break;
			case "download_5_34_video" : video += "5.34.mp4";break;
			case "download_5_35_video" : video += "5.35.mp4";break;
			case "download_5_36_video" : video += "5.36.mp4";break;
			case "download_5_37_video" : video += "5.37.mp4";break;
			case "download_5_38_video" : video += "5.38.mp4";break;
			case "download_5_39_video" : video += "5.39.mp4";break;
			case "download_5_40_video" : video += "5.40.mp4";break;
			case "download_5_41_video" : video += "5.41.mp4";break;
			case "download_5_42_video" : video += "5.42.mp4";break;
			case "download_5_43_video" : video += "5.43.mp4";break;
			case "download_5_44_video" : video += "5.44.mp4";break;
			case "download_5_45_video" : video += "5.45.mp4";break;
			case "download_5_46_video" : video += "5.46.mp4";break;
			case "download_5_47_video" : video += "5.47.mp4";break;
			case "download_5_48_video" : video += "5.48.mp4";break;
			case "download_5_49_video" : video += "5.49.mp4";break;
			case "download_5_50_video" : video += "5.50.mp4";break;
			default : video += "5.51.mp4";break;
		}
		
		return video;
	}
	
	@RequestMapping("/Chapter Five/Code/Download")
	public String downloadChapterFiveCode(@RequestParam("codeName") String codeName) {
				
		String code = "/Manikhwe-School/Java Course Resources/Exercises Code/Part One/Chapter Five/Exercise ";
		
		switch(codeName) {
			case "download_5_1_code" : code += "5.1.zip";break;
			case "download_5_2_code" : code += "5.2.zip";break;
			case "download_5_3_code" : code += "5.3.zip";break;
			case "download_5_4_code" : code += "5.4.zip";break;
			case "download_5_5_code" : code += "5.5.zip";break;
			case "download_5_6_code" : code += "5.6.zip";break;
			case "download_5_7_code" : code += "5.7.zip";break;
			case "download_5_8_code" : code += "5.8.zip";break;
			case "download_5_9_code" : code += "5.9.zip";break;
			case "download_5_10_code" : code += "5.10.zip";break;
			case "download_5_11_code" : code += "5.11.zip";break;
			case "download_5_12_code" : code += "5.12.zip";break;
			case "download_5_13_code" : code += "5.13.zip";break;
			case "download_5_14_code" : code += "5.14.zip";break;
			case "download_5_15_code" : code += "5.15.zip";break;
			case "download_5_16_code" : code += "5.16.zip";break;
			case "download_5_17_code" : code += "5.17.zip";break;
			case "download_5_18_code" : code += "5.18.zip";break;
			case "download_5_19_code" : code += "5.19.zip";break;
			case "download_5_20_code" : code += "5.20.zip";break;
			case "download_5_21_code" : code += "5.21.zip";break;
			case "download_5_22_code" : code += "5.22.zip";break;
			case "download_5_23_code" : code += "5.23.zip";break;
			case "download_5_24_code" : code += "5.24.zip";break;
			case "download_5_25_code" : code += "5.25.zip";break;
			case "download_5_26_code" : code += "5.26.zip";break;
			case "download_5_27_code" : code += "5.27.zip";break;
			case "download_5_28_code" : code += "5.28.zip";break;
			case "download_5_29_code" : code += "5.29.zip";break;
			case "download_5_30_code" : code += "5.30.zip";break;
			case "download_5_31_code" : code += "5.31.zip";break;
			case "download_5_32_code" : code += "5.32.zip";break;
			case "download_5_33_code" : code += "5.33.zip";break;
			case "download_5_34_code" : code += "5.34.zip";break;
			case "download_5_35_code" : code += "5.35.zip";break;
			case "download_5_36_code" : code += "5.36.zip";break;
			case "download_5_37_code" : code += "5.37.zip";break;
			case "download_5_38_code" : code += "5.38.zip";break;
			case "download_5_39_code" : code += "5.39.zip";break;
			case "download_5_40_code" : code += "5.40.zip";break;
			case "download_5_41_code" : code += "5.41.zip";break;
			case "download_5_42_code" : code += "5.42.zip";break;
			case "download_5_43_code" : code += "5.43.zip";break;
			case "download_5_44_code" : code += "5.44.zip";break;
			case "download_5_45_code" : code += "5.45.zip";break;
			case "download_5_46_code" : code += "5.46.zip";break;
			case "download_5_47_code" : code += "5.47.zip";break;
			case "download_5_48_code" : code += "5.48.zip";break;
			case "download_5_49_code" : code += "5.49.zip";break;
			case "download_5_50_code" : code += "5.50.zip";break;
			default : code += "5.51.zip";break;
		}
		
		return code;
	}
	

	@RequestMapping("/Chapter Six/Video/Download")
	public String downloadChapterSixVideo(@RequestParam("videoName") String videoName) {
		
		String video = "/Manikhwe-School/Java Course Resources/Exercises Videos/Part One/Chapter Six/Exercise ";
		
		switch(videoName) {
			case "download_6_1_video" : video += "6.1.mp4";break;
			case "download_6_2_video" : video += "6.2.mp4";break;
			case "download_6_3_video" : video += "6.3.mp4";break;
			case "download_6_4_video" : video += "6.4.mp4";break;
			case "download_6_5_video" : video += "6.5.mp4";break;
			case "download_6_6_video" : video += "6.6.mp4";break;
			case "download_6_7_video" : video += "6.7.mp4";break;
			case "download_6_8_video" : video += "6.8.mp4";break;
			case "download_6_9_video" : video += "6.9.mp4";break;
			case "download_6_10_video" : video += "6.10.mp4";break;
			case "download_6_11_video" : video += "6.11.mp4";break;
			case "download_6_12_video" : video += "6.12.mp4";break;
			case "download_6_13_video" : video += "6.13.mp4";break;
			case "download_6_14_video" : video += "6.14.mp4";break;
			case "download_6_15_video" : video += "6.15.mp4";break;
			case "download_6_16_video" : video += "6.16.mp4";break;
			case "download_6_17_video" : video += "6.17.mp4";break;
			case "download_6_18_video" : video += "6.18.mp4";break;
			case "download_6_19_video" : video += "6.19.mp4";break;
			case "download_6_20_video" : video += "6.20.mp4";break;
			case "download_6_21_video" : video += "6.21.mp4";break;
			case "download_6_22_video" : video += "6.22.mp4";break;
			case "download_6_23_video" : video += "6.23.mp4";break;
			case "download_6_24_video" : video += "6.24.mp4";break;
			case "download_6_25_video" : video += "6.25.mp4";break;
			case "download_6_26_video" : video += "6.26.mp4";break;
			case "download_6_27_video" : video += "6.27.mp4";break;
			case "download_6_28_video" : video += "6.28.mp4";break;
			case "download_6_29_video" : video += "6.29.mp4";break;
			case "download_6_30_video" : video += "6.30.mp4";break;
			case "download_6_31_video" : video += "6.31.mp4";break;
			case "download_6_32_video" : video += "6.32.mp4";break;
			case "download_6_33_video" : video += "6.33.mp4";break;
			case "download_6_34_video" : video += "6.34.mp4";break;
			case "download_6_35_video" : video += "6.35.mp4";break;
			case "download_6_36_video" : video += "6.36.mp4";break;
			case "download_6_37_video" : video += "6.37.mp4";break;
			case "download_6_38_video" : video += "6.38.mp4";break;
			default : video += "6.39.mp4";break;
		}
		
		return video;
	}
	
	@RequestMapping("/Chapter Six/Code/Download")
	public String downloadChapterSixCode(@RequestParam("codeName") String codeName) {
				
		String code = "/Manikhwe-School/Java Course Resources/Exercises Code/Part One/Chapter Six/Exercise ";
		
		switch(codeName) {
			case "download_6_1_code" : code += "6.1.zip";break;
			case "download_6_2_code" : code += "6.2.zip";break;
			case "download_6_3_code" : code += "6.3.zip";break;
			case "download_6_4_code" : code += "6.4.zip";break;
			case "download_6_5_code" : code += "6.5.zip";break;
			case "download_6_6_code" : code += "6.6.zip";break;
			case "download_6_7_code" : code += "6.7.zip";break;
			case "download_6_8_code" : code += "6.8.zip";break;
			case "download_6_9_code" : code += "6.9.zip";break;
			case "download_6_10_code" : code += "6.10.zip";break;
			case "download_6_11_code" : code += "6.11.zip";break;
			case "download_6_12_code" : code += "6.12.zip";break;
			case "download_6_13_code" : code += "6.13.zip";break;
			case "download_6_14_code" : code += "6.14.zip";break;
			case "download_6_15_code" : code += "6.15.zip";break;
			case "download_6_16_code" : code += "6.16.zip";break;
			case "download_6_17_code" : code += "6.17.zip";break;
			case "download_6_18_code" : code += "6.18.zip";break;
			case "download_6_19_code" : code += "6.19.zip";break;
			case "download_6_20_code" : code += "6.20.zip";break;
			case "download_6_21_code" : code += "6.21.zip";break;
			case "download_6_22_code" : code += "6.22.zip";break;
			case "download_6_23_code" : code += "6.23.zip";break;
			case "download_6_24_code" : code += "6.24.zip";break;
			case "download_6_25_code" : code += "6.25.zip";break;
			case "download_6_26_code" : code += "6.26.zip";break;
			case "download_6_27_code" : code += "6.27.zip";break;
			case "download_6_28_code" : code += "6.28.zip";break;
			case "download_6_29_code" : code += "6.29.zip";break;
			case "download_6_30_code" : code += "6.30.zip";break;
			case "download_6_31_code" : code += "6.31.zip";break;
			case "download_6_32_code" : code += "6.32.zip";break;
			case "download_6_33_code" : code += "6.33.zip";break;
			case "download_6_34_code" : code += "6.34.zip";break;
			case "download_6_35_code" : code += "6.35.zip";break;
			case "download_6_36_code" : code += "6.36.zip";break;
			case "download_6_37_code" : code += "6.37.zip";break;
			case "download_6_38_code" : code += "6.38.zip";break;
			default : code += "6.39.zip";break;
		}
		
		return code;
	}
	

	@RequestMapping("/Chapter Seven/Video/Download")
	public String downloadChapterSevenVideo(@RequestParam("videoName") String videoName) {
		
		String video = "/Manikhwe-School/Java Course Resources/Exercises Videos/Part One/Chapter Seven/Exercise ";
		
		switch(videoName) {
			case "download_7_1_video" : video += "7.1.mp4";break;
			case "download_7_2_video" : video += "7.2.mp4";break;
			case "download_7_3_video" : video += "7.3.mp4";break;
			case "download_7_4_video" : video += "7.4.mp4";break;
			case "download_7_5_video" : video += "7.5.mp4";break;
			case "download_7_6_video" : video += "7.6.mp4";break;
			case "download_7_7_video" : video += "7.7.mp4";break;
			case "download_7_8_video" : video += "7.8.mp4";break;
			case "download_7_9_video" : video += "7.9.mp4";break;
			case "download_7_10_video" : video += "7.10.mp4";break;
			case "download_7_11_video" : video += "7.11.mp4";break;
			case "download_7_12_video" : video += "7.12.mp4";break;
			case "download_7_13_video" : video += "7.13.mp4";break;
			case "download_7_14_video" : video += "7.14.mp4";break;
			case "download_7_15_video" : video += "7.15.mp4";break;
			case "download_7_16_video" : video += "7.16.mp4";break;
			case "download_7_17_video" : video += "7.17.mp4";break;
			case "download_7_18_video" : video += "7.18.mp4";break;
			case "download_7_19_video" : video += "7.19.mp4";break;
			case "download_7_20_video" : video += "7.20.mp4";break;
			case "download_7_21_video" : video += "7.21.mp4";break;
			case "download_7_22_video" : video += "7.22.mp4";break;
			case "download_7_23_video" : video += "7.23.mp4";break;
			case "download_7_24_video" : video += "7.24.mp4";break;
			case "download_7_25_video" : video += "7.25.mp4";break;
			case "download_7_26_video" : video += "7.26.mp4";break;
			case "download_7_27_video" : video += "7.27.mp4";break;
			case "download_7_28_video" : video += "7.28.mp4";break;
			case "download_7_29_video" : video += "7.29.mp4";break;
			case "download_7_30_video" : video += "7.30.mp4";break;
			case "download_7_31_video" : video += "7.31.mp4";break;
			case "download_7_32_video" : video += "7.32.mp4";break;
			case "download_7_33_video" : video += "7.33.mp4";break;
			case "download_7_34_video" : video += "7.34.mp4";break;
			default : video += "7.35.mp4";break;
		}
		
		return video;
	}
	
	@RequestMapping("/Chapter Seven/Code/Download")
	public String downloadChapterSevenCode(@RequestParam("codeName") String codeName) {
				
		String code = "/Manikhwe-School/Java Course Resources/Exercises Code/Part One/Chapter Seven/Exercise ";
		
		switch(codeName) {
			case "download_7_1_code" : code += "7.1.zip";break;
			case "download_7_2_code" : code += "7.2.zip";break;
			case "download_7_3_code" : code += "7.3.zip";break;
			case "download_7_4_code" : code += "7.4.zip";break;
			case "download_7_5_code" : code += "7.5.zip";break;
			case "download_7_6_code" : code += "7.6.zip";break;
			case "download_7_7_code" : code += "7.7.zip";break;
			case "download_7_8_code" : code += "7.8.zip";break;
			case "download_7_9_code" : code += "7.9.zip";break;
			case "download_7_10_code" : code += "7.10.zip";break;
			case "download_7_11_code" : code += "7.11.zip";break;
			case "download_7_12_code" : code += "7.12.zip";break;
			case "download_7_13_code" : code += "7.13.zip";break;
			case "download_7_14_code" : code += "7.14.zip";break;
			case "download_7_15_code" : code += "7.15.zip";break;
			case "download_7_16_code" : code += "7.16.zip";break;
			case "download_7_17_code" : code += "7.17.zip";break;
			case "download_7_18_code" : code += "7.18.zip";break;
			case "download_7_19_code" : code += "7.19.zip";break;
			case "download_7_20_code" : code += "7.20.zip";break;
			case "download_7_21_code" : code += "7.21.zip";break;
			case "download_7_22_code" : code += "7.22.zip";break;
			case "download_7_23_code" : code += "7.23.zip";break;
			case "download_7_24_code" : code += "7.24.zip";break;
			case "download_7_25_code" : code += "7.25.zip";break;
			case "download_7_26_code" : code += "7.26.zip";break;
			case "download_7_27_code" : code += "7.27.zip";break;
			case "download_7_28_code" : code += "7.28.zip";break;
			case "download_7_29_code" : code += "7.29.zip";break;
			case "download_7_30_code" : code += "7.30.zip";break;
			case "download_7_31_code" : code += "7.31.zip";break;
			case "download_7_32_code" : code += "7.32.zip";break;
			case "download_7_33_code" : code += "7.33.zip";break;
			case "download_7_34_code" : code += "7.34.zip";break;
			default : code += "7.35.zip";break;
		}
		
		return code;
	}
	

	@RequestMapping("/Chapter Eight/Video/Download")
	public String downloadChapterEightVideo(@RequestParam("videoName") String videoName) {
		
		String video = "/Manikhwe-School/Java Course Resources/Exercises Videos/Part One/Chapter Eight/Exercise ";
		
		switch(videoName) {
			case "download_8_1_video" : video += "8.1.mp4";break;
			case "download_8_2_video" : video += "8.2.mp4";break;
			case "download_8_3_video" : video += "8.3.mp4";break;
			case "download_8_4_video" : video += "8.4.mp4";break;
			case "download_8_5_video" : video += "8.5.mp4";break;
			case "download_8_6_video" : video += "8.6.mp4";break;
			case "download_8_7_video" : video += "8.7.mp4";break;
			case "download_8_8_video" : video += "8.8.mp4";break;
			case "download_8_9_video" : video += "8.9.mp4";break;
			case "download_8_10_video" : video += "8.10.mp4";break;
			case "download_8_11_video" : video += "8.11.mp4";break;
			case "download_8_12_video" : video += "8.12.mp4";break;
			case "download_8_13_video" : video += "8.13.mp4";break;
			case "download_8_14_video" : video += "8.14.mp4";break;
			case "download_8_15_video" : video += "8.15.mp4";break;
			case "download_8_16_video" : video += "8.16.mp4";break;
			case "download_8_17_video" : video += "8.17.mp4";break;
			case "download_8_18_video" : video += "8.18.mp4";break;
			case "download_8_19_video" : video += "8.19.mp4";break;
			case "download_8_20_video" : video += "8.20.mp4";break;
			case "download_8_21_video" : video += "8.21.mp4";break;
			case "download_8_22_video" : video += "8.22.mp4";break;
			case "download_8_23_video" : video += "8.23.mp4";break;
			case "download_8_24_video" : video += "8.24.mp4";break;
			case "download_8_25_video" : video += "8.25.mp4";break;
			case "download_8_26_video" : video += "8.26.mp4";break;
			case "download_8_27_video" : video += "8.27.mp4";break;
			case "download_8_28_video" : video += "8.28.mp4";break;
			case "download_8_29_video" : video += "8.29.mp4";break;
			case "download_8_30_video" : video += "8.30.mp4";break;
			case "download_8_31_video" : video += "8.31.mp4";break;
			case "download_8_32_video" : video += "8.32.mp4";break;
			case "download_8_33_video" : video += "8.33.mp4";break;
			case "download_8_34_video" : video += "8.34.mp4";break;
			case "download_8_35_video" : video += "8.35.mp4";break;
			case "download_8_36_video" : video += "8.36.mp4";break;
			default : video += "8.37.mp4";break;
		}
		
		return video;
	}
	
	@RequestMapping("/Chapter Eight/Code/Download")
	public String downloadChapterEightCode(@RequestParam("codeName") String codeName) {
				
		String code = "/Manikhwe-School/Java Course Resources/Exercises Code/Part One/Chapter Eight/Exercise ";
		
		switch(codeName) {
			case "download_8_1_code" : code += "8.1.zip";break;
			case "download_8_2_code" : code += "8.2.zip";break;
			case "download_8_3_code" : code += "8.3.zip";break;
			case "download_8_4_code" : code += "8.4.zip";break;
			case "download_8_5_code" : code += "8.5.zip";break;
			case "download_8_6_code" : code += "8.6.zip";break;
			case "download_8_7_code" : code += "8.7.zip";break;
			case "download_8_8_code" : code += "8.8.zip";break;
			case "download_8_9_code" : code += "8.9.zip";break;
			case "download_8_10_code" : code += "8.10.zip";break;
			case "download_8_11_code" : code += "8.11.zip";break;
			case "download_8_12_code" : code += "8.12.zip";break;
			case "download_8_13_code" : code += "8.13.zip";break;
			case "download_8_14_code" : code += "8.14.zip";break;
			case "download_8_15_code" : code += "8.15.zip";break;
			case "download_8_16_code" : code += "8.16.zip";break;
			case "download_8_17_code" : code += "8.17.zip";break;
			case "download_8_18_code" : code += "8.18.zip";break;
			case "download_8_19_code" : code += "8.19.zip";break;
			case "download_8_20_code" : code += "8.20.zip";break;
			case "download_8_21_code" : code += "8.21.zip";break;
			case "download_8_22_code" : code += "8.22.zip";break;
			case "download_8_23_code" : code += "8.23.zip";break;
			case "download_8_24_code" : code += "8.24.zip";break;
			case "download_8_25_code" : code += "8.25.zip";break;
			case "download_8_26_code" : code += "8.26.zip";break;
			case "download_8_27_code" : code += "8.27.zip";break;
			case "download_8_28_code" : code += "8.28.zip";break;
			case "download_8_29_code" : code += "8.29.zip";break;
			case "download_8_30_code" : code += "8.30.zip";break;
			case "download_8_31_code" : code += "8.31.zip";break;
			case "download_8_32_code" : code += "8.32.zip";break;
			case "download_8_33_code" : code += "8.33.zip";break;
			case "download_8_34_code" : code += "8.34.zip";break;
			case "download_8_35_code" : code += "8.35.zip";break;
			case "download_8_36_code" : code += "8.36.zip";break;
			default : code += "8.37.zip";break;
		}
		
		return code;
	}
	
	
	public Optional<Exercise> findById(String exerciseNumber){
		
		return exerciseService.findById(exerciseNumber);
	}
	
	public List<Exercise> findByExerciseNumberGreaterThan(String exerciseNumber){ return exerciseService.findByExerciseNumberGreaterThan(exerciseNumber);}
	public List<Exercise> findByExerciseNumberLessThan(String exerciseNumber){return exerciseService.findByExerciseNumberLessThan(exerciseNumber);}
	
	public void saveAll(List<Exercise> exercises) {
		
		exerciseService.saveAll(exercises);
	}
	
	public Exercise save(Exercise exercise) {
		
		return exerciseService.save(exercise);
	}
	
	public List<Exercise> findAll(){ return exerciseService.findAll();}
}
