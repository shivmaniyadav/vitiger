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

public class Etendsreportscrt {

	public static void main(String[] args) {
		File file=new File("rakesh.html");
		ExtentSparkReporter exter	=new ExtentSparkReporter(file);
		ExtentReports rep = new ExtentReports();
		rep.attachReporter(exter);
		ExtentTest er=rep.createTest("Tcoo1");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		er.log(Status.INFO, "localhost is launch successfully");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		er.log(Status.INFO, "enter username is successfully ");
		
		driver.findElement(By.name("user_password")).sendKeys("admin");
		er.log(Status.INFO, "enter password is successfully");
		rep.flush();
	}

}
