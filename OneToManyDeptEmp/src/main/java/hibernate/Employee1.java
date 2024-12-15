package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee1_table")
public class Employee1 {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int empid;

@Column(name="empname",length=50,nullable=false)
private String empname;

@Column(name="empemail",length=50,nullable=false,unique=true)
private String empemail;

@Column(name="empage",nullable=false)
private int empage;

@Column(name="empsalary",length=50,nullable=false)
private float empsalary;

public Employee1() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee1( String empname, String empemail, int empage, float empsalary) {
	super();
	//this.empid = empid;
	this.empname = empname;
	this.empemail = empemail;
	this.empage = empage;
	this.empsalary = empsalary;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpemail() {
	return empemail;
}
public void setEmpemail(String empemail) {
	this.empemail = empemail;
}
public int getEmpage() {
	return empage;
}
public void setEmpage(int empage) {
	this.empage = empage;
}
public float getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(float empsalary) {
	this.empsalary = empsalary;
}

@ManyToOne
@JoinColumn(name="deptid")
private Department1 department1;

public Department1 getDepartment1() {
	return department1;
}
public void setDepartment1(Department1 department1) {
	this.department1 = department1;
}
@Override
public String toString() {
	return "Employee1 [empid=" + empid + ", empname=" + empname + ", empemail=" + empemail + ", empage=" + empage
			+ ", empsalary=" + empsalary + "]";
}

}
