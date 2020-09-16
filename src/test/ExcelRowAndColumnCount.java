package test;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRowAndColumnCount
{
   public static void main(String args[]) throws Exception
   {
	   File f= new File("C:\\Selenium\\Excel Handing\\src\\fileconfig\\MobileProducts.xlsx");
		
		  FileInputStream fis=new FileInputStream(f);
			
		  Workbook book=WorkbookFactory.create(fis);//this method will get workbook from WorkbookFactory class
			
		   Sheet sheet1 =  book.getSheetAt(0);
		
	   Row row = sheet1.getRow(0);
       int colNum = row.getLastCellNum();
       System.out.println("Total Number of Columns in the excel is : "+colNum);
       int rowNum = sheet1.getLastRowNum()+1;
       System.out.println("Total Number of Rows in the excel is : "+rowNum);
   }
}