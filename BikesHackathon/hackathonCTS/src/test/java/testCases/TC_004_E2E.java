package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.UpcomingCars;
import pageObjects.UsedCars;
import testBase.BaseClass;

public class TC_004_E2E extends BaseClass{
	
	@Test(priority=1)
	public void Verify_NavigateFromHomePage() {
		
		logger.info("*****  Starting TC_001_NavigateFromHomePage  *****");
		HomePage hp=new HomePage(driver);
		hp.moveCursorToNewBikes();
		logger.info("Moved cursor to NewBikes Dropdown");
		hp.clickOnUpcomingBikes();
		logger.info("Clicked on Upcoming Bikes Section");
		logger.info("*****  Finished TC_001_NavigateFromHomePage  *****");
	}
	
	@Test(priority=2)
	public void Verify_SelectHonda() {
		
		logger.info("*****  Starting TC_002_UpcomingCarDetails  *****");
		UpcomingCars uc=new UpcomingCars(driver);
		logger.info("Selecting Honda from Manufacturers List");
		uc.selectHonda();
		logger.info("Printing the bike details on Console");
		uc.processBikeDetails();
		logger.info("*****  Finished TC_002_UpcomingCarDetails   *****");
	}
	
	@Test(priority=3)
	public void Verify_USsedCarsChennai() {
		
		logger.info("***** Starting TC_003_UsedCarsChennai  *****");
		
		UsedCars UC=new UsedCars(driver);
		logger.info("Moved cursor to Used Cars Dropdown");
		UC.moveCursorToUsedCars();
		logger.info("Selecting Chennai from List");
		UC.SelectChennai();
		
		UC.printTopUsedCarsInChennai();
		logger.info("***** Finished TC_003_UsedCarsChennai   *****");
	}
}
