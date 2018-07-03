package ExtentReports;

import java.io.File;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReports {
	
	public static com.relevantcodes.extentreports.ExtentReports extent;
	
	public static ExtentTest test;
	
	public static void main(String[] args) {
		//report intialization
		extent=new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\tm\\Desktop\\Reports\\test.html");
		extent.addSystemInfo("Environment","QA")
		.addSystemInfo("Sprint","Sprint 32");
		
		//Start the test
		
		test=extent.startTest("Test case name");
		
		//Log Event
		
		test.log(LogStatus.PASS, "Testcase is pass");
		
		test.log(LogStatus.FAIL, "Testcase is fail");
	
		
		//End Test
		
		extent.endTest(test);
		
		//flush report
		
		extent.flush();
		
		//close your report
		
		extent.close();
		
		

	}

}
