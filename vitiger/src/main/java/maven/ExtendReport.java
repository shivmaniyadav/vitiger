   package maven;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReport {

	public static void main(String[] args) {
		File f1 = new File("ram.html");
		ExtentSparkReporter esr = new ExtentSparkReporter(f1);
		ExtentReports ext = new ExtentReports();
		ext.attachReporter(esr);
		ExtentTest rtr = ext.createTest("Tc001");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http:localhost:8888/");
		rtr.log(Status.INFO, "url is lounch");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		rtr.log(Status.INFO, "lounch is usre name");
		
		driver.findElement(By.name("user_password")).sendKeys("admin");
		rtr.log(Status.INFO, "passerred is open");
		
		driver.findElement(By.name("Login")).click();
		rtr.log(Status.INFO, "loginpage is good and  UIE page");
		
		driver.findElement(By.linkText("Marketing")).click();
		rtr.log(Status.INFO, "marketing is good open also and uie page");
		
		driver.findElement(By.className("")).click();
		rtr.log(Status.INFO, "campeing is open and brower is lanunch");
		ext.flush();

	}

}   
