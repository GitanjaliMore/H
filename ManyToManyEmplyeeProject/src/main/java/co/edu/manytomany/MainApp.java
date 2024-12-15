package co.edu.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainApp {

	public static void main(String[] args) {
		 Configuration config = new Configuration()
				  .configure("hibernate.cfg.xml")
				  .addAnnotatedClass(EmployeeProject.class)
				  .addAnnotatedClass(Project.class);
		  
		  SessionFactory sf = config.buildSessionFactory();
		  Session session = sf.openSession();
		  Transaction tx= session.beginTransaction();
		  
		  
		  
		  EmployeeProject e1=new EmployeeProject(1111,"Navya");
		  EmployeeProject e2=new EmployeeProject(1112,"Komal");
		 
		  
		  Project p1=new Project(1,"Angular Ecommerce");
		  Project p2=new Project(2,".Net Food Delivey");
		  
		  List<EmployeeProject>elist=new ArrayList<EmployeeProject>();
		  //add employees to list
		  elist.add(e1);
		  elist.add(e2);
		  
		  List<Project>plist=new ArrayList<Project>();
		  plist.add(p1);
		  plist.add(p2);
		  
		  
		 e1.setProject(plist);
		 p1.setEmployeeproject(elist);
		 
		 
		 session.save(e1);
		 session.save(e2);
		 session.save(p1);
		 session.save(p2);
		  tx.commit();
		  session.close();
		  
		  
		  
	     
		}

}
