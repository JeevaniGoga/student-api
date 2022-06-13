package com.kethan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kethan.model.CourseMaterial;

@Repository
public interface CourseMaterialRepo extends JpaRepository<CourseMaterial, Long> {

}
