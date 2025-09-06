package com.ash.practice;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="SalesManager")
//@DiscriminatorValue(value="SM")
public class SalesManager extends Employee {
	
	double incentive;
	double target;
	
	public SalesManager() {
		// TODO Auto-generated constructor stub
	}

	public SalesManager(int id, String name, double salary, double incentive, double target) {
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

	public double getTarget() {
		return target;
	}

	public void setTarget(double target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "SalesManager [incentive=" + incentive + ", target=" + target + "]";
	}
	
	
}