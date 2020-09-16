package test;


import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CollectionExcelReadingAssignment {

	public static void main(String[] args) throws Exception, IOException {
		
		File f= new File("C:\\Selenium\\Excel Handing\\src\\fileconfig\\employee.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook book=WorkbookFactory.create(fis);//this method will get workbook from WorkbookFactory class
		
		Sheet sheet1 =  book.getSheetAt(0);
		ArrayList al=new ArrayList();

		 for(Row row:sheet1){
			 for(Cell cell:row){
				 System.out.println(cell);
				 al.add(cell);
			    }
		 }			
		 System.out.println();

		 Iterator it= al.iterator(); //it returns data one by one

			//checks is that data is there are not
			while(it.hasNext()){
				System.out.println(it.next());		 
			}
			System.out.println("size: "+al.size());
		fis.close();
		
	}

}
