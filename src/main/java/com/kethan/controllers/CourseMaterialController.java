package com.kethan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kethan.model.Course;
import com.kethan.model.CourseMaterial;
import com.kethan.service.CourseMateralService;
import com.kethan.service.CourseService;

@RestController
public class CourseMaterialController {

	@Autowired
	CourseMateralService courseMaterialService;
	
	@Autowired 
	CourseService courseservice;
	
	@PostMapping("/addCourseMaterial")
	public CourseMaterial addCourseMaterial(@RequestBody CourseMaterial coureMaterial) {		
		return courseMaterialService.addCourseMaterial(coureMaterial);
	}
	
//	@PostMapping("/courseMaterial/{courseId}")
//	public CourseMaterial addCourseMaterialbyCourseId(@RequestBody CourseMaterial coureMaterial,
//			                                          @PathVariable Long courseId) {
//		Course course = courseservice.getCourseByID(courseId);
//		course.setCourseMaterial(coureMaterial);
//		return courseMaterialService.addCourseMaterial(coureMaterial);
//	}
}
