package Sel_OpeningBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		
		//launching the browser
		WebDriver driver=new FirefoxDriver();
		
		//passing the url
		driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");

		//maximize the browser
		
		driver.manage().window().maximize();
		
		driver.close();
	}

}
