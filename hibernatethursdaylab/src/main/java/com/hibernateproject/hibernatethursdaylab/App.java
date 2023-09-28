package com.hibernateproject.hibernatethursdaylab;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//System.out.println( "Hello World!" );
    	System.out.println( "PROJECT STARTED" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        //creating the sesssionfactory
        SessionFactory factory=cfg.buildSessionFactory();
        //System.out.println(factory.isClosed());
        
        Customer c1=new Customer(); //creating the object of entity class customer
      //setting the value of the values
        c1.setCid(102);
        c1.setCname("RAM");
        c1.setCity("Delhi");
        c1.setContact_number("9457364896");
       
        Customer c2=new Customer(); //creating the object of entity class customer
        //setting the value of the values
          c2.setCid(104);
          c2.setCname("Ajay");
          c2.setCity("Delhi");
          c2.setContact_number("7265489354");
          
        //creating the object of PRODUCT
        Product p1=new Product();
        p1.setPid(205);
        p1.setPname("SmartTV");
        p1.setPrice(20054);
        p1.setExpirary_Date("20-05-2034");
        
        //passing the object of project in student
        c1.setProj(p1);
        c2.setProj(p1);
        
        //passing the object of project in customer
        List<Customer>cus1=new ArrayList<Customer>();
        cus1.add(c1);
        cus1.add(c2);
        
        p1.setCus(cus1); //setting the customer list in product
        
        //opening the session
        Session session=factory.openSession();
        
        //starting the transaction
        Transaction tx=session.beginTransaction();
        session.save(c1); // saving the object
        session.save(c2); // saving the object
        session.save(p1);
        tx.commit();
        
        session.close();
        factory.close();
        
        
    }
}
