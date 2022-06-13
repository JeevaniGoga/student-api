package com.kethan.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kethan.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("select s from Student s where s.emailId = ?1")
	Student getStudentbyEmailID(String emailId);
	
	
	@Query("select s.firstName from Student s where s.emailId = ?1")
	String getStudentFirstNameByEmailId(String emailID);
	
	
	@Transactional
	@Modifying
	@Query(
			value = "update student set first_name = ?1 where email_id = ?2",
			nativeQuery = true
			)
	int updateStudentNameByEmailId(String firstName, String emailId);
	
}
