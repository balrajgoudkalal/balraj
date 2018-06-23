package ExcelPlugin;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calling_ExcelPlugin {

	public static void main(String[] args) throws IOException, NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		System.out.println(System.getProperty("user.dir"));
		
		String path=System.getProperty("user.dir")+"\\Testdata\\Testdata.xlsx";
		HandleExcel exl=new HandleExcel(path);
		
		exl.getData("TestData", "Tc_04", "Url");
		
		
		Class c=Class.forName("FSO.Creating_File");
		Method m=c.getDeclaredMethod("test", null);
		m.invoke(m, args);
		
			
		
		
		

	}

}
