package com.kethan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kethan.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
