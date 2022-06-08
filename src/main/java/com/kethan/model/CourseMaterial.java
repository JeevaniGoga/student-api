package com.kethan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CourseMaterial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseMaterialId;
	private String url;

	public long getCourseMaterialId() {
		return courseMaterialId;
	}

	public void setCourseMaterialId(long courseMaterialId) {
		this.courseMaterialId = courseMaterialId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
