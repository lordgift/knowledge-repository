package test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.ProLang;

import util.HibernateUtil;


public class Main {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		ProLang test = new ProLang("C#", ".NET", "i never program");

		try {
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(test);			
			tx.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
