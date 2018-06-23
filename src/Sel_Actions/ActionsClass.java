package Sel_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		//launching the browser
				WebDriver driver=new FirefoxDriver();
						
				//passing the url
				driver.get("https://www.talentzing.com/");

				//maximize the browser
						
				driver.manage().window().maximize();
				
				
				WebElement ele=driver.findElement(By.xpath("//span[@id='lnkRegistration']"));
				
				Actions acc=new Actions(driver);
				acc.moveToElement(ele).build().perform();
				
				acc.contextClick(ele).build().perform();
			
				
				

	}

}
