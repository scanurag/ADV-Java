package com.org.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.org.dto.Login;

public class LoginCRUD {
	public static void saveLogin(Login l) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
	    EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(l);
		et.commit();
	}

}
