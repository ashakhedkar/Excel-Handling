package test;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcelWriting {

	
	public static void main(String[] args) throws IOException {

		Logger log= Logger.getLogger("devpinoyLogger");		
		XSSFWorkbook workbook=new XSSFWorkbook();//it is an external class
		log.debug("Workbook Created");
		
		XSSFSheet sheet=workbook.createSheet("login");
		log.debug("Sheet Created");
		
		Row row=sheet.createRow(0);
		log.debug("Row Created");
		Cell cell0 =row.createCell(0);
		Cell cell1 =row.createCell(1);
		log.debug("Cell Created");
		cell0.setCellValue("username");
		cell1.setCellValue("password");
		
		log.debug("Value set to the cell");
		
	   /*   for(int i=0;i<5;i++){
			Row row= sheet.createRow(i);
			for(int j=0;j<5;j++){
				Cell cell=row.createCell(j);
				int value=(int)(Math.random()*100);
				cell.setCellValue(value);
			}
		}*/
	      
		File f= new File("C:\\Selenium\\Excel Handing\\src\\fileconfig\\test.xlsx");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		workbook.write(fos);
		log.debug("Workbook written in the Excel file");
		
		fos.close();
		log.debug("File Closed");
		
		workbook.close();
		log.debug("Workbook Closed");
		System.out.println("Workbook Created");
		
		
	}

}
