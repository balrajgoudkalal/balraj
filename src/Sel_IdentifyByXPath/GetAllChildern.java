package Sel_IdentifyByXPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllChildern {

	public static void main(String[] args) {

		//launching the browser
				WebDriver driver=new FirefoxDriver();
						
				//passing the url
				driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");

				//maximize the browser
						
				driver.manage().window().maximize();
				
				
				//identify using rel xpath
				
				List<WebElement> ele=driver.findElements(By.xpath("//div[@id='logInPanelHeading']/following-sibling::div"));
		
		System.out.println(ele.size());
		
		
		
		

	}

}
