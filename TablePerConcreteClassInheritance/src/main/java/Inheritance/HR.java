package Inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="HR")
public class HR extends Employee{
	double commision;
	
	public HR() {
		// TODO Auto-generated constructor stub
	}

	public HR(int id, String name, double salary, double commision) {
		super(id, name, salary);
		this.commision = commision;
	}

	double getCommision() {
		return commision;
	}

	void setCommision(double commision) {
		this.commision = commision;
	}

	@Override
	public String toString() {
		return super.toString()+"HR [commision=" + commision + "]";
	}
	
	
	
	

}
