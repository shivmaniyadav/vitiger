package maven;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Genericmethod {
        	  
    public static void main(String[] args) throws IOException {
    	WebDriverManager.chromedriver().setup();
    	File file=new File("vishalkumar.html");
    	ExtentSparkReporter ext=new ExtentSparkReporter(file);
    	ExtentReports e=new ExtentReports();
    	e.attachReporter(ext);
    	ExtentTest d= e.createTest("to verify create leads");
    	WebDriver driver= new ChromeDriver();
    	driver.get("http:localhost:8888/");
    	d.log(Status.INFO, "localhost is lanch brower ");
    	
        driver.findElement(By.name("user_name")).sendKeys("admin");
        d.log(Status.INFO, "username enterd in taxt box successfully");
        
        driver.findElement(By.name("user_password")).sendKeys("admin");
        d.log(Status.INFO,"userpasswared enterd in taxt box successfully");
        
        driver.findElement(By.name("Login")).click();
        d.log(Status.INFO, "login butten is clicked successfully");
        
        TakesScreenshot ta= (TakesScreenshot)driver;
        File fd=ta.getScreenshotAs(OutputType.FILE);
        File from= new File("vishalkuaryadav.png");
         Files.copy(fd, from);
         
        
  
    e.flush();
    
	}
	
	
	
	
	
	
	
	
	
}
