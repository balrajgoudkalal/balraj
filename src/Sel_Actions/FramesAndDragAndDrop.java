package Sel_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesAndDragAndDrop {

	public static void main(String[] args) {
		//launching the browser
		WebDriver driver=new FirefoxDriver();
		
		
		String url="http://jqueryui.com/droppable/";
		//passing the url
		driver.get(url);

		//maximize the browser
				
		driver.manage().window().maximize();
		
		WebElement iframe=driver.findElement(By.xpath("//iframe"));
		
		//switch on to frame
		driver.switchTo().frame(iframe);
		
		
		//identify source element
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//identify target element
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//Create action class ref variable
		Actions acc=new Actions(driver);
		
		//perform drag and drop
		acc.dragAndDrop(src, dest).build().perform();
				
		//switching back to main page
		driver.switchTo().defaultContent();
		
		
		
		//get current url
		
		
		
		String crnturl=driver.getCurrentUrl();
		
		if(crnturl.equals(url))
		{
			System.out.println("Application is launched sucessfully");
			
		}else
		{
			System.out.println("Application is not launched sucessfully");
		}
		
		
		
		//get current page title 
		
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		
		if(title.contains("Droppable"))
		{
			System.out.println("Title matched sucessfully");
		}else
		{
			System.out.println("Title not matched sucessfully");
		}
	}

}
