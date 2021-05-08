package com.inetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	 public String baseURL= readconfig.getApplicationURL();
	 public String username=readconfig.getUsername();
	 public String password=readconfig.getPassword();
	public static WebDriver driver;
  public static Logger logger;
	
  
  
    @Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
	
  logger=Logger.getLogger("ebanking");
	PropertyConfigurator.configure("Log4j.properties");
	
	if(br.equals("chrome"))
		
	{System.setProperty("webdriver.chrome.driver","C://Users//Admin//Downloads//chromedriver_win32 (2)//chromedriver.exe");
	driver= new ChromeDriver();
	}
	if(br.equals("firefox"))
		
	{System.setProperty("webdriver.chrome.driver","C://Users//Admin//Downloads//geckodriver-v0.29.1-win64//geckodriver.exe");
	driver= new FirefoxDriver();
	}
		
	
	driver.get(baseURL);
	}

	
	@AfterClass
	public void TearDown()
	{
		
		driver.quit();
	}
}
