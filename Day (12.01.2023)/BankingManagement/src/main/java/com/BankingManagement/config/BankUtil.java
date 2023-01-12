package com.BankingManagement.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BankUtil {
	private static SessionFactory sessionFactory;
	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;

	}

}
