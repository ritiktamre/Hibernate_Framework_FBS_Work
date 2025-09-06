package com.ash.practice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Laptop")
public class Laptop {
	@Id
	@Column(name="name")
    String name;
	@Column(name="price")
    double price;
	@Column(name="model")
    int model;
	
	@ManyToOne(targetEntity = Department.class)
    Department dept;
    
    public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String name, double price, int model, Department dept) {
		super();
		this.name = name;
		this.price = price;
		this.model = model;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + ", model=" + model + ", dept=" + dept + "]";
	}
    
    
}
