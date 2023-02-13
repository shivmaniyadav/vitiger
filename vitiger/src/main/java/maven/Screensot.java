package maven;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screensot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
	WebDriver	driver=new ChromeDriver();
       driver.get("http://localhost:8888/");
       driver.manage().window().maximize();
       driver.findElement(By.name("user_name")).sendKeys("admin");
       driver.findElement(By.name("user_password")).sendKeys("admin");
      
       WebElement login=driver.findElement(By.name("Login"));
       boolean checkE=login.isEnabled();
       if(checkE==false) {
    	   System.out.println("Teting is pass because, Login button is Enabled.");
    	   login.click();
       }else {
    	   System.out.println("Testing is failed because, login button is Disabled..");
    	   TakesScreenshot tc=(TakesScreenshot)driver;
           File from=tc.getScreenshotAs(OutputType.FILE);
           File to=new File("takes//screenshot.png");
           Files.copy(from, to);
       }
       
	}

}
