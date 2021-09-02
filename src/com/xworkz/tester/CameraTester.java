package com.xworkz.tester;

import java.util.Arrays;
import java.util.List;

import com.xworkz.camera.dao.CameraDao;
import com.xworkz.camera.dao.CameraDaoImpl;
import com.xworkz.camera.dto.CameraEntity;

public class CameraTester {

	public static void main(String[] args) {
		
		CameraEntity entity1 = new CameraEntity(1, "Nikon",  "Canon",  28,  35, true,100,true,"manual","D3100");
		CameraDao dao = new CameraDaoImpl();
		dao.save(entity1);

		CameraEntity obj = dao.readById(1);
		System.out.println(obj);

		dao.updateBrandById(1, "Canon");
		dao.deleteById(1);

		List<CameraEntity> list = Arrays.asList( entity1);
		dao.saveList(list);
		dao.deleteList(list);
	}
}
		
		
	
