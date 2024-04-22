package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_NavigateFromHomePage extends BaseClass{
	
	
	@Test
	public void verify_navigateFromHomePage() {
		
		logger.info("*****  Starting TC_001_NavigateFromHomePage  *****");
		HomePage hp=new HomePage(driver);
		hp.moveCursorToNewBikes();
		logger.info("Moved curson to NewBikes Dropdown");
		hp.clickOnUpcomingBikes();
		logger.info("Clicked on Upcoming Bikes Section");
		logger.info("*****  Finished TC_001_NavigateFromHomePage  *****");
	}
}
