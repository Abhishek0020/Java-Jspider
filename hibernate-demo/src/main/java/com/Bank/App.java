package com.Bank;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Session session = HibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();

         Account acc = new Account(102, "Abhi", 5000);
 
         session.persist(acc);

         tx.commit();
         session.close();

         System.out.println("Data saved successfully!");
     }
}
