package hibernateonetoone;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_table1")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int sid;
    
    @Column(name="sname",length = 40,nullable = false)
 private String sname;
    
    @Column(name="semail",length = 40, nullable = false,unique = true)
 private String semail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cid")
    private Course course;
    
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Student(String sname, String semail) {
        super();
        this.sname = sname;
        this.semail = semail;
    }

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

    

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + "]";
    }
    
    
    
}

