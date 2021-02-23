package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	
	public String getProperty(String path , String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		
	   String property = prop.getProperty(key, "incorrect value");
	   return property;
	}
	public String getCellValue(String excelpath , String File , int row , int cell ) throws Throwable {
		
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		
		String Value = wb.getSheet(File).getRow(row).getCell(cell).getStringCellValue();
		return Value;	
	}
	public int getRowCount(String excelpath ,  String Sheet) throws Throwable {
		
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		
		int rc = wb.getSheet(Sheet).getLastRowNum();
		return rc;		
	}
	public void setCellData(String excelpath , String Sheet , int row , int cell ,String data) throws Throwable {
		
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(Sheet).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		System.out.println("written");
	}
}
