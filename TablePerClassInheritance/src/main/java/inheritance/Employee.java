package inheritance;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
@Inheritance
@DiscriminatorColumn(name="Emptype")
@DiscriminatorValue(value = "E")
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
