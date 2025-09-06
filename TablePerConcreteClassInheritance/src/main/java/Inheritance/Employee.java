package Inheritance;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Employee {
	@Id
	@Column(name="id")
   int id;
	
	@Column(name="name")
   String name;
	
	@Column(name="salary")
   double salary;
   
   public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

//public Employee(int id2, String name2, double salary2) {
//	// TODO Auto-generated constructor stub
//}

int getId() {
	return id;
}

void setId(int id) {
	this.id = id;
}

String getName() {
	return name;
}

void setName(String name) {
	this.name = name;
}

double getSalary() {
	return salary;
}

void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
   
   
}
