package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pageObjects.HomePage;
import pageObjects.UpcomingCars;
import testBase.BaseClass;

public class TC_002_UpcomingCarDetails extends BaseClass{
	@Test
	public void verify_SelectHonda() {
		
		logger.info("*****  Starting TC_002_UpcomingCarDetails  *****");
		HomePage hp=new HomePage(driver);
		hp.moveCursorToNewBikes();
		logger.info("Moved curson to NewBikes Dropdown");
		hp.clickOnUpcomingBikes();
		logger.info("Clicked on Upcoming Bikes Section");
		
		UpcomingCars uc=new UpcomingCars(driver);
		logger.info("Selecting Honda from Manufacturers List");
		uc.selectHonda();
		logger.info("Printing the bike details on Console");
		uc.processBikeDetails();
		logger.info("*****  Finished TC_002_UpcomingCarDetails   *****");
	}
}
