package com.xworkz.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bird.dto.BirdEntity;

public class BirdDAOImpl implements BirdDAO {

	public static void main(String[] args) {
	

	}

	@Override
	public int save(BirdEntity entity) {
		Configuration configuration = new Configuration();
		configuration.configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		int pk = (int) session.save(entity);
		tx.commit();
		System.out.println("Saved : " + pk);
		session.close();
		factory.close();
		return pk;
	}

	
	
	@Override

	public BirdEntity readBYID(int pk) { {
			Configuration configuration = new Configuration();
			configuration.configure().addAnnotatedClass(BirdEntity.class);
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			BirdEntity entity = session.get(BirdEntity.class, pk);
			System.out.println("Read entity : ");
			session.close();
			factory.close();
			return entity;
		}

	}
}
