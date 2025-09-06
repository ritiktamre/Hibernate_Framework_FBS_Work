import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue(value = "D")
@Table(name="Developer")//
public class Developer extends Employee {
    String skill;
    
    public Developer() {
		// TODO Auto-generated constructor stub
    	
	}

	public Developer(int id, String name, double salary, String skill) {
		super(id,name,salary);
		this.skill = skill;
	}

	String getSkill() {
		return skill;
	}

	void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return super.toString()+"Developer [skill=" + skill + "]";
	}
    
    
}
