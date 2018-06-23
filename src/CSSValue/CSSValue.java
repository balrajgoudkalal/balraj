package CSSValue;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class CSSValue {

	public static void main(String[] args) {
		
		//launching the browser
		WebDriver driver=new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		//passing the url
		driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");

		//maximize the browser
				
		driver.manage().window().maximize();
		
		
		//identify the Username
		driver.findElement(By.id("txtUsername")).sendKeys("user");
		
		//identify the Password
		driver.findElement(By.id("txtPassword")).sendKeys("pass123");		
		
		//click on the Login Button
		
		
		driver.findElement(By.id("btnLogin")).click();
		
		try
		{
		WebElement ele=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		
		new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(ele));
		
		if(ele.isDisplayed())
		{
			System.out.println("Error message is displayed");
			
			System.out.println(ele.getCssValue("color"));
		}
		
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
