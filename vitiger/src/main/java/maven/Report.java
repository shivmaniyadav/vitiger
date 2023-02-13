package maven;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
static	ExtentSparkReporter extReport;
	  static File file;
	public static void main(String[] args) {
		System.setProperty("webdriver.chromr.driver", "C:\\Users\\Admin\\Desktop\\eclipse-workspace\\crmAutomation\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
       File file=new File("report/s.html");
       ExtentSparkReporter extReport=new ExtentSparkReporter(file);
      
       
   	
       
}
	

	public static void reports() {
		   ExtentSparkReporter extReport=new ExtentSparkReporter(file);
		   ExtentReports report=	   new ExtentReports();
		   report.attachReporter(extReport);
		   report.setSystemInfo("os name ","window");
		   report.setSystemInfo("browser", "chrome");
		   report.setSystemInfo("authar name","shivmani");
		   
		   
		//  extReport.log(Status.INFO, "Browser is lounched succesfully");
		
		//	extTest.log(Status.INFO, "Navigate URL succesfully");
			
//			extReport.flush();
	       	
	}
   }
