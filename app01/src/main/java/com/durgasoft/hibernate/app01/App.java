package com.durgasoft.hibernate.app01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");
		
		Employee emp = new Employee();
		emp.setEno(105);
		emp.setEname("Harsh");
		emp.setEsal(75000);
		emp.setEaddr("India");

		Configuration config = new Configuration().addAnnotatedClass(Employee.class);
		//config.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(emp);
		session.getTransaction().commit();

		System.out.println("Updated");

//		emp = (Employee) session.get(Employee.class, 104);
//		System.out.println(emp);
//
//		Employee emp1 = new Employee();
//		emp1 = (Employee) session.get(Employee.class, 103);
//		System.out.println(emp1);
//
//		session.close();
//		sf.close();

	}
}
