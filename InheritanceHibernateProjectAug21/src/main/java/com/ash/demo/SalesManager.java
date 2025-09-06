package com.ash.demo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="SalesManager")
//@DiscriminatorValue(value="Sm")
public class SalesManager extends Employee{
   
	Double incentive;
	int target;
	
	public SalesManager() {
		// TODO Auto-generated constructor stub
	}

	public SalesManager(int id, String name, double salary, Double incentive, int target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
	}

	public Double getIncentive() {
		return incentive;
	}

	public void setIncentive(Double incentive) {
		this.incentive = incentive;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "SalesManager [incentive=" + incentive + ", target=" + target + "]";
	}
	
	
}
