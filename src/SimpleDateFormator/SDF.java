package SimpleDateFormator;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SDF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		File f=new File("C:\\Users\\tm\\Desktop\\Java Test\\Testing\\Results\\"+sdf.format(new Date()));
		
		
		
		if(!f.exists())
		{
			
			f.mkdirs();
			
			f=new File("C:\\Users\\tm\\Desktop\\Java Test\\Testing\\Results\\"+sdf.format(new Date())+"\\abc.txt");
			
			f.createNewFile();
			
			
			
		}
		
		
	
		
		
		
		
		
	}

}
