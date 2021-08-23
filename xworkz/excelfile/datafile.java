package com.xworkz.excelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class datafile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub


		
		 File file=new File("C:\\Users\\sdalawai\\eclipse-workspace\\Apachepoi\\datafiles\\Country.xlsx");
			System.out.println(file);
			if(file.isFile()) {
				System.out.println("File got");
				
				FileInputStream stream = new FileInputStream(file);
			}
				
	
	}
}


