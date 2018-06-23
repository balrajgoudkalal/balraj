package Sel_HandleDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectingByXpath {

	public static void main(String[] args) {
		//launching the browser
		WebDriver driver=new FirefoxDriver();
				
		//passing the url
		driver.get("https://www.facebook.com/");

		//maximize the browser
				
		driver.manage().window().maximize();
		
		//identify your dropdown
		
		WebElement day_dropdown=driver.findElement(By.xpath("//Select[@id='day']/option[@value='7']"));

		
		day_dropdown.click();
	}

}
