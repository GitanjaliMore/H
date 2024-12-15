package co.edu.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Project {
	@Id
private int projectid;
	private String projectname;

@ManyToMany(mappedBy = "project")
private List<EmployeeProject> employeeproject;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
public Project(int projectid, String projectname) {
		super();
		this.projectid = projectid;
		this.projectname = projectname;
	}


public List<EmployeeProject> getEmployeeproject() {
	return employeeproject;
}
public void setEmployeeproject(List<EmployeeProject> employeeproject) {
	this.employeeproject = employeeproject;
}
@Override
public String toString() {
	return "Project [projectid=" + projectid + ", projectname=" + projectname + "]";
}


}
