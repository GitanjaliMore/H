package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Department1_table")
public class Department1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptid;
	
	@Column(length=50,nullable=false)
	private String deptname;
	
	@Column(length=50,nullable=false)
	private String deptlocation;
	
	
	public Department1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Department1( String deptname, String deptlocation) {
		super();
		//this.deptid = deptid;
		this.deptname = deptname;
		this.deptlocation = deptlocation;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptlocation() {
		return deptlocation;
	}
	public void setDeptlocation(String deptlocation) {
		this.deptlocation = deptlocation;
	}
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="deptid")
	private List<Employee1> emplist = new ArrayList<Employee1>();
	
	public List<Employee1> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee1> emplist) {
		this.emplist = emplist;
	}

	@Override
	public String toString() {
		return "Department1 [deptid=" + deptid + ", deptname=" + deptname + ", deptlocation=" + deptlocation + "]";
	}

}
