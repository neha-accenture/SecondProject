package com.mappingProject.Mappingproject.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentData")
public class studentnfo {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String courseName;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private StudentAddress studentAdd;
//	
//	public StudentAddress getStudentAdd() {
//		return studentAdd;
//	}
//	public void setStudentAdd(StudentAddress studentAdd) {
//		this.studentAdd = studentAdd;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
