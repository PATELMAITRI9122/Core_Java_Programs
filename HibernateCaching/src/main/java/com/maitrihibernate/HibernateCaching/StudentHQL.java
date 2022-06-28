package com.maitrihibernate.HibernateCaching;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_marks_details")
public class StudentHQL {
	
	@Id
	private int rollNo;
	private String name;
	private int marks;
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "StudentHQL [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
