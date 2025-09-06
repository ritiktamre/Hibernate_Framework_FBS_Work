package com.ash.ritik;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Car")
public class Car {
	@Id
	@Column(name="modelNo")
    int modelNo;
	@Column(name="carName")
    String carName;
    @ManyToOne(targetEntity = Person.class)
    Person per;
    
    public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int modelNo, String carName, Person per) {
		super();
		this.modelNo = modelNo;
		this.carName = carName;
		this.per = per;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Person getPer() {
		return per;
	}

	public void setPer(Person per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", carName=" + carName + ", per=" + per + "]";
	}
    
    
}
