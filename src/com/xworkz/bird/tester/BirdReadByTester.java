package com.xworkz.bird.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;

public class BirdReadByTester {

	public static void main(String[] args) {

		BirdDAO dao = new BirdDAOImpl();
		System.out.println(dao.readBYID(2));
	}

}
