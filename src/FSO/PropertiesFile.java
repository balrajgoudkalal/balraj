package FSO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {


		File f=new File("ObjectRepository.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("Edi_Login_Username"));
		

	}

}
