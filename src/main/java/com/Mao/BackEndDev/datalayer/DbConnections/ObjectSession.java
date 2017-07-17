package com.Mao.BackEndDev.datalayer.DbConnections;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ObjectSession {
	
	Session session;
    Transaction tx;
    
    
    
	public ObjectSession(Session session, Transaction tx) {
		super();
		this.session = session;
		this.tx = tx;
	}

	
	public ObjectSession() {
		super();
		
	}


	public Session getSession() {
		return session;
	}



	public void setSession(Session session) {
		this.session = session;
	}



	public Transaction getTx() {
		return tx;
	}



	public void setTx(Transaction tx) {
		this.tx = tx;
	}
    
    
	
    

}
