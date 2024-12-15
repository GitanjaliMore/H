package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Hello Main");
		
		

	Configuration config = new Configuration()
			.configure("edu.cfg.xml")
			.addAnnotatedClass(EmployeeHib.class);
	
	    SessionFactory sf = config.buildSessionFactory();
	    Session sess = sf.openSession();
	    
	    Transaction tx = sess.beginTransaction();
	  // sess.save(emp); //insert record into table
	    
	    //First level cache
	    //select * from employee where empid=1";
	    EmployeeHib eob = sess.get(EmployeeHib.class, 1);
	    System.out.println(eob);
	    
	   // checks in first level , second time it will not go database
	    EmployeeHib eob1 = sess.get(EmployeeHib.class, 1);
	    System.out.println(eob1);
	 
	    tx.commit();
	    sess.close();
	    
	    /////////////////
Session sess1 = sf.openSession();
	    
	    Transaction tx1 = sess1.beginTransaction();
	  // sess.save(emp); //insert record into table
	    
	    //First level cache
	    EmployeeHib eob2 = sess1.get(EmployeeHib.class, 1);
	    System.out.println(eob);
	    
	   // checks in first level , second time it will not go database
	    EmployeeHib eob3 = sess1.get(EmployeeHib.class, 1);
	    System.out.println(eob1);
	 
	    tx1.commit();
	    sess1.close();
	
	
	}

}
