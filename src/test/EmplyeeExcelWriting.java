package test;

import java.io.File;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class EmplyeeExcelWriting {

	public static void main(String[] args) throws IOException {


			XSSFWorkbook workbook=new XSSFWorkbook();//it is an external class
			
			//This is for Emplyee sheet
			
			XSSFSheet sheet1=workbook.createSheet("Employee");

			Row row1=sheet1.createRow(0);

			Cell cell0 =row1.createCell(0);
			//Cell cell1 =row1.createCell(1);
            
			cell0.setCellValue("E-id");				
			//cell1.setCellValue("Salary");
  			
			int E_id=101;

			 for(int i=0;i<=9;i++)
			 {
      			Row row2=sheet1.createRow(i+1);
                for(int j=0;j<1;j++)
                {
         			Cell cell3 =row2.createCell(j);
        			cell3.setCellValue(E_id);				

              }
                E_id++;
	      }
			 /*
			 for(int i=0;i<=9;i++)
			 {
	      			Row row3=sheet1.getRow(i+1);
	                for(int j=0;j<1;j++)
	                {
	         			Cell cell4 =row3.createCell(j+1);
	         		    int	sal=(int)(Math.random()*100000);
	        			cell4.setCellValue(sal);				

	              }
	                
		      }*/

			      
			
	//This is for product sheet
			
			XSSFSheet sheet2=workbook.createSheet("Product");

			Row row2=sheet2.createRow(0);
			
			Cell cell2=row2.createCell(0);
			Cell cell3 =row2.createCell(1);

			cell2.setCellValue("Prod-ID");
			cell3.setCellValue("Price");
			int prod_id=67464;

			 for(int i=0;i<=9;i++)
			 {
     			Row rows=sheet2.createRow(i+1);
               for(int j=0;j<1;j++)
               {
        		Cell cells =rows.createCell(j);
       			cells.setCellValue(prod_id);				

               }
                 prod_id++;
	         }
			 
			 for(int i=0;i<=9;i++)
			 {
	      			Row row3=sheet2.getRow(i+1);
	                for(int j=0;j<1;j++)
	                {
	         			Cell cell4 =row3.createCell(j+1);
	         		    int	sal=(int)(Math.random()*10000);
	        			cell4.setCellValue(sal);				

	              }
	                
		      }

			File f= new File("C:\\Selenium\\Excel Handing\\src\\fileconfig\\employee.xlsx");
		    File f1= new File("C:\\Selenium\\Excel Handing\\src\\fileconfig\\product.xlsx");

			FileOutputStream fos=new FileOutputStream(f);
			FileOutputStream fos1=new FileOutputStream(f1);

			workbook.write(fos);
			workbook.write(fos1);

			fos.close();
		    fos1.close();

			workbook.close();
			
			
			
	}

}
