package FSO;

import java.io.File;
import java.nio.file.Files;

public class FileCount {

	public static void main(String[] args) {

int fscout=0;

		File f=new File("C:\\Users\\tm\\Desktop\\Java Test");
		
		File[] fs=f.listFiles();
		
		
		
		for (File file : fs) {
			
			
			if(file.isFile())
			{
				fscout++;
				System.out.println(file.getName());
			}
			
		}
		
		System.out.println("The total number of files is "+fscout);
		

	}

}
