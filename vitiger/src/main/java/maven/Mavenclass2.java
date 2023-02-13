package maven;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavenclass2 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

//		Date dt = new Date();
//		long tm = dt.getTime();
		//  when we want get screen shot of our run time code 
		TakesScreenshot tc = (TakesScreenshot) driver;    //1 down casting
		File from = tc.getScreenshotAs(OutputType.FILE); //2 call the method of parameterized
		File to = new File("takes//screen.png");        //3 object of file class
		Files.copy(from, to);                          //4 call the method of copy it is parameterized method
		
	}
}
