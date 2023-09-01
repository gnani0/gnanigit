package Page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class base_page {
	WebDriver driver;
	
	public base_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static  void mouse(WebDriver driver,WebElement ele) {
		Actions actions=new Actions(driver);
		actions.moveToElement(ele).click().perform();
	}
	
}
