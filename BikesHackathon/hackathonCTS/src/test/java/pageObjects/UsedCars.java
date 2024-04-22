package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class UsedCars extends BasePage{

WebDriver driver;
	
	public UsedCars(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	@FindBy(xpath="(//a[@class='c-p'])[4]")WebElement drpdn_UsedCars;
	@FindBy(xpath="//span[text()='Chennai']")WebElement opt_Chennai;
	@FindBy(xpath="//span[text()='Read More']")WebElement Read_more;
	@FindBy(xpath = "//table[@class='tbl bdr']")WebElement carsTable;
	
	public void moveCursorToUsedCars() {
		Actions act=new Actions(driver);
		act.moveToElement(drpdn_UsedCars).build().perform();
	}
	public void SelectChennai() {
		opt_Chennai.click();
		Read_more.click();
	}
	public void printTopUsedCarsInChennai() {
		System.out.println("Popular models of Used Cars in Chennai");
        List<WebElement> rows = carsTable.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.print(col.getText() + "\t");
            }
            System.out.println();
        }
    }
}
