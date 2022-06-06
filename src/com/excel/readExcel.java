package com.excel;

import java.io.IOException;

public class readExcel {

	public static void main(String[] args) throws IOException {
	
		String excelPath = "./TestData.xlsx.xlsx";
		//String sheetName = "Sheet1";
		ExcelUtil xl = new ExcelUtil(excelPath, 0);
		
		int rowCount = xl.getRowCount();
		
		for (int i=0; i<rowCount; i++ ) {			
			for (int j=0; j<rowCount; j++) {
				
				xl.getCellData(i, j);
			}
			
			
		}
		
		
		
	}

}
