package maven;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavenclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		File fileObj=new File("Vtiger.html");//
		ExtentSparkReporter html=new ExtentSparkReporter(fileObj);
		ExtentReports extReport=new ExtentReports();
		extReport.attachReporter(html);
		ExtentTest extTest=extReport.createTest("TC001");
		
		WebDriver driver=new ChromeDriver();
		extTest.log(Status.INFO, "Browser is lounched succesfully");
		driver.get("http://localhost:8888/");
		extTest.log(Status.INFO, "Navigate URL succesfully");
		
		extReport.flush();
		
     	driver.findElement(By.name("user_name")).sendKeys("admin");
	    extTest.log(Status.INFO, "name is send");
	

	
	}

}
