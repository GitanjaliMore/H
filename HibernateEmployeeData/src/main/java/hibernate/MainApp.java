package hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create Hibernate Configuration
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml"); // Load configuration file
        config.addAnnotatedClass(EmployeeHib.class);

        // Build SessionFactory
        SessionFactory sf = config.buildSessionFactory();

        // Open session
        Session sess = sf.openSession();

        // Begin transaction
        Transaction tx = sess.beginTransaction();

     // Create a new EmployeeHib object
        
        //EmployeeHib sob = new EmployeeHib("Gitanjali","gitanjali@gmail.com",35000,"IT");
        
     // Save the student to the database
        //sess.save(sob);
        // Create a new StudentHib object
      //EmployeeHib sob1 = new EmployeeHib("Ketaki","ketaki@gmail.com", 3500,"Account");
      //EmployeeHib sob2 = new EmployeeHib("Sanskriti","sanskriti@gmail.com", 20000,"Manager");
      //EmployeeHib sob3 = new EmployeeHib("Kiran","kiran@gmail.com", 15000,"Networking");
      //EmployeeHib sob4 = new EmployeeHib("Priya","priya@gmail.com", 26000,"Finance");
      //EmployeeHib sob5 = new EmployeeHib("Aaparna","aparna@gmail.com", 17000,"IT");
        // Save the student to the database
        //sess.save(sob1);
        //sess.save(sob2);
        //sess.save(sob3);
        //sess.save(sob4);
        //sess.save(sob5);
        
        //Fetch record
        EmployeeHib sob = sess.get(EmployeeHib.class,1);
       System.out.println(sob);
         System.out.println("id="+sob.getEid());
         System.out.println("Name="+sob.getEname());
         System.out.println("Email="+sob.getEemail());
         System.out.println("Fees="+sob.getEsalary());
         System.out.println("Dept="+sob.getEemail());
	
     // Commit transaction
        tx.commit();

     // Close session and SessionFactory
        sess.close();
	}
	
	

}
