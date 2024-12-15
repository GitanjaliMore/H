package hibernateonetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course_table")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;

    private String cname;

    private float cfees;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    
    private List<Students> studentsList = new ArrayList<>();

    public Course() {
    }

    public Course(int cid, String cname, float cfees) {
        this.cid = cid;
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

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "Course [cid=" + cid + ", cname=" + cname + ", cfees=" + cfees + "]";
    }
}
