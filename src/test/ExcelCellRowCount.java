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

public class ExcelCellRowCount {

Workbook book;
Sheet sheet;
ExcelCellRowCount(String filename) throws IOException
{
	
	File f=new File(filename);
	FileInputStream fis=new FileInputStream(f);
	book=WorkbookFactory.create(fis);
			
}
int rowcount=0;
public int getRowCount(String sheetname)
{
	sheet=book.getSheet(sheetname);
	for(Row row:sheet)
	{
		rowcount++;
	}
	return rowcount;
}

int cellcount=0;
public int getCellCount()
{
	for(Row row1:sheet){
		for(Cell cell:row1){
			cellcount++;
		}
		break;
	}
	return cellcount;
}
/*
System.out.println("Workbook Created");

ExcelCellRowCount ecr=new ExcelCellRowCount("C:\\Selenium\\Excel Handing\\src\\fileconfig\\employee.xlsx");

int row=ecr.getRowCount("employee");
int cell=ecr.getCellCount();

System.out.println("row="+row+"\t"+"cell="+cell);
*/
	
}
