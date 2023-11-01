package com.sadik.dataproviderTests;

import java.io.File;
import java.io.FileInputStream; 
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {
    @DataProvider( name="loginTestData")
	public  String[][] getData() throws Exception{
		// TODO Auto-generated method stub
		File excelFile=new File("C:\\Users\\ssadi\\eclipse-workspace\\PracticeTestNG\\src\\test\\resources\\Usernamesnpasswords1.xlsx");
		System.out.println(excelFile.exists());
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("sheet1");
int noofrows=sheet.getPhysicalNumberOfRows();
 int noofcolumns=sheet.getRow(0).getLastCellNum();



String[][] data=new String[noofrows-1][noofcolumns];
for (int i = 0; i < noofrows-1; i++) {
	for (int j = 0; j < noofcolumns; j++) {
		DataFormatter df=new DataFormatter();
		data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
//		System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
		
	}
	}
	

		workbook.close();
		fis.close();
//		for(String[] dataArr :data)  {
//			System.out.println(Arrays.toString(dataArr));
//		}
		return data;
		
	}

}
