package com.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSelection {
	WebDriver driver=null;
	public WebDriver ChromeBrowserSelection(String browser,String URL)
	{
		if(browser.equals("chrome") || browser.equals("Chrome") || browser.equals("CHROME"))
		{
//			System.setProperty("webdriver.chrome.driver", "D:\\Tenorshare\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		     WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(URL);
		}
		return driver;
	}
	public WebDriver firefoxBrowserSelection(String browser,String URL)
	{
		if(browser.equals("firefox") || browser.equals("Firefox") || browser.equals("FIREFOX"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium morning\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(URL);
		}
		return driver;
	}
}
