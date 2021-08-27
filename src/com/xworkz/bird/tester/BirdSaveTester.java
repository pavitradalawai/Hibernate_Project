package com.xworkz.bird.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;
import com.xworkz.bird.dto.BirdEntity;

public class BirdSaveTester {

	public static void main(String[] args) {
	
BirdEntity entity1 =new BirdEntity(1,"Parrot",false,true,"green",false,false,true,false,true);
BirdEntity entity2 =new BirdEntity(2,"Owl",false,true,"grey",true,false,false,true,true);





BirdDAO dao = new BirdDAOImpl();
dao.save(entity1);
dao.save(entity2);
}
}
