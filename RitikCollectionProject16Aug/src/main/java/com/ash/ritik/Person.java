package com.ash.ritik;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Person")
public class Person {
	@Id
	@Column(name="id")
   int id;
	@Column(name="name")
   String name;
	@Column(name="salary")
   double salary;
   
	@OneToMany(mappedBy = "per",cascade = CascadeType.ALL)
	List<Car> c1;
	
   public Person() {
	// TODO Auto-generated constructor stub
}

public Person(int id, String name, double salary, List<Car> c1) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.c1 = c1;
}

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

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public List<Car> getC1() {
	return c1;
}

public void setC1(List<Car> c1) {
	this.c1 = c1;
}

@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", salary=" + salary + ", c1=" + c1 + "]";
}

   
}
