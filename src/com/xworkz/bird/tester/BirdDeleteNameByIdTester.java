package com.xworkz.bird.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;

public class BirdDeleteNameByIdTester {

	public static void main(String[] args) {
	BirdDAO dao= new BirdDAOImpl();
	dao.deleteBYID(2);

	}

}
