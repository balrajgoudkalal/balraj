package ISdisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ISSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launching the browser
		WebDriver driver=new FirefoxDriver();
				
		//passing the url
		driver.get("https://www.facebook.com/");

		//maximize the browser
				
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement ele2=driver.findElement(By.xpath("//input[@id='u_0_9']"));	
		ele2.click();
		if(ele2.isSelected())
		{
			
			System.out.println("element selected");
		}
		else
		{
			System.out.println("element not selected");
		}
	}

}
