package com.xworkz.dryfruit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dryfruit.dto.DryfruitDTO;

public class DryfruitDAOImpl implements DryfruitDAO {
	@Override
	public int save(DryfruitDTO dto) {
		Configuration configure = new Configuration();
		configure.configure();
		configure.addAnnotatedClass(DryfruitDTO.class);
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		int primaryKey = (int) session.save(dto);
		trans.commit();
		System.out.println(primaryKey);
		session.close();
		factory.close();

		return primaryKey;
	}

	public int read(DryfruitDTO dto) {
		Configuration configure = new Configuration();
		configure.configure();
		configure.addAnnotatedClass(DryfruitDTO.class);
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		DryfruitDTO dt = (DryfruitDTO) session.get(DryfruitDTO.class, 2);
		trans.commit();

		session.close();
		factory.close();
		return 1;
	}
@Override
	public int update(DryfruitDTO dto) {
		Configuration configure = new Configuration();
		configure.configure();
		configure.addAnnotatedClass(DryfruitDTO.class);
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		DryfruitDTO dt = (DryfruitDTO) session.get(DryfruitDTO.class, 2);
		dt.setName("Date");
		session.update(dt);
		session.getTransaction().commit();
		System.out.println("update name:" + dt);
		session.close();
		

		return 1;
	}

public int delete(DryfruitDTO dto) {
	Configuration configure = new Configuration();
	configure.configure();
	configure.addAnnotatedClass(DryfruitDTO.class);
	SessionFactory factory = configure.buildSessionFactory();
	Session session = factory.openSession();
	Object obj=session.load(DryfruitDTO.class,new Integer(3));
	DryfruitDTO dt=(DryfruitDTO)obj;
	Transaction trans=session.beginTransaction();
	session.delete(dt);
	System.out.println("data is deleted from row");
	trans.commit();
	session.close();
	factory.close();
	return 1;
}}
	
	
	
	