package AjaxControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAjaxControls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//launching the browser
		WebDriver driver=new ChromeDriver();
				
		//passing the url
		driver.get("https://in.search.yahoo.com/");

		//maximize the browser
				
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='yschsp']")).clear();

		
		driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("hello");
		
		Thread.sleep(2000);
		
		List<WebElement> ele=driver.findElements(By.xpath("//div[@id='sbq-wrap']/div[1]//li"));
		
		System.out.println("The total number of search results is "+ele.size());
		
		
		for(int i=0;i<=ele.size()-1;i++)
		{
			System.out.println(ele.get(i).getText());
			
			if(ele.get(i).getText().trim().startsWith("hello"))
			{
				System.out.println("Each Result Started with hello");	
			}else
			{
				System.out.println("Each Result Not Started with hello");	
			}
			
		}
		
	}

}
