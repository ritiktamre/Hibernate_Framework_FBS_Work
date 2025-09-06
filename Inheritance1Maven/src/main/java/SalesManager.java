import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="SalesManager")
@DiscriminatorValue(value = "SM")//
public class SalesManager extends Employee {
   double insentive;
   int target;
   
   public SalesManager() {
	// TODO Auto-generated constructor stub
}

public SalesManager(int id, String name, double salary, double insentive, int target) {
	super(id, name, salary);
	this.insentive = insentive;
	this.target = target;
}

double getInsentive() {
	return insentive;
}

void setInsentive(double insentive) {
	this.insentive = insentive;
}

int getTarget() {
	return target;
}

void setTarget(int target) {
	this.target = target;
}

@Override
public String toString() {
	return super.toString()+"SalesManager [insentive=" + insentive + ", target=" + target + "]";
}
   
   
}
