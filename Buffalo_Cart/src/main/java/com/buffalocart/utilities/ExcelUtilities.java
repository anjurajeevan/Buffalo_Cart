package com.buffalocart.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	 private static      XSSFWorkbook excelWBook; //Excel WorkBook
	    private static      XSSFSheet    excelWSheet; //Excel Sheet
	   

	    // This method has two parameters: "Test data excel file name" and "Excel sheet name"
	    // It creates FileInputStream and set excel file and excel sheet to excelWBook and excelWSheet variables.
	    
	    public static String getStringCellData(int RowNum, int ColNum) throws IOException {
	        
	        // Open the Excel file
	    	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
	                 + "/Buffalocart.xlsx");
	        excelWBook = new XSSFWorkbook(ExcelFile);
	        //accessing the sheet by index
	        excelWSheet = excelWBook.getSheetAt(0);
	       //accessing the sheet by name
	        //excelWBook.getSheet(Sheet1);
	        return excelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
	    }
     public static int getNumericCellData(int RowNum, int ColNum) throws IOException {
	        
	        // Open the Excel file
	    	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
	                 + "/Buffalocart.xlsx");
	        excelWBook = new XSSFWorkbook(ExcelFile);
	        //accessing the sheet by index
	        excelWSheet = excelWBook.getSheetAt(0);
	       //accessing the sheet by name
	        //excelWBook.getSheet(Sheet1);
	       
	        return (int) excelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
	    }
}
