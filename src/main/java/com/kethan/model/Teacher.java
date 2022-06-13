package com.kethan.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Teacher {

	@Id
	@SequenceGenerator(
			name = "teacher_sequence",
			sequenceName = "teacher_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "teacher_sequence"
			)
	private long teacherId;
	private String firstName;
	private String lastName;
	
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL,
			    mappedBy = "teacher",
			    fetch = FetchType.LAZY)			     
	private List<Student> student = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Course> course;	

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setStudent(Student student1) {
		student.add(student1);
	}

}
