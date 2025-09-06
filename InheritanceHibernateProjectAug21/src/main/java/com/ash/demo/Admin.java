package com.ash.demo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Admin")
//@DiscriminatorValue(value = "Ad")
public class Admin extends Employee{
  
	double allowance;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return "Admin [allowance=" + allowance + "]";
	}
	
	
}
