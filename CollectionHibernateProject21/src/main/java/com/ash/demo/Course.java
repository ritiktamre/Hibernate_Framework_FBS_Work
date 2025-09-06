package com.ash.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
	@Id
	@Column(name="cname")
    String cname;
	
	@Column(name="cduration")
    String cduration;
    
	@ManyToOne(targetEntity = Student.class)
    Student stu;
    
    public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String cname, String cduration, Student stu) {
		super();
		this.cname = cname;
		this.cduration = cduration;
		this.stu = stu;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCduration() {
		return cduration;
	}

	public void setCduration(String cduration) {
		this.cduration = cduration;
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "Course [cname=" + cname + ", cduration=" + cduration + ", stu=" + stu + "]";
	}
    
    
}
