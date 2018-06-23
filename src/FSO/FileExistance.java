package FSO;

import java.io.File;
import java.io.IOException;

public class FileExistance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f=new File("C:\\Users\\tm\\Desktop\\Java Test\\abc.txt");
		
		if(f.exists())
			
		{
			
			System.out.println("File Exist");
			System.out.println(f.getName());
			System.out.println(f.getParentFile());		
			System.out.println(f.isFile());
		}
		else
		{
			
			f.createNewFile(); 
			System.out.println("File Not Exist");
		}
		

	}

}
