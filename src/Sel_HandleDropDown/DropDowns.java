package Sel_HandleDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {


		//launching the browser
				WebDriver driver=new FirefoxDriver();
						
				//passing the url
				driver.get("https://www.facebook.com/");

				//maximize the browser
						
				driver.manage().window().maximize();
				
				//identify your dropdown
				
				WebElement day_dropdown=driver.findElement(By.xpath("//Select[@id='day']"));
				
				Select slct=new Select(day_dropdown);
				slct.selectByIndex(2);
				slct.selectByValue("12");
				slct.selectByVisibleText("4");
				
				List<WebElement> options=slct.getOptions();
				
				
				System.out.println("The total Number of options are "+options.size());
				
				
				for(int i=0;i<=options.size()-1;i++)
				{
					System.out.println(options.get(i).getText()+"*****"+options.get(i).getAttribute("value"));
					
				}
				
				
		

	}

}
