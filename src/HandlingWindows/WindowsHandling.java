package HandlingWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launching the browser
		WebDriver driver=new FirefoxDriver();
				
		//passing the url
		driver.get("https://www.naukri.com/");

		//maximize the browser
				
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		String parentwindow=driver.getWindowHandle();
		
		System.out.println(parentwindow);
		
		Set<String> st=driver.getWindowHandles();
		
		System.out.println("The total windows are "+st.size());
		
		Iterator it=st.iterator();
		
		while(it.hasNext())
		{
			
			String crntwindow=it.next().toString();
			
			
			if(!crntwindow.equals(parentwindow))
			{
				System.out.println(crntwindow);
				driver.switchTo().window(crntwindow);
				driver.close();
				
			}
		}
				
		
		
		
		
	}

}
