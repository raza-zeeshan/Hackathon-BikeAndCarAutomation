package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[text()='New Bikes']") WebElement dropdown_newBikes;
	@FindBy(xpath="//span[text()='Upcoming Bikes']") WebElement option_upcomingBikes;
	
	public void moveCursorToNewBikes() {
		Actions act=new Actions(driver);
		act.moveToElement(dropdown_newBikes).build().perform();
	}
	
	public void clickOnUpcomingBikes() {
		option_upcomingBikes.click();
	}
}

