package com.maitrihibernate.HibernatePersistanceLifeCycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		

		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session session = sf.openSession();
		session.beginTransaction();
		
		//Transient State
		Laptop lap = new Laptop();
		lap.setLid(10);
		lap.setName("Lenavo");
		lap.setPrice(850);
		
		//Persistant State
		session.save(lap);
		
		//Persistant State
		lap.setPrice(750);
		
		
		
		session.getTransaction().commit();
		//session.detach(lap);
		//lap.setPrice(600);
	
		
	}
}
