package com.kethan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kethan.model.Course;
import com.kethan.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;

	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
	}

}
