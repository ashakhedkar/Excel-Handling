package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExcelReading {

	public static void main(String[] args) throws IOException {

		File f= new File("C:\\Selenium\\Excel Handing\\src\\fileconfig\\test.xlsx");
		
		FileInputStream fis=new 	FileInputStream(f);
		
		Workbook book=WorkbookFactory.create(fis);//this method will get workbook from WorkbookFactory class
		
		 Sheet sheet =  book.getSheetAt(0);
		
		/*Row row=sheet.getRow(0);
		Cell cell0=row.getCell(0);
		Cell cell1=row.getCell(1);
		
		System.out.println(cell0);
		System.out.println(cell1);
		*/
		 
		 for(Row row:sheet){
			 for(Cell cell:row){
				 System.out.print(cell+"\t");
			 }
			 System.out.println();
		 }
		 
		 
		fis.close();
		
				
		
		
		
		
		
			
		
	}

}
