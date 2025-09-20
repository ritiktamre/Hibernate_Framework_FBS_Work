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
  @Column(name="did")
  int did;
  @Column(name="dname")
  String dname;
  @Column(name="dloc")
  String dloc;
  
  @OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)
  List<Employee> emp;
  
  public Department() {
	// TODO Auto-generated constructor stub
}

public Department(int did, String dname, String dloc, List<Employee> emp) {
	super();
	this.did = did;
	this.dname = dname;
	this.dloc = dloc;
	this.emp = emp;
}

public int getDid() {
	return did;
}

public void setDid(int did) {
	this.did = did;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public String getDloc() {
	return dloc;
}

public void setDloc(String dloc) {
	this.dloc = dloc;
}

public List<Employee> getEmp() {
	return emp;
}

public void setEmp(List<Employee> emp) {
	this.emp = emp;
}

@Override
public String toString() {
	return "Department [did=" + did + ", dname=" + dname + ", dloc=" + dloc + ", emp=" + emp + "]";
}
  
  
}
