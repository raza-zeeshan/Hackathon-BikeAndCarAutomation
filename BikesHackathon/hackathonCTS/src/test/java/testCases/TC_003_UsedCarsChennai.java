package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pageObjects.HomePage;
import pageObjects.UpcomingCars;
import pageObjects.UsedCars;
import testBase.BaseClass;

public class TC_003_UsedCarsChennai extends BaseClass{
	@Test
	public void verify_SelectHonda() {
		
		logger.info("*****  TC_003_UsedCarsChennai  *****");
		HomePage hp=new HomePage(driver);
		hp.moveCursorToNewBikes();
		logger.info("Moved curson to NewBikes Dropdown");
		hp.clickOnUpcomingBikes();
		logger.info("Clicked on Upcoming Bikes Section");
		
		UpcomingCars uc=new UpcomingCars(driver);
		logger.info("Selecting Honda from Manufacturers List");
		uc.selectHonda();
		logger.info("Printing the Details of the bikes on console");
		uc.processBikeDetails();
		
		UsedCars UC=new UsedCars(driver);
		logger.info("Moved cursor to Used Cars Dropdown");
		UC.moveCursorToUsedCars();
		logger.info("Selecting Chennai from List");
		UC.SelectChennai();
		UC.printTopUsedCarsInChennai();
		logger.info("*****  TC_003_UsedCarsChennai   *****");
	}
}
