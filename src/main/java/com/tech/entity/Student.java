package com.tech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student 
{
	@Id
	private int id;
	private String firstName;
	private String lastName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return lastName;
	}
	public void setSecondName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
