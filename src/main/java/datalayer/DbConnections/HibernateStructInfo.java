package datalayer.DbConnections;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import businessObjects.hr.PeopleContent.Employee;
import businessObjects.hr.PeopleContent.Supplier;

public abstract class HibernateStructInfo  {
	protected static Session session;
	protected static Transaction tx = null;
	protected static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	protected static final String DB_URL = "jdbc:mysql://l/mao";
	protected static final String USER = "dbuser";
	protected static final String PASS = "123456";
	protected static Connection conn ;
	protected static SessionFactory sessionFactory ;

	public HibernateStructInfo() {	
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = getSession();
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


	public static ObjectSession beginTranscation()  
	{
		ObjectSession objectSession =  new ObjectSession();
		//	      Session session = getSession();
		//	      Transaction tx = null;
		try{
			tx = session.beginTransaction();
			objectSession.setSession(session);
			objectSession.setTx(tx);
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}
		return objectSession;

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


	public void updateAndCommit(String query){
		Session s = null;
		try {
			s.getTransaction().begin();
			s.createSQLQuery(query).executeUpdate();
			s.getTransaction().commit();
			s.close();
		}
		catch (HibernateException erro){
			s.getTransaction().rollback();
			s.close();
		} 
	}

	public void saveOrUpdate(Object object) {
		session.saveOrUpdate(object);
		 tx.commit();
	}



}




