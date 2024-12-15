package hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        // Create Hibernate Configuration
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml"); // Load configuration file
        config.addAnnotatedClass(StudentHib.class);

        // Build SessionFactory
        SessionFactory sf = config.buildSessionFactory();

        // Open session
        Session sess = sf.openSession();

        // Begin transaction
        Transaction tx = sess.beginTransaction();

        // Create a new StudentHib object
        StudentHib sob1 = new StudentHib("Ketaki","ketaki@gmail.com", 3000);
        StudentHib sob2 = new StudentHib("Sanskriti","sanskriti@gmail.com", 4000);
        StudentHib sob3 = new StudentHib("Kiran","kiran@gmail.com", 5000);
        StudentHib sob4 = new StudentHib("Priya","priya@gmail.com", 6000);
        StudentHib sob5 = new StudentHib("Aaparna","aparna@gmail.com", 7000);
        // Save the student to the database
        sess.save(sob1);
        sess.save(sob2);
        sess.save(sob3);
        sess.save(sob4);
        sess.save(sob5);
        
        //Fetch record
       //StudentHib sob = sess.get(StudentHib.class,1);
       //System.out.println(sob);
         //System.out.println("id="+sob.getSid());
         //System.out.println("Name="+sob.getSname());
         //System.out.println("Email="+sob.getSemail());
         //System.out.println("Fees="+sob.getFees());

        // Commit transaction
        tx.commit();

        //Retrieve the student
        //StudentHib retrievedStudent = sess.get(StudentHib.class, 1);
        //System.out.println("Retrieved Student: " + retrievedStudent);

        // Close session and SessionFactory
        sess.close();
        
    }
}
