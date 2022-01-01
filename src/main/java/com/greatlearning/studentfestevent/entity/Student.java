package com.greatlearning.studentfestevent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	private String name;
	
	private String dept;
	
	private String country;

	public Student(String name, String dept, String country) {
		super();
		this.name = name;
		this.dept = dept;
		this.country = country;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}

	public void setDept(String dept2) {
		// TODO Auto-generated method stub
		
	}

	public void setCountry(String country2) {
		// TODO Auto-generated method stub
		
	}	
}