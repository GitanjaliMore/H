package co.edu.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class EmployeeProject {
	@Id
private int empid;
private String empname;

//ManyToMany Relation ManyEmployee work under project

/*@ManyToMany
@JoinTable
(name="emp_project",
joinColumns = 
{@JoinColumn(name="empid")},
inverseJoinColumns =
{@JoinColumn(name="projectid")}
)*/

@ManyToMany
@JoinTable
(name="emp_project",
joinColumns = {@JoinColumn(name="empid")},
inverseJoinColumns = {@JoinColumn(name="projetcid")}
)

private List<Project> project;

public EmployeeProject() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeeProject(int empid, String empname) {
	super();
	this.empid = empid;
	this.empname = empname;
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


public List<Project> getProject() {
	return project;
}
public void setProject(List<Project> project) {
	this.project = project;
}
@Override
public String toString() {
	return "EmployeeProject [empid=" + empid + ", empname=" + empname + "]";
}




}
