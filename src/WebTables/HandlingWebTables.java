package WebTables;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class HandlingWebTables {

	public static void main(String[] args) {
	
		//launching the browser
				WebDriver driver=new FirefoxDriver();
				
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
				//passing the url
				driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

				//maximize the browser
						
				driver.manage().window().maximize();
				
				//Configure WebTable
				
				WebElement ele=driver.findElement(By.xpath("//th[text()='Company']/ancestor::table[1]"));
				
				try
				{
				
				
				new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(ele));
				
				if(ele.isDisplayed())
				{
					System.out.println("WebTable is displayed");
					
					
					//Getting Row count
					
					List<WebElement> tablerows=driver.findElements(By.xpath("//th[text()='Company']/ancestor::table/tbody/tr"));
					
					for(int r=1;r<=tablerows.size();r++)
					{
						
						//get column count under each row
						
						List<WebElement> columncount=driver.findElements(By.xpath("//th[text()='Company']/ancestor::table/tbody/tr["+r+"]/td"));	
						
						//Get each data from respective row and column
						
						for(int c=1;c<=columncount.size();c++)
						{
							WebElement data=driver.findElement(By.xpath("//th[text()='Company']/ancestor::table/tbody/tr["+r+"]/td["+c+"]"));
							
							System.out.println(data.getText());
							
						}
						
					}
					
					
					
					
					
					
				}
				
				
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
	}

}
