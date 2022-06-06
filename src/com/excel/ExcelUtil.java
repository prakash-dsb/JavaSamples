package com.excel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtil(String excelPath, int index) throws IOException {
		
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheetAt(index);//.getSheet(sheetName);
	}
	
	public int getRowCount() {
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of Rows in the Sheet " + rowCount);
		return rowCount;
	}
	
	public void getCellData(int rowNum, int cellNum) {
		
		DataFormatter formatter = new DataFormatter();
		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(cellNum));
		
		System.out.println(value);
	}

}
