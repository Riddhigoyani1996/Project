package mvn;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Browser.BrowserSelection;
import com.model.AddToCart;

import com.model.Login;
import com.model.SideMenu;

public class MainTest {

	WebDriver driver=null;
	Login lp=null;
	SideMenu s1=null;
	AddToCart a1 =null;
	
	@BeforeClass
	public void loadBrowser() throws InterruptedException
	{
		driver=new BrowserSelection().ChromeBrowserSelection("chrome", "https://www.saucedemo.com/");
		Thread.sleep(3000);
	}
	@BeforeTest
	public void beforetest()
	{
		lp=new Login();
		s1=new SideMenu();
		a1=new AddToCart();
	}
	@Test(priority = 0)
	public void loginDetails() throws InterruptedException
	{
		lp.enterUsername(driver, "standard_user");
		lp.enterPassword(driver, "secret_sauce");
		lp.clickLogin(driver);
	}
	@Test(priority = 1)
	public void sideMenu() throws InterruptedException
	{
		s1.openSideMenu(driver);
		s1.openAllItem(driver);
		s1.openAbout(driver);
		driver.navigate().back();
		Thread.sleep(2000);
		s1.openResetAppState(driver);
		s1.closeSideMenu(driver);
	}
	@Test(priority = 2)
	public void addToCart() throws InterruptedException
	{
		a1.addtocartlogo(driver);
	}
	
	
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		System.out.println("Bye Bye...");
		Thread.sleep(3000);
		driver.close();		
	}
}
