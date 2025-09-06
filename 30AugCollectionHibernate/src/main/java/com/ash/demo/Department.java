package com.ash.demo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	@Id
	@Column(name="dId")
	int dId;
	@Column(name="dName")
	String dName;
	@Column(name="dLoc")
    String dLoc;
    
	@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)
    List<Employee> emp;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int dId, String dName, String dLoc, List<Employee> emp) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dLoc = dLoc;
		this.emp = emp;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdLoc() {
		return dLoc;
	}

	public void setdLoc(String dLoc) {
		this.dLoc = dLoc;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", dLoc=" + dLoc + ", emp=" + emp + "]";
	}
	
	
    
}
