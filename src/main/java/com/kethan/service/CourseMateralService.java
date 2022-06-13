package com.kethan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kethan.model.CourseMaterial;
import com.kethan.repository.CourseMaterialRepo;

@Service
public class CourseMateralService {
	
	@Autowired
	CourseMaterialRepo courseMaterialrepo;

	public CourseMaterial addCourseMaterial(CourseMaterial coureMaterial) {
		return courseMaterialrepo.save(coureMaterial);
	}

	
}
