package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CollectionHashmap {

	public static void main(String[] args) throws IOException {
		
    File f= new File("C:\\Selenium\\Excel Handing\\src\\fileconfig\\hasmap.xlsx");
		
	FileInputStream fis=new FileInputStream(f);
		
	Workbook book=WorkbookFactory.create(fis);//this method will get workbook from WorkbookFactory class
		
    Sheet sheet =  book.getSheetAt(0);

	HashMap<String, String> hm=new HashMap<String, String>();
	
	for(Row row:sheet)
	{
	//	HashMap<String, String> hm=new HashMap<String, String>();

		Cell c1=row.getCell(0);
		String username=(String) c1.getStringCellValue();
		
		Cell c2=row.getCell(1);
		String password=(String) c2.getStringCellValue();
		
		hm.put(username, password);
	}

	 System.out.println();
	 	 
     System.out.println("Entries are: ");
     
     for(Map.Entry me:hm.entrySet())
     {
          System.out.println(me.getKey()+"\t"+me.getValue());
     }
		
	}

}
