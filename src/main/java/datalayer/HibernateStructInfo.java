package datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public abstract class HibernateStructInfo  {

	protected static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	protected static final String DB_URL = "jdbc:mysql://l/mao";
	protected static final String USER = "dbuser";
	protected static final String PASS = "123456";
	protected static Connection conn ;
	protected static SessionFactory sessionFactory ;

	public static void buildSessionFactory() {	
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public static Session getSession() {
		return sessionFactory.openSession() ;
	}

	public static void saveObject(Object object)  
	{
		Session session = null ;
		session = getTheSession(session);
		beginTransaction(session);
		saveObject(object, session);
		getTransaction(session);
	}

	public static void getTransaction(Session session) {
		try {
			session.getTransaction().commit();
		}
		catch (Exception e)  {
			System.out.println("failed to commit");
			e.printStackTrace();	
		}
	}

	public static void saveObject(Object object, Session session) {
		try {
			session.save(object);
		}
		catch (Exception e)  {
			System.out.println("failed to save object");
			e.printStackTrace();
		}
	}

	public static void beginTransaction(Session session) {
		try {
			session.beginTransaction();
		}
		catch (Exception e)  {
			System.out.println("failed to begin transaction");
			e.printStackTrace();
		}
	}

	public static Session getTheSession(Session session) {
		try {
			session = getSession() ;
		}
		catch (Exception e)  {
			System.out.println("failed to get session");
			e.printStackTrace();
		}
		return session;
	}			

}




