package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //makes class as table with the same class name
@Table(name="emp_table") //to change table name
public class EmployeeHib {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto generarate
	@Column(name="empid")
   private int eid;
	@Column(name="empname",length = 50, nullable = false)
   private String ename;
	@Column(name="empsalary", nullable = false)
   private float esalary;
   
 //constr with no arg
   public EmployeeHib() {
		super();
		// TODO Auto-generated constructor stub
	}

//constr with arg
public EmployeeHib( String ename, float esalary) {
	super();
	//this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
}

//setter and getter method
public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public float getEsalary() {
	return esalary;
}

public void setEsalary(float esalary) {
	this.esalary = esalary;
}

//toString
@Override
public String toString() {
	return "EmployeeHib [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
 }
      
}
