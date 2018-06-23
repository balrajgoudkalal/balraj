package Waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launching the browser
				WebDriver driver=new FirefoxDriver();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
				//passing the url
				driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");

				//maximize the browser
						
				driver.manage().window().maximize();
				
				
				//identify the Username
				driver.findElement(By.id("txtUsername")).sendKeys("user01");
				
				//identify the Password
				driver.findElement(By.id("txtPassword")).sendKeys("pass1234");		
				
				//click on the Login Button
				
				
				driver.findElement(By.id("btnLogin")).click();
				
		//ExplicitWait
				
				//WebDriverWait wait=new WebDriverWait(driver, 15);
				
			///	wait.until(ExpectedConditions.find((WebElement) By.partialLinkText("Welcome")));
				
				//Fluent Wait
							 
				 new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
				//click on the welcome link
				
				//	driver.findElement(By.linkText("Welcome Mohan")).click();
					
					driver.findElement(By.partialLinkText("Welcome")).click();
					
					
					//click on the Logout
					
					driver.findElement(By.linkText("Logout")).click();
					
		
		
		
		
	}

}
