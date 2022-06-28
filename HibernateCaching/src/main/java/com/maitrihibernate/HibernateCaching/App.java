package com.maitrihibernate.HibernateCaching;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		/*
		 * System.out.println("Hello Hibernate Application!");
		 * 
		 * StudentName obj = null;
		 * 
		 * Configuration con = new
		 * Configuration().configure().addAnnotatedClass(StudentName.class);
		 * ServiceRegistry sr = new
		 * ServiceRegistryBuilder().applySettings(con.getProperties()).
		 * buildServiceRegistry(); SessionFactory sf = con.buildSessionFactory(sr);
		 * Session session = sf.openSession();
		 * 
		 * session.beginTransaction(); Query q1 =
		 * session.createQuery("from StudentName where sId = 4"); q1.setCacheable(true);
		 * obj = (StudentName) q1.uniqueResult();
		 * 
		 * // obj = (StudentName)session.get(StudentName.class, 1);
		 * System.out.println(obj);
		 * 
		 * session.getTransaction().commit(); session.close();
		 * 
		 * // 2nd session Session session1 = sf.openSession(); Query q2 =
		 * session1.createQuery("from StudentName where sId = 4");
		 * q2.setCacheable(true); obj = (StudentName) q2.uniqueResult();
		 * 
		 * session1.beginTransaction();
		 * 
		 * // obj = (StudentName)session1.get(StudentName.class, 1);
		 * System.out.println(obj);
		 * 
		 * session1.getTransaction().commit(); session1.close();
		 * 
		 * // Transaction tx = session.beginTransaction(); // session.save(obj);
		 * 
		 * // tx.commit();
		 * 
		 */

		
		System.out.println("HQL Program");

		Configuration config = new Configuration().configure().addAnnotatedClass(StudentHQL.class);
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session session = sf.openSession();
		session.beginTransaction();

		// Query query = session.createQuery("from StudentHQL");
		// Query query = session.createQuery("from StudentHQL where marks > 50");
		// Query query = session.createQuery("from StudentHQL where rollNo = 7");
		// Query query = session.createQuery("select rollNo,name, marks from StudentHQL
		// where rollNo = 7");
		// Query query = session.createQuery("select rollNo,name, marks from StudentHQL
		// s where s.marks>60");

		//Query query = session.createQuery("select sum(marks) from StudentHQL s where s.marks>60");
//		int b = 60;
//		Query query = session.createQuery("select sum(marks) from StudentHQL s where s.makrks> :b");
//		query.setParameter("b", b);
//		Long marks = (Long)query.uniqueResult();
//		System.out.println(marks);

		// StudentHQL student = (StudentHQL)query.uniqueResult();
//
//		List students = query.list();
//		for(Object marks: students) {
//			System.out.println(marks);
//		}

		// List<Object[]> student = (List<Object[]>)query.list();

		// List<Object[]> students = (List<Object[]>)query.list();

		// List<StudentHQL> students = query.list();
//		
//		for(StudentHQL l : students) {
//			System.out.println(l);
//		}

		// System.out.println(student);
//		for (Object o : student) {
//			// System.out.println(o);
//		}
//
//		for (Object[] stu : students) {
//			System.out.println(stu[0] + "..." + stu[1] + "..." + stu[2]);
//		}

		// System.out.println(student[0] + "..." + student[1] + "..." + student[2] );

		/*
		 * Random r = new Random();
		 * 
		 * 
		 * for(int i =1; i<=50; i++) { StudentHQL s = new StudentHQL(); s.setRollNo(i);
		 * s.setName("Name: "+i); s.setMarks(r.nextInt(100)); session.save(s); }
		 */
		
		SQLQuery q = session.createSQLQuery("select * from student_marks_details where marks>60");
		q.addEntity(StudentHQL.class);
		List<StudentHQL> students = q.list();
		for(StudentHQL o : students)
		{
			System.out.println(o);
		}
		session.getTransaction().commit();

	}
}
