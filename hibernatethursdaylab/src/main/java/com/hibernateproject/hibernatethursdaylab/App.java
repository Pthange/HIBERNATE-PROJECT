package com.hibernateproject.hibernatethursdaylab;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "PROJECT STARTED" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        //creating the sesssion factory
        SessionFactory factory=cfg.buildSessionFactory();
        //System.out.println(factory.isClosed());
        
      //creating the object of  CUSTOMER entity class
        Customer c1=new Customer(); 
        //setting the value of the values
        c1.setCid(101);
        c1.setCname("Rahul");
        c1.setCity("Pune");
        c1.setContact_number("9245786345");
       
        
        //creating the object of PRODUCT
        Product p1=new Product();
        p1.setPid(201);
        p1.setPname("SmartWatch");
        p1.setPrice(2054);
        p1.setExpirary_Date("20-05-2034");
        
        //passing the object of PRODUCT in CUSTOMER
        c1.setProj(p1);
        
        //opening the session
        Session session=factory.openSession();
        
        //starting the transaction
        Transaction tx=session.beginTransaction();
        session.save(c1); //saving the object C1
        session.save(p1); //saving the object P1
        tx.commit();
        
        session.close();
        factory.close();
        
        
    }
}
