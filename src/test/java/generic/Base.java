package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import junit.framework.Assert;

public class Base 
{
  public void getandconcatcurrentpatgh()
  {
	  
  }
  
  public void verifyValues(Object actual,Object expected)
  {
	  Assert.assertEquals(expected, actual);
	  
  }
  
  public HashMap<String, String> readExel()
  {
	  String path="C:\\Users\\HP\\eclipse-workspace\\automationframework\\src\\test\\java\\testData\\abc.xlsx";
	  File f1=new File(path);
	  HashMap<String,String> credentials = new HashMap<String, String>();
	  try {
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook w1=new XSSFWorkbook(fis);
		XSSFSheet sheet=w1.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		for(int i = 0;i<lastRowNum-1;i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell1=row.getCell(0);
			String uname=cell1.getStringCellValue();
			System.out.println(uname);//Reading
			XSSFCell cell2=row.getCell(1);
			String password=cell2.getStringCellValue();
			System.out.println(password);//Reading
			credentials.put(uname, password);
		}
		
		w1.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return credentials;
	  
  }
  
  public void writeExel()
  {
	  String path="C:\\Users\\HP\\eclipse-workspace\\automationframework\\src\\test\\java\\testData\\abc.xlsx";
	  File f1=new File(path);
	  try {
		
		XSSFWorkbook w1=new XSSFWorkbook();
		XSSFSheet sheet=w1.createSheet();
		XSSFRow row=sheet.createRow(1);
		XSSFCell cell=row.createCell(1);
		cell.setCellValue("rupali");;
		
		FileOutputStream fos=new FileOutputStream(f1);
		w1.write(fos);
		w1.close();
		fos.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
}
