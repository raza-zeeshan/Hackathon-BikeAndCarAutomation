package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	@FindBy(xpath="//div[@id='forum_login_title_lg']")WebElement icon_login;
	@FindBy(xpath="/html/body/div[12]/div/div/div/div[1]/div/div[3]/div[6]/div")WebElement google_SignIn;
	@FindBy(xpath = "//input[@type='email']") WebElement input_email;
	@FindBy(xpath = "//span[text()='Next']")WebElement nextButton;
	@FindBy(xpath="//*[text()=Logout]")WebElement logout;
	    // Methods to interact with the elements

	    public void clickLogIn() {
	        icon_login.click();
	    }

	    public void clickGoogleSignInButton() {
	        google_SignIn.click();
	       
	    }

	    public void enterEmail(String email) {
	    	 Set<String> WID=driver.getWindowHandles();
				List<String> wid=new ArrayList<>(WID);
				driver.switchTo().window(wid.get(1));
	    	input_email.sendKeys(email);
	    	nextButton.click();
	    }
	    public WebElement LoGOut() {
	    	return logout;
	    }
}

