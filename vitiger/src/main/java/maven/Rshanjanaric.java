package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Rshanjanaric {
	static ExtentTest a;
    public static void invokechromebrowser(WebDriver driver, String byname ,String url) {
    	try {
    	if(byname.equalsIgnoreCase("chrome")) {
    		WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver();
    	
    	
    	}else if(byname.equalsIgnoreCase("firefox")) {
    		WebDriverManager.firefoxdriver().setup();
    		driver= new FirefoxDriver();
    		
    	}else if(byname.equalsIgnoreCase("edge")) {
    		driver=new EdgeDriver();
    		
    	}else {
    	System.out.println("given browername is worng");
    	
    	}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	try{	
    driver.get(url);
    	}catch(Exception e) {
    	driver.navigate().to(url);	
    	}catch(Throwable e) {
    	e.printStackTrace();	
    	}
    	
    	
    }
    public static WebElement getElement(WebDriver driver, String locatorName,String value) {
    	WebElement we=null;
    	try {
    if (locatorName.equalsIgnoreCase("xpath")) {	
    	return driver.findElement(By.xpath(value));
    }else if(locatorName.equalsIgnoreCase("id")) {
    	return driver.findElement(By.id(value));

    }else if(locatorName.equalsIgnoreCase("name")) {
    	return	driver.findElement(By.id(value));

    }else if(locatorName.equalsIgnoreCase("classname")) {
    	return driver.findElement(By.id(value));

    }else if(locatorName.equalsIgnoreCase("tagname")) {
    	return driver.findElement(By.id(value));

    }else if(locatorName.equalsIgnoreCase("linktest")) {
    	return driver.findElement(By.id(value));

    }else if(locatorName.equalsIgnoreCase("css")) {
    	return driver.findElement(By.id(value));

    }else if(locatorName.equalsIgnoreCase("parcitaillinktext")) {
    	return driver.findElement(By.id(value));

    }else {
    	a.log(Status.INFO, "locator is not match");
    }
    	}catch(Exception e) {
    		a.log(Status.INFO, e);

    		
    	}
    	return we;
    }    	

	
    public static void Entertextbox(WebDriver driver,String locatorName ,String value,String datavalue) {
    	WebElement we=getElement(driver, locatorName, value);
    boolean st=	cheekElement(driver, locatorName, value);
    	if(st==true) {
    		we.clear();
    		we.sendKeys(datavalue);
    	}
    	
    }
    public static boolean cheekElement( WebDriver driver, String locatorName,String value) {
    	boolean status=false;
    
    	WebElement we=getElement(driver,locatorName ,value );
    	if(we.isDisplayed()) {
    	a.log(Status.PASS, "element is displayed");
    	if(we.isEnabled()) {
    	a.log(Status.INFO, "element is enabled");
    	status=true;
    	}else {
        	a.log(Status.INFO, "element is not enabled");

    }
    
    }else {
    	a.log(Status.PASS, "element is not displayed");
    }
    	return status;
    
    }    
    
   public static void click (WebDriver driver,String locatorName, String value) {
	  WebElement we=getElement(driver, locatorName, value) ;
	   boolean st=cheekElement(driver, locatorName, value);
	   if(st==true) {
		 we.click();  
	   }
   }
    
      public static void inputvalue(WebElement driver) {
      
    	
      }
    public static void main(String[] args) {
	//WebDriver driver=
	}  
}