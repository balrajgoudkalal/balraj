package com.HandlingAlerts;




import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//launching the browser
		WebDriver driver=new ChromeDriver();
				
		//passing the url
		driver.get("https://www.mediacollege.com/internet/javascript/basic/alert.html");

		//maximize the browser
				
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[contains(@value,'alert ')]")).click();
		
		Thread.sleep(2000);
		
		Alert alrt= driver.switchTo().alert();
		
		alrt.accept();
		alrt.dismiss();
		

	}

}
