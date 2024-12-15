package hibernateonetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAppCourseStudent {
    public static void main(String[] args) {
        Configuration config = new Configuration();

        config.configure(); // Load configuration file
        config.addAnnotatedClass(Course.class);
        config.addAnnotatedClass(Students.class);

        // Build SessionFactory
        SessionFactory sf = config.buildSessionFactory();

        // Open session
        Session sess = sf.openSession();
        // Begin transaction
        Transaction tx = sess.beginTransaction();

        // Create Course
        Course cobj = new Course();
        cobj.setCname("Java");
        cobj.setCfees(2000);

        // Create Students
        Students s1 = new Students();
        s1.setSname("Gitanjali");
        s1.setSemail("gitanjali@gmail.com");
        s1.setCourse(cobj);

        Students s2 = new Students();
        s2.setSname("Nikita");
        s2.setSemail("nikita@gmail.com");
        s2.setCourse(cobj);

        Students s3 = new Students();
        s3.setSname("Priya");
        s3.setSemail("priya@gmail.com");
        s3.setCourse(cobj);

        // Add students to course
        List<Students> slist = new ArrayList<>();
        slist.add(s1);
        slist.add(s2);
        slist.add(s3);
        cobj.setStudentsList(slist);

        // Save course (cascade will save students)
        sess.save(cobj);

        tx.commit();
        sess.close();
    }
}
