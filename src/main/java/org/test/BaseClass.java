package org.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void  maven(String Browser) {
		if(Browser=="chrome") {
			WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();}
		   else {
			   if(Browser=="InternetExplo") {
				   WebDriverManager.iedriver().setup();
				   driver=new InternetExplorerDriver();
				   }else
					   WebDriverManager.firefoxdriver().setup();
				   driver=new FirefoxDriver();
			
		   }
		}
       public static void lanchurl(String url) {
          driver.get(url);
	}
      public static void enterText(String text,WebElement ele) {
ele.sendKeys(text);
	}
      
     public static WebElement locbyId(String value) {
       WebElement element = driver.findElement(By.id(value));
       return element;
	}
     public static WebElement locbyClass(String value) {
         WebElement element = driver.findElement(By.className(value));
         return element;
  	}
     
     public static WebElement locbyLink(String value) {
         WebElement element = driver.findElement(By.linkText(value));
         return element;
  	}
     
     
     public static WebElement locbyPartial(String value) {
         WebElement element = driver.findElement(By.partialLinkText(value));
         return element;
  	}
     public static WebElement locbyxpath(String value) {
         WebElement element = driver.findElement(By.xpath(value));
         return element;
  	}
     public static WebElement locbyName(String value) {
         WebElement element = driver.findElement(By.name(value));
         return element;
  	}
   

 	public static FileInputStream fi;
 	public static FileOutputStream fo;
 	public static XSSFWorkbook wb;
 	public static XSSFSheet ws;
 	public static XSSFRow row;
 	public static XSSFCell cell;
 	public static CellStyle style;   
 	
 	public static int getRowCount(String xlfile,String xlsheet) throws IOException 
 	{
 		fi=new FileInputStream(xlfile);
 		wb=new XSSFWorkbook(fi);
 		ws=wb.getSheet(xlsheet);
 		int rowcount=ws.getLastRowNum();
 		wb.close();
 		fi.close();
 		return rowcount;		
 	}
 	

 	public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
 	{
 		fi=new FileInputStream(xlfile);
 		wb=new XSSFWorkbook(fi);
 		ws=wb.getSheet(xlsheet);
 		row=ws.getRow(rownum);
 		int cellcount=row.getLastCellNum();
 		wb.close();
 		fi.close();
 		return cellcount;
 	}
 	
 	
 	public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
 	{
 		fi=new FileInputStream(xlfile);
 		wb=new XSSFWorkbook(fi);
 		ws=wb.getSheet(xlsheet);
 		row=ws.getRow(rownum);
 		cell=row.getCell(colnum);
 	
 		String data;
 		try 
 		{
 			//data=cell.toString();
 			
 			DataFormatter formatter = new DataFormatter();
             data = formatter.formatCellValue(cell);
             return data;
 		}
 		catch (Exception e) 
 		{
 			data="";
 		}
 		
 		wb.close();
 		fi.close();
 		return data;
 	}
 	
 	

 	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
 	{
 		fi=new FileInputStream(xlfile);
 		wb=new XSSFWorkbook(fi);
 		ws=wb.getSheet(xlsheet);
 		row=ws.getRow(rownum);
 		cell=row.createCell(colnum);
 		cell.setCellValue(data);
 		fo=new FileOutputStream(xlfile);
 		wb.write(fo);		
 		wb.close();
 		fi.close();
 		fo.close();
 				
 	}
 	
 	public static void fillGreenColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
 	{
 		fi=new FileInputStream(xlfile);
 		wb=new XSSFWorkbook(fi);
 		ws=wb.getSheet(xlsheet);
 		row=ws.getRow(rownum);
 		cell=row.getCell(colnum);
 		
 		style=wb.createCellStyle();
 		
 		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
 		style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
 				
 		cell.setCellStyle(style);
 		fo=new FileOutputStream(xlfile);
 		wb.write(fo);
 		wb.close();
 		fi.close();
 		fo.close();
 	}
 	
 	
 	public static void fillRedColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
 	{
 		fi=new FileInputStream(xlfile);
 		wb=new XSSFWorkbook(fi);
 		ws=wb.getSheet(xlsheet);
 		row=ws.getRow(rownum);
 		cell=row.getCell(colnum);
 		
 		style=wb.createCellStyle();
 		
 		style.setFillForegroundColor(IndexedColors.RED.getIndex());
 		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
 		
 		cell.setCellStyle(style);		
 		fo=new FileOutputStream(xlfile);
 		wb.write(fo);
 		wb.close();
 		fi.close();
 		fo.close();
 	}	
    

	
}  

