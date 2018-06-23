package Sel_IdentifyByID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByID {

	public static void main(String[] args) {

		//launching the browser
		WebDriver driver=new FirefoxDriver();
				
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
		
		
		
		//click on the welcome link
		
	//	driver.findElement(By.linkText("Welcome Mohan")).click();
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		
		//click on the Logout
		
		driver.findElement(By.linkText("Logout")).click();
		
		
	}

}
