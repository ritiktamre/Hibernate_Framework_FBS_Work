package com.ash.demo;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity

public class SalesManager extends Employee {

	double incentive;
	int target;
	
	public SalesManager() {
		// TODO Auto-generated constructor stub
	}

	public SalesManager(int id, String name, double salary, double incentive, int target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
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
