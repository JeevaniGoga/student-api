package com.kethan.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "student", 
       uniqueConstraints = @UniqueConstraint(
       name = "emailid_unique", 
       columnNames = "emailId")
       )
public class Student {

	@Id
	@SequenceGenerator(name = "student_sequence", 
	                   sequenceName = "student_sequence", 
	                   allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
	                           generator = "student_sequence")
	private long studentId;
	private String firstName;
	private String lastName;
	@Column(nullable = false)
	private String emailId;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_enrolled", 
	           joinColumns = @JoinColumn(name = "teacher_id"), 
	           inverseJoinColumns = @JoinColumn(name = "student_id"))
	private List<Teacher> teacher = new ArrayList<>();
	
	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public void addTeacher(Teacher teacher1) {
		teacher.add(teacher1);	
	}

}
