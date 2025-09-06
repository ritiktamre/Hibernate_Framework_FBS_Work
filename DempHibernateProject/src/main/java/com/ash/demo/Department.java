package com.ash.demo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	@Id
	@Column(name="d_id")
  int d_id;
	@Column(name="d_name")
  String d_name;
	@Column(name="d_loc")
  String d_loc;
  
	@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)
  List<Employee> e1;
  
  public Department() {
	// TODO Auto-generated constructor stub
}

public Department(int d_id, String d_name, String d_loc, List<Employee> e1) {
	super();
	this.d_id = d_id;
	this.d_name = d_name;
	this.d_loc = d_loc;
	this.e1 = e1;
}

public int getD_id() {
	return d_id;
}

public void setD_id(int d_id) {
	this.d_id = d_id;
}

public String getD_name() {
	return d_name;
}

public void setD_name(String d_name) {
	this.d_name = d_name;
}

public String getD_loc() {
	return d_loc;
}

public void setD_loc(String d_loc) {
	this.d_loc = d_loc;
}

public List<Employee> getE1() {
	return e1;
}

public void setE1(List<Employee> e1) {
	this.e1 = e1;
}

@Override
public String toString() {
	return "Department [d_id=" + d_id + ", d_name=" + d_name + ", d_loc=" + d_loc + ", e1=" + e1 + "]";
}
  
  
}
