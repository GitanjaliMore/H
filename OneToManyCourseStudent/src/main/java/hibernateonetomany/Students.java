package hibernateonetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Students_table")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;

    @Column(name = "sname", length = 40, nullable = false)
    private String sname;

    @Column(name = "semail", length = 40, nullable = false, unique = true)
    private String semail;

    @ManyToOne
    @JoinColumn(name = "cid")
    private Course course;

    public Students() {
    }

    public Students(int sid, String sname, String semail) {
        this.sid = sid;
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
        return "Students [sid=" + sid + ", sname=" + sname + ", semail=" + semail + "]";
    }
}

