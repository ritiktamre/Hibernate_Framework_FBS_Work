package com.ash.demo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@Column(name="roll")
  int roll;
	
	@Column(name="name")
  String name;
	
	@Column(name="marks")
  double marks;
  
	@OneToMany(mappedBy = "stu",cascade = CascadeType.ALL)
  List<Course> crs;
  
  public Student() {
	// TODO Auto-generated constructor stub
}

public Student(int roll, String name, double marks, List<Course> crs) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	this.crs = crs;
}

public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getMarks() {
	return marks;
}

public void setMarks(double marks) {
	this.marks = marks;
}

public List<Course> getCrs() {
	return crs;
}

public void setCrs(List<Course> crs) {
	this.crs = crs;
}

@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", crs=" + crs + "]";
}
  
  
}
