package com.demo.api.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ARMYDETAILS")
public class ArmyModel {
   @Id
   @GeneratedValue
   @Column(name="ID")
   private long id;
   
   @Column(name="FirstName")
   private String firstName;
   
   @Column(name="LastName")
   private String lastName;
   
   @Column(name="Address")
   private String address;
   
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
   
}
