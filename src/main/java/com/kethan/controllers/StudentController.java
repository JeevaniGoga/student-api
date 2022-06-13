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

import com.kethan.model.Student;
import com.kethan.model.Teacher;
import com.kethan.service.StudentService;
import com.kethan.service.TeacherService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	TeacherService teacherService;

	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping("/all")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{emailId}")
	public Student getStudentByemailId(@PathVariable String emailId) {
		return studentService.getStudentbyEmailId(emailId);
	}
	
	@GetMapping("/studentFirstName/{emailId}")
	public String getStudentFirstNameByEmailId(@PathVariable String emailId) {
		return studentService.getStudentFirstNameByEmailId(emailId);
	}
	
	@PutMapping("/Student/{emailId}")
	public int updateStudentNameByEmailId(@RequestBody String firstName, 
			                              @PathVariable String emailId) {
		return studentService.updateStudentNameByEmailId(firstName, emailId);
	}
	
	@PutMapping("/{studentId}/teachers/{teacherId}")
	public Student addTeacherByStudentId(@PathVariable Long studentId,
			                             @PathVariable Long teacherId) {
		
		Teacher teacher = teacherService.getTeacherByTeacherId(teacherId);
		Student student = studentService.getStudentByStudentId(studentId);	
		student.addTeacher(teacher);
		studentService.addStudent(student);
		return student;
	}
}
