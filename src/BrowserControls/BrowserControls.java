package BrowserControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserControls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
		WebDriver driver=new FirefoxDriver();
				
		//passing the url
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");

		//maximize the browser
				
		driver.manage().window().maximize();
		


		//identify the Username
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		
		//identify the Password
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");		
		
		//click on the Login Button
		
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	}

}
