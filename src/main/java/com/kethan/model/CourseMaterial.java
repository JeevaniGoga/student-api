package com.kethan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class CourseMaterial {

	@Id
	@SequenceGenerator(
			name = "course_sequence",
			sequenceName = "course_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "course_sequence"
			)
	private long courseMaterialId;
	private String url;
	@OneToOne(cascade = CascadeType.ALL,
			  fetch = FetchType.LAZY)
			  
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
