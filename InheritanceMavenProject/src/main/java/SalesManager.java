import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue(value = "SM")
@Table(name="SalesManager")//
public class SalesManager extends Employee {
   double  target;
   int teamSize;
   
   public SalesManager() {
	// TODO Auto-generated constructor stub
	  }

public SalesManager(int id, String name, double salary, double target, int teamSize) {
	super(id,name,salary);
	this.target = target;
	this.teamSize = teamSize;
}

double getTarget() {
	return target;
}

void setTarget(double target) {
	this.target = target;
}

int getTeamSize() {
	return teamSize;
}

void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}

@Override
public String toString() {
	return super.toString()+"SalesManager [target=" + target + ", teamSize=" + teamSize + "]";
}

}
   
   
  