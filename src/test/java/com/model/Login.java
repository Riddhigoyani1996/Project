package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	public void enterUsername(WebDriver driver,String username) throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);
	}
	public void enterPassword(WebDriver driver,String password) throws InterruptedException
	{
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
	}
	public void clickLogin(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
		{
			System.out.println("Your Login Test Has been Passed...");
		}
		else
		{
			System.out.println("Your Login Test Hasbeen Failed...");
			
		}
		
	}

}
