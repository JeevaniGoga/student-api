package com.kethan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kethan.model.Course;
import com.kethan.model.Teacher;
import com.kethan.service.CourseService;
import com.kethan.service.TeacherService;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@Autowired
	TeacherService teacherService;

	@PostMapping("/add")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	@GetMapping("/all")
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
	}
	
	@PutMapping("/{courseId}/teachers/{teacherId}")
	public Course addCourseToTeacher(@PathVariable Long teacherId,
                                     @PathVariable Long courseId) {
		Teacher teacher = teacherService.getTeacherByTeacherId(teacherId);
		Course course = courseService.getCourseByID(courseId);
		course.setTeacher(teacher);
		courseService.addCourse(course);
		return course;
		
		
	}

}
