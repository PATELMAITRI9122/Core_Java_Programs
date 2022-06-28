package com.maitri.DemoHibernate;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.Transaction;

/**
 * 
 * @author Maitri
 * @since 2022-05-31
 * @version 1.0
 * 
 *          App class have the main method Demoing Hibernate Concept
 *
 */

public class App {
	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		
		System.out.println("Hello There!");
		session.getTransaction().commit();
		
	
	

		/* First Code
		 * //Alien -> POJO class (getters and setters)
		 * 
		 * Alien_Name an = new Alien_Name(); an.setfName("Maitri");
		 * an.setmName("Krishna Kumar"); an.setlName("Patel");
		 * 
		 * Alien obj1 = new Alien(); // blank object obj1.setAid(101);
		 * obj1.setAname(an); obj1.setColor("Blue");
		 * 
		 * 
		 * //Persist Data -> Storing into Database Configuration con = new
		 * Configuration().configure().addAnnotatedClass(Alien.class);
		 *  ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		 * 
		 * SessionFactory sf = con.buildSessionFactory(reg);
		 * 
		 * Session session = sf.openSession(); Transaction tx =
		 * session.beginTransaction();
		 * 
		 * //fetching data from the database //obj1 = (Alien) session.get(Alien.class,
		 * 105);
		 * 
		 * //Saving data into DB session.save(obj1);
		 * 
		 * tx.commit();
		 * 
		 * System.out.println(obj1);
		 */

		
		
		/* Second Code
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
		

		Student s = new Student();
		s.setRollno(1);
		s.setName("Maitri");
		s.setMarks(50);
		//s.setLaptop(laptop);
		s.getLaptop().add(laptop);
		laptop.getStudent().add(s);

		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);

		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();

		SessionFactory sf = config.buildSessionFactory(registry);

		Session session = sf.openSession();

		session.beginTransaction();

		session.save(s);
		session.save(laptop);

		session.getTransaction().commit();
		
		*/
	}
}
