package FSO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Creating_File {

	public static void main(String[] args) throws IOException {


		
		File f=new File("C:\\Users\\tm\\Desktop\\Java Test\\abc.txt");
		
		f.createNewFile();
		
		FileWriter fw=new FileWriter(f,true);
		
		
		//BufferedWriter bw=new BufferedWriter(fw);
		
		
		PrintWriter pw=new PrintWriter(fw);
		
		
		
		pw.println("Hello i am writing");
		pw.println("Hello i am new line");
		pw.println(65);
		
		pw.flush();
		pw.close();
	}
	
	public static void test()
	{
		System.out.println("Reflections");
	}

}
