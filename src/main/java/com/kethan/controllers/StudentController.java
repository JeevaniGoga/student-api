package com.kethan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kethan.model.Student;
import com.kethan.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/students/{emailId}")
	public Student getStudentByemailId(@PathVariable String emailId) {
		return studentService.getStudentbyEmailId(emailId);
	}
	
	@GetMapping("/studentFirstName/{emailId}")
	public String getStudentFirstNameByEmailId(@PathVariable String emailId) {
		return studentService.getStudentFirstNameByEmailId(emailId);
	}
	
	@PutMapping("/Student/{emailId}")
	public int updateStudentNameByEmailId(@RequestBody String firstName, @PathVariable String emailId) {
		return studentService.updateStudentNameByEmailId(firstName, emailId);
	}
}
