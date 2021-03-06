package com.kethan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Guardian {

	@Id
	private String name;
	private String emailId;
	private String mobile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
