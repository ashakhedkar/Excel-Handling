package test;
import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FacebookWriting {
	 private String str1;
	// private CellType name;
	 private String str2;
   private static String str3;
	 private String str4;

	 
	 public FacebookWriting(String s1,String s2, String s3, String s4)
	 {
		 super();
		 this.str1=s1;
		 this.str2=s2;
		 this.str3=s3;
		 this.str4=s4;
		
	 }
		
	 public void print()
	 {
		 System.out.println(str1+"\t "+str2+"\t"+str3+"\t "+str4);
	 }
	 
	public static void main(String[] args) throws Exception, IOException {

	      File f= new File("C:\\Selenium\\Excel Handing\\src\\fileconfig\\facebookdata.xlsx");
			
		  FileInputStream fis=new FileInputStream(f);
			
		  Workbook book=WorkbookFactory.create(fis);//this method will get workbook from WorkbookFactory class
			
		   Sheet sheet1 =  book.getSheetAt(0);
		   
		   ArrayList<FacebookWriting> al=new ArrayList<FacebookWriting>();

			for(Row row:sheet1){
				
				Cell c1=row.getCell(0);
				String str1=(String) c1.getStringCellValue();
				
				Cell c2=row.getCell(1);
				String str2=(String)c2.getStringCellValue();
				
				
		     	Cell c3=row.getCell(2);
		     	if(c3.getCellType()==CellType.STRING){
		     		String str3=(String)c3.getStringCellValue();
		     	}
				Cell c4=row.getCell(2);
				String str4=(String)c4.getStringCellValue();

				FacebookWriting p= new FacebookWriting(str1,str2,str3,str4);
	            al.add(p);
	            }
									
			       System.out.println();
				   System.out.println("Product details are: ");

					Iterator<FacebookWriting> it=al.iterator();
					while(it.hasNext())
					{
						FacebookWriting mp=(FacebookWriting)it.next();
						mp.print();
					}
			 	  
	    
	   	}

}
