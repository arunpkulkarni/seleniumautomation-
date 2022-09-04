package com.datadriven1.test;

import com.excel.utility.Xls_Reader;

public class Parametrize1Test {
	
	
	public static void main(String args[]) {
		//Get test data from Excel;
		
				Xls_Reader reader = new Xls_Reader("C:\\Users\\arunk\\eclipse-workspace\\Seleniumautomation\\src\\main\\java\\com\\testdata\\EbayTestData1.xlsx");	
				int rowCount =  reader.getRowCount("RegTestData");
				
				
		//Parameterization 
		for(int rowNum = 2; rowNum<= rowCount; rowNum++ ) {
			
					
			String firstName = reader.getCellData("RegTestData","firstname", rowNum);
			System.out.println(firstName);
			


			
			
			
			// System.out.println("=============");	
			
			
//			String lastName = reader.getCellData("RegTestData","lastname", rowNum);
//			System.out.println(lastName);
//			
//			
//			String Email = reader.getCellData("RegTestData","email", rowNum);
//			System.out.println(Email);
//			
//			
//			String password = reader.getCellData("RegTestData","password", rowNum);
//			System.out.println(password);
//			
			
			
			
			
				}
	}

}
