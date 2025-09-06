package inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="Ad")
public class Admin extends Employee{
	double allowance;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return super.toString()+"Admin [allowance=" + allowance + "]";
	}
	
	

}
