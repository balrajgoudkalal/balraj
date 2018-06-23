package Sel_IdentifyByXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DrillingDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launching the browser
		WebDriver driver=new FirefoxDriver();
				
		//passing the url
		driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");

		//maximize the browser
				
		driver.manage().window().maximize();
		
		
		//identify using rel xpath
		
		driver.findElement(By.xpath("//div[@id='divUsername']/input[1]")).sendKeys("Hello");
		

	}

}
