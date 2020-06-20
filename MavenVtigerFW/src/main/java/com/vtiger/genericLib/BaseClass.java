package com.vtiger.genericLib;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.objectrepository.HomePageElements;
import com.vtiger.objectrepository.LoginPageElements;
public class BaseClass extends ListenerFunctionality{
	public static WebDriver driver;
	   public WebDriverCommonUtils wlib = new WebDriverCommonUtils();
	   public DataUtility data = new DataUtility();
	   @BeforeSuite
	   public void configBS()
	   {
		  System.out.println("---------DataBase Connect--------"); 
	   }
	   @BeforeClass
	   public void configBC() throws IOException
	   {
		 System.out.println("--------BrowserLaunch Starts--------");
		 String browser = data.getDataFromProperty("browser");
		 if(browser.equals("chrome"))
	 {
	 System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
	 driver = new ChromeDriver();
	 }
	 else if(browser.equals("firefox")) {
	 System.setProperty("webdriver.chrome.driver","./src/main/resources/geckodriver.exe");			 driver = new FirefoxDriver();
		 }
	     driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	     driver.get(data.getDataFromProperty("url"));
		 System.out.println("--------BrowserLaunch Ends--------");
	   }
	   @BeforeMethod
	   public void configBM() throws IOException 
	   {
		   System.out.println("--------Login Starts---------");
		   LoginPageElements login = PageFactory.initElements(driver, LoginPageElements.class);
		  login.LoginToApp(data.getDataFromProperty("un"), data.getDataFromProperty("pwd"));
		   System.out.println("--------Login Ends---------");
	    }
	   @AfterMethod
	   public void configAM()
	   {
		   System.out.println("--------Logout Starts---------");
		   HomePageElements hp = PageFactory.initElements(driver, HomePageElements.class);
		   hp.LogoutFromApp();
		   System.out.println("--------Logout Ends---------");
		 }
	   @AfterClass
	   public void configAC()
	   {
		   System.out.println("--------Close Browser----------");
		   driver.quit();
	   }
	   @AfterSuite
	   public void configAS()
	   {
		   System.out.println("--------Database Disconnect----------");

	   }
}
