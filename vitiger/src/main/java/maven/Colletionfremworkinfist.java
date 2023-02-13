package maven;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Colletionfremworkinfist {
       
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		
		DateFormat date=new SimpleDateFormat("mm_dd_yyyy_hh_mm_ss");
		String time =date.format(new Date());
		File fe= new File("shivmaniyadav.html");
		ExtentSparkReporter exter	=new ExtentSparkReporter(fe);
		ExtentReports  er=new ExtentReports();
		er.attachReporter(exter);
		ExtentTest str = er.createTest("tcoo1");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		enterTestboxvalue(str, driver, "user_name","admin","userName Box");
		enterTestboxvalue(str, driver, "user_passward","admin","userPassward Box");

		
//		
//		
//		st.log(Status.INFO, "webdriver is create createin this time");
//		driver.get("http:localhost:8888/");
//		
//		st.log(Status.INFO,"localhos is lanch in this time");
//	     driver.findElement(By.name("user_name")).sendKeys("admin");
//	     
//	    	 
//	     st.log(Status.INFO, "admin has been entered in user nametest bax succesfully");
//	     driver.findElement(By.name("user_password")).sendKeys("admin");
//	     
//	     driver.findElement(By.name("Login")).click();
	}
	    public void verifiesearchleads() {
	    	DateFormat date=new SimpleDateFormat("DD_MM_YYYY_hh_mm_ss");
			String time =date.format(new Date());

			File fe= new File("shivmaniyadav"+time+".html");
			ExtentSparkReporter exter	=new ExtentSparkReporter(fe);
			ExtentReports  er=new ExtentReports();
			er.attachReporter(exter);
			ExtentTest str = er.createTest("tcoo1");
			ExtentTest str2 = er.createTest("tcoo2");

			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			enterTestboxvalue(str, driver, "user_name","admin","userName Box");
			enterTestboxvalue(str, driver, "user_passward","admin","userPassward Box");

	    }	
			
			public static void enterTestboxvalue(ExtentTest st,WebDriver driver,String locatorValue,String testValue,String boxName) {
			
			
			st.log(Status.INFO, "webdriver is create createin this time");
			driver.get("http:localhost:8888/");
			st.log(Status.INFO,"localhos is lanch in this time");
		    WebElement we= driver.findElement(By.name(locatorValue));
		    
		    if(we.isDisplayed()==true) {
		    	we.sendKeys(testValue);
		    if(we.isEnabled()==true) {
		    	st.log(Status.PASS,boxName+" is isenable is successfully");
		    }else {
		    	st.log(Status.PASS, boxName+" is not isenablesuccefully");
		    }
		    }else {
		    	st.log(Status.PASS,boxName+ " is dispaly successfully");
		    	TakesScreenshot tss=(TakesScreenshot)driver;
		    	File obj =tss.getScreenshotAs(OutputType.FILE);
		    }
		     st.log(Status.INFO, testValue+" has been entered in "+boxName+"  succesfully");
		     driver.findElement(By.name("user_password")).sendKeys("admin");
		     driver.findElement(By.name("Login")).click();

	}
 
}
