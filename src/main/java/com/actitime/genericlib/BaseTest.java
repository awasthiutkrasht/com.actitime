package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoCons {
	public static WebDriver d ;
	Filelib flib = new Filelib();
	@BeforeClass
	public void openBrowser() throws Throwable {
		
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	    d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    Filelib flib = new Filelib();
	    d.get(flib.getProperty(PROP_PATH, "url"));
	 }

	@AfterClass
   public void closeBrowser() {
	 d.quit();  
   }


}