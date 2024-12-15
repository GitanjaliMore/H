package hibernateonetoone;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="course_table1")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    
    @Column(name="cname",length = 40, nullable = false, unique = true)
    private String cname;
    
    @Column(name="cfees",nullable = false)
    private float cfees;
    
    //one Course One Student
    @OneToOne(mappedBy = "course")
    private Student student;
    
    
    public Course() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Course(String cname, float cfees) {
        super();
        this.cname = cname;
        this.cfees = cfees;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public float getCfees() {
        return cfees;
    }

    public void setCfees(float cfees) {
        this.cfees = cfees;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Course [cid=" + cid + ", cname=" + cname + ", cfees=" + cfees + "]";
    }
    
    
    
}

