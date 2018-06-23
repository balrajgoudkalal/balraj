package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UnderstandExceptions {

	public static void main(String[] args) {
		
		try
		{
			int a=1;
			
			int b=2;
			
			if(a<=b)
			{
				throw new Exception("Invalid compariosion");
				
			}
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			
		
		
		

	}

}
