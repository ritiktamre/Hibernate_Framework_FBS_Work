package com.ash.practice;

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
	@Column(name="did")
     int did;
	@Column(name="dname")
     String dname;
	@Column(name="dloc")
     String dloc;
	
	@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)
    List<Laptop>lap;
    
    public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String dname, String dloc, List<Laptop> lap) {
		super();
		this.did = did;
		this.dname = dname;
		this.dloc = dloc;
		this.lap = lap;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDloc() {
		return dloc;
	}

	public void setDloc(String dloc) {
		this.dloc = dloc;
	}

	public List<Laptop> getLap() {
		return lap;
	}

	public void setLap(List<Laptop> lap) {
		this.lap = lap;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", dloc=" + dloc + ", lap=" + lap + "]";
	}
    
    
}
