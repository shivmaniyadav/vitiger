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

public class Etenedreport {

	public static void main(String[] args) {
		File  file =new File("shivmani.html");
		ExtentSparkReporter extendreport =new ExtentSparkReporter(file);
		ExtentReports etend= new ExtentReports();
		etend.attachReporter(extendreport); 
		ExtentTest ext=etend.createTest("tcoo1");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		ext.log(Status.INFO, "chrome brower launch succefully");
		driver.get("http:localhost:8888/");
		driver.manage().window().maximize();
		
		ext.log(Status.INFO, "user name  launch succefully");
        driver.findElement(By.name("user_name")).sendKeys("admin");
        
		ext.log(Status.INFO, "passwerd is open launch succefully");
       driver.findElement(By.name("user_password")).sendKeys("admin");
       
       ext.log(Status.INFO, "login is sauccefully");
       driver.findElement(By.name("Login")).click();
       
      ext.log(Status.INFO, "makketeting is open uie");
      
      driver.findElement(By.linkText("Marketing")).click();
            ext.log(Status.INFO, "leads is brower is open");
    
      
      driver.findElement(By.linkText("Leads"));
            ext.log(Status.INFO, "i want chequte in pluse value");
      
            driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
      
      ext.log(Status.INFO, "my name is right or not");
      driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("ramkumar");
      
      
       etend.flush();
	}

}
