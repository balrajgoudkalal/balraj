package Sel_IdentifyByXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Relative {

	public static void main(String[] args) {
	

		//launching the browser
		WebDriver driver=new FirefoxDriver();
				
		//passing the url
		driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");

		//maximize the browser
				
		driver.manage().window().maximize();
		
		
		//identify using rel xpath
		
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user01");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		

	}

}
