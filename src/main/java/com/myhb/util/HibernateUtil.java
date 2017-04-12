package com.myhb.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			final Configuration configuration = new Configuration().configure();
			final StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			sessionFactory = configuration.buildSessionFactory();
			System.out.println("Successfully Session Factory Build");
			return sessionFactory;
		} catch (Throwable ex) {
			System.out.println(ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
