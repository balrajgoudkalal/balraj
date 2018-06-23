package ISdisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ISDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launching the browser
				WebDriver driver=new FirefoxDriver();
						
				//passing the url
				driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");

				//maximize the browser
						
				driver.manage().window().maximize();
				
		//verify if the login button is available
				
				try
				{
					WebElement ele=driver.findElement(By.xpath("//input[@id='btnLogin']"));
					
					if(ele.isDisplayed())
					{
						System.out.println("Login button Exist");
					}
					
					
					if(ele.isEnabled())
					{
						
						System.out.println("Login button Enabled");
					}
					WebElement ele2=driver.findElement(By.xpath("//select[@id='openIdProvider']"));		
					if(ele2.isSelected())
					{
						
						System.out.println("dropdown selected");
					}
				}catch(Exception e)
				{
					System.out.println("Login button not Exist");
				}
				
		
		
		
		
		
	}

}
