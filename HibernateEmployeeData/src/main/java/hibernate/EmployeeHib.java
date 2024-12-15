package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee_table")
public class EmployeeHib {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empid")
	private int eid;
	
	@Column(name ="empname",length=50,nullable=false)
	private String ename;
	
	@Column(name="empemail",length=40,nullable=false,unique=true)
	private String eemail;
	
	@Column(name="empfees",nullable=false)
	private float esalary;
	
	@Column(name="empdept",nullable=false)
	private String edept;
	
	// generate no argument constructor
	
	public EmployeeHib() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// generate with argument constructor
	
	public EmployeeHib( String ename, String eemail, float esalary, String edept) {
		super();
		//this.eid = eid;
		this.ename = ename;
		this.eemail = eemail;
		this.esalary = esalary;
		this.edept = edept;
	}
//generate get and set method
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

	public String getEemail() {
		return eemail;
	}

	public void setEemail(String eemail) {
		this.eemail = eemail;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}
//generate toString method
	@Override
	public String toString() {
		return "EmployeeHib [eid=" + eid + ", ename=" + ename + ", eemail=" + eemail + ", esalary=" + esalary
				+ ", edept=" + edept + "]";
	}
	
	
	
	
}
