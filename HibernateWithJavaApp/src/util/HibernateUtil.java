package util;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static final HibernateUtil hibernateUtil = new HibernateUtil();
	private static final SessionFactory sessionFactory;
	private static final ServiceRegistry serviceRegistry;
	static {

		try {
			// Create the SessionFactory from hibernate.cfg.xml
			Configuration configuration = new Configuration();
			File configFile = new File("./hibernate/hibernate.cfg.xml");
			configuration.configure(configFile);
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public HibernateUtil getInstance() {
		if (hibernateUtil != null) {
			return hibernateUtil;
		}
		return new HibernateUtil();
	}
}