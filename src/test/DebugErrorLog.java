package test;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.apache.log4j.Logger;

public class DebugErrorLog {

	public static void main(String[] args) throws IOException {

		Logger log= Logger.getLogger("devpinoyLogger");	
	    	
		try{
		File f= new File("C:\\Selenium\\Excel Handing\\src\\fileconfig\\debugerrorlog.txt");			
		log.debug("Opening a file");
			
		FileReader fr=new FileReader(f);
		log.debug("Reading a file");
			
		BufferedReader reader =new BufferedReader(fr);
			
	    int k, sum=0;
	    log.debug("Converting characters to integer");
	    log.debug("Printing characters");
	    System.out.println();
	    while((k=reader.read())!=-1)
		{ 
		       char ch=(char)k;
				

		       if((Character.isLetter(ch))||(Character.isSpace(ch)))
		          {
		             System.out.print(ch);
	           	  }
		       else
			      if(Character.isDigit(ch))
			       {
				     int num=Character.getNumericValue(ch);
				     sum=sum+num%10;
			       }
	  	}
	    
	      System.out.print("sum="+sum);
          reader.close();

		}catch(Exception e)
		{
			log.error("Error Occured", e);
			System.out.println("Error");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		       log.debug("closing file");
                     
      
               
	}
				
	}


