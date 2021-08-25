package com.xworkz.dryfruit.tester;

import com.xworkz.dryfruit.dao.DryfruitDAO;
import com.xworkz.dryfruit.dao.DryfruitDAOImpl;
import com.xworkz.dryfruit.dto.DryfruitDTO;

public class DryfruitTester {

	public static void main(String[] args) {
		DryfruitDTO dto = new DryfruitDTO(10,"Almond","Naturoz","India", 5000, "Amazon");
		

		DryfruitDAO dao = new DryfruitDAOImpl();
		dao.save(dto);
	    dao.read(dto);
	    dao.update(dto);
	    dao.delete(dto);
	}
}

