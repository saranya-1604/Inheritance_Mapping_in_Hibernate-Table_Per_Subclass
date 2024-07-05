package com.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="trainee103")
@PrimaryKeyJoinColumn(name="ID")
public class Trainee extends Employee {
private int payperhour;
private String contractperiod;
public Trainee(int payperhour, String contractperiod) {
	super();
	this.payperhour = payperhour;
	this.contractperiod = contractperiod;
}
public Trainee() {
	super();
}
public Trainee(String name, int payperhour, String contractperiod) {
	// TODO Auto-generated constructor stub
	super(name);
	this.payperhour=payperhour;
	this.contractperiod=contractperiod;
}
public int getPayperhour() {
	return payperhour;
}
public void setPayperhour(int payperhour) {
	this.payperhour = payperhour;
}
public String getContractperiod() {
	return contractperiod;
}
public void setContractperiod(String contractperiod) {
	this.contractperiod = contractperiod;
} 
}
