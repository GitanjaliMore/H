package hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAppOneToMany {
	public static void main(String[] args) {
	   Configuration config = new Configuration();
	   
       config.configure("hibernate.cfg.xml"); // Load configuration file
       config.addAnnotatedClass(Department1.class);
       config.addAnnotatedClass(Employee1.class);

       // Build SessionFactory
       SessionFactory sf = config.buildSessionFactory();

       // Open session
       Session sess = sf.openSession();
       // Begin transaction
       Transaction tx = sess.beginTransaction();
       
       //Department1 dob = new Department1 ("IT","Satara");
       //sess.save(dob);
       
       Department1 dob1 = new Department1 ("Sales","Pune");
       Department1 dob2 = new Department1 ("Account","Mumbai");
       
       //Employee1 e1 = new Employee1("Gitanjali","gitanjali@gmail.com",23,67785);
	   //Employee1 e2 = new Employee1("Sanskriti","sanskriti@gmail.com",24,67664);
	   //Employee1 e3 = new Employee1("Nikita", "nikita.com", 25, 67986);
	   //Employee1 e4 = new Employee1("Pratiksha", "pratiksha@gmail.com", 21, 69808);
		
     Employee1 e1 = new Employee1("Priya","priya@gmail.com",22,25685);
	 Employee1 e2 = new Employee1("Sita","sita@gmail.com",25,35664);
	 
		//List<Employee1> elist = new ArrayList<Employee1>();
		//elist.add(e1);
		//elist.add(e2);
		//elist.add(e3);
		//elist.add(e4);
	List<Employee1> elist1 = new ArrayList<Employee1>();
	elist1.add(e1);
	
	List<Employee1> elist2 = new ArrayList<Employee1>();
	elist2.add(e2);
	
		//dob.setEmplist(elist);
	
	dob1.setEmplist(elist1);
	dob2.setEmplist(elist2);

	sess.save(dob1);
	sess.save(dob2);
	
    // Commit transaction
       tx.commit();
       sess.close();
	}
}
