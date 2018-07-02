package TakingScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//launching the browser
				WebDriver driver=new FirefoxDriver();
						
				//passing the url
				driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");

				//maximize the browser
						
				driver.manage().window().maximize();
				
				
				TakesScreenshot sht=(TakesScreenshot)driver;
				
				File src=sht.getScreenshotAs(OutputType.FILE);
				
				String dest="C:\\Users\\tm\\Desktop\\Java Test\\mypic.png";
				
				
				org.apache.commons.io.FileUtils.copyFile(src, new File(dest));
				
				
				Runtime.getRuntime().exec("taskkill /im firefox.exe /f");
				
				
	}

}
