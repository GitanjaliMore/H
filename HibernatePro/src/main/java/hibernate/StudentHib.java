package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student_table")
public class StudentHib {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
	private int sid;
	
	@Column(name ="studentname",length=50,nullable=false)
	private String sname;
	
	@Column(name="studentemail",length=40,nullable=false,unique=true)
	private String semail;
	
	@Column(name="studentfees",nullable=false)
	private float fees;
// generate no argument constructor
	public StudentHib() {
		super();
		// TODO Auto-generated constructor stub
	}
	//generate with argument constructor
    public StudentHib( String sname, String semail, float fees) {
	  super();
	 //this.sid = sid;
	  this.sname = sname;
	  this.semail = semail;
	  this.fees = fees;
}

//generate set and get method
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}
//generate to string method
	@Override
	public String toString() {
		return "StudentHib [ sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", fees=" + fees + "]";
	}
	
}
