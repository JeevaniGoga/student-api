package com.kethan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kethan.model.Student;
import com.kethan.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public Student getStudentbyEmailId(String emailId) {
		return studentRepository.getStudentbyEmailID(emailId);
	}
	
	public String getStudentFirstNameByEmailId(String emailId) {
		return studentRepository.getStudentFirstNameByEmailId(emailId);
	}
	
	public int updateStudentNameByEmailId(String firstName, String emailId) {
		return studentRepository.updateStudentNameByEmailId(firstName, emailId);
	}

}
