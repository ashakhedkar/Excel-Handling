package test;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



class Product
{
	 private int id;
	// private CellType name;
	 private double price;
	 public Product(int id,double price)
	 {
		 super();
		 this.id=id;
		
		 this.price=price;
		// this.name=name;
	 }
		
	 public void print()
	 {
		 System.out.println(id+"\t "+price);
	 }
	 
	 
}
public class CollectionExcelMobileProduct {

	public static void main(String[] args) throws IOException {
		
      File f= new File("C:\\Selenium\\Excel Handing\\src\\fileconfig\\MobileProducts.xlsx");
		
	  FileInputStream fis=new FileInputStream(f);
		
	  Workbook book=WorkbookFactory.create(fis);//this method will get workbook from WorkbookFactory class
		
	   Sheet sheet1 =  book.getSheetAt(0);
	   
	   ArrayList<Product> al=new ArrayList<Product>();

		for(Row row:sheet1){
			
			Cell c=row.getCell(0);
			int id=(int) c.getNumericCellValue();
			
			Cell c1=row.getCell(1);
			double price=(double)c1.getNumericCellValue();
			
			//Cell c2=row.getCell(2);
			//CellType name=c2.getCellType();

			Product p= new Product(id,price);
            al.add(p);
		
				}
		
					 System.out.println();
					 System.out.println("Product details are: ");

				Iterator<Product> it=al.iterator();
				while(it.hasNext())
				{
					Product mp=(Product)it.next();
					mp.print();
				}
		 	
		        
		
		
		
			
			 
			 
			 
			 
		 

		

         
		
		
		
		
		
		
	}

}
