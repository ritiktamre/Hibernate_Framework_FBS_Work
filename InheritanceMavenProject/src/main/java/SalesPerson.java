import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue(value = "SP")
@Table(name="SalesPerson")//
public class SalesPerson extends Employee{
    double incentive;
    
    public SalesPerson() {
		// TODO Auto-generated constructor stub
	}

	public SalesPerson(int id, String name, double salary, double incentive) {
		super(id,name,salary);
		this.incentive = incentive;
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	@Override
	public String toString() {
		return super.toString()+"SalesPerson [incentive=" + incentive + "]";
	}
    
    
}
