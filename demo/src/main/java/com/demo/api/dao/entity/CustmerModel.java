package com.demo.api.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="SkillRatCustmer")
public class CustmerModel {
	 @Id
	 @GeneratedValue
	 
	 @Column(name="ID")
	 private String longId;
	 
	 @Column(name="FirstName")
	 private String firstName;
	 
	 @Column(name="LastName")
	 private String lastName;
	 
	 @Column(name="email")
	 private String email;
	 
	 @Column(name="MobileNumber")
	 private String mobileNumber;
	 
	 @Column(name="Password")
	 private  String password;

	public String getLongId() {
		return longId;
	}

	public void setLongId(String longId) {
		this.longId = longId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	 
	 
	 

	
}
