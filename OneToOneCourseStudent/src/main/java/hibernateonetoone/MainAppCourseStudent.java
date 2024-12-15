package hibernateonetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainAppCourseStudent {


	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Course.class);
		config.addAnnotatedClass(Student.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session session =sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Course course = new Course("jft",5000);
		Student student = new Student("Nikita","nikita@gmail.com");
		
		student.setCourse(course);
		
		session.save(student);
		
		tx.commit();
		session.close();
		}


}
