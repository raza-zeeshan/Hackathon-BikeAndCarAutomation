package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UpcomingCars extends BasePage{

WebDriver driver;
	
	public UpcomingCars(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	//@FindBy(xpath="//select[@id='makeId']")WebElement UpBikes_dropdown;
	@FindBy(xpath="//select[@id='makeId']")WebElement UpBikes_dropdown_options;
	@FindBy(xpath="//div[@class='p-15 pt-10 mke-ryt rel']")List<WebElement> list_Bikes;
	
	public void selectHonda() {
		Select myselect=new Select(UpBikes_dropdown_options);
		myselect.selectByVisibleText("Honda");
	}
	
	public void processBikeDetails() {
		System.out.println("Upcoming Bikes of Hondas and bikes price less than 4lacs");
        for (WebElement i : list_Bikes) {
            String price = i.findElement(By.xpath(".//div[@class='b fnt-15']")).getText();
            if (price != null && !price.isEmpty()) {
                price = price.replace("Rs. ", "").replace(",", "");
                int priceValue = 0;
                if (price.contains("Lakh")) {
                    price = price.replace(" Lakh", "");
                    priceValue = (int) (Float.parseFloat(price) * 100000); // Convert lakh to rupees
                } else {
                    priceValue = Integer.parseInt(price);
                }

                if (priceValue < 400000) {
                    String title = i.findElement(By.xpath(".//a/strong")).getText();
                    String launchDate = i.findElement(By.xpath(".//div[@class='clr-try fnt-14']")).getText();

                    System.out.println("Bike Name: " + title);
                    System.out.println("Price: " + price);
                    System.out.println("Launch Date: " + launchDate + "\n");
                }
            }
        }
    }
}
