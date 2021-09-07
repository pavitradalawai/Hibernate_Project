package com.xworkz.mobile.tester;
 
import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dao.MobileDAOImpl;
import com.xworkz.mobile.entity.MobileEntity;

public class MobileTester {

	public static void main(String[] args) {
		MobileEntity entity = new MobileEntity(25000., "Red", false, "Sony");
		MobileEntity entity1 = new MobileEntity(3555.5d, "Blue", true, "MI");

		MobileDAO dao = new MobileDAOImpl();
		dao.save(entity);
		dao.save(entity1);
		System.out.println("invoking entity");
		dao.readAllRecords();
		System.out.println("invoking records");
		double price = dao.findMobilePriceByBrand("MI");
		System.out.println(price);

		double TotalPrice = dao.findTotalPrice();
		System.out.println(TotalPrice);

		double maxPrice = dao.findMaxPrice();
		System.out.println(maxPrice);

		double minPrice = dao.findMinPrice();
		System.out.println(minPrice);

		dao.updatePriceByColor();
		dao.deleteRowById();
	}

}