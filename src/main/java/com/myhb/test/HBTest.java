package com.myhb.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.myhb.util.HibernateUtil;
import com.spring.entity.Stock;

public class HBTest {
	public static void main(String[] args) {
		System.out.println("Hibernate First Example");

		final SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		final Session session = factory.openSession();
		System.out.println(session);

		Stock stock = new Stock(99, "Computer");
		session.beginTransaction();
		session.save(stock);
		session.getTransaction().commit();

		session.close();
		factory.close();

	}
}
