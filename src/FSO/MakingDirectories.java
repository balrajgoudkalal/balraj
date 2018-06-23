package FSO;

import java.io.File;
import java.io.IOException;

public class MakingDirectories {
	
	
	public static void main(String[] args) throws IOException {
		
		
		File f=new File("C:\\Users\\tm\\Desktop\\Java Test\\Testing\\Selenium\\Java\\OOPS");
		
		if(! f.exists())
		{
			
			f.mkdirs();
		}
		
		
		
	}

}
