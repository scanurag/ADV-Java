package com.org.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.query.Query;

import com.org.dto.Bike;

public class BikeCRUD {
	public static void  saveBike(Bike b) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(b);
		et.commit();
	}
	public static List<Bike> getBike(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		javax.persistence.Query q=em.createQuery("FROM Bike");
		return q.getResultList();
		
	}

}
