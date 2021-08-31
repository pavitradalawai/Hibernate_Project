package com.xworkz.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bird.dto.BirdEntity;
import com.xworkz.bird.util.SFUtil;

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

	public BirdEntity readBYID(int pk) {
		{
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

@Override
public void updateNameBYID(int id, String name) {
	SessionFactory factory= SFUtil.getFactory();
	Session session =factory.openSession();
	Transaction tx= session.beginTransaction();
	BirdEntity entity= session.get(BirdEntity.class, id);
	entity.setName(name);
	session.update(entity);
	tx.commit();
	System.out.println(entity);
	session.close();
}

@Override
public void deleteBYID(int id) {
	SessionFactory factory= SFUtil.getFactory();
	Session session =factory.openSession();
	Transaction tx= session.beginTransaction();
	BirdEntity entity= session.get(BirdEntity.class, id);
	
	session.delete(entity);
	tx.commit();
	session.close();
	}	
	


	
}

	
	
	

