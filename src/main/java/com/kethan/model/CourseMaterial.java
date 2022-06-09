package com.kethan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CourseMaterial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseMaterialId;
	private String url;
	@OneToOne
	@JoinColumn(
			name = "course_id",
			referencedColumnName = "courseId"
			)
	private Course course;

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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
