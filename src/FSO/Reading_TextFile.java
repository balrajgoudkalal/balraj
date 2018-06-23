package FSO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading_TextFile {

	public static void main(String[] args) throws IOException {

		File f=new File("C:\\Users\\tm\\Desktop\\Java Test\\abc.txt");
		
		FileReader fr=new FileReader(f);
		
		BufferedReader br=new BufferedReader(fr);


		String data=br.readLine();
		
				
		while(!(data==null))
		{
			
			System.out.println(data);
			data=br.readLine();
		}
		
		
		
		
	}

}
