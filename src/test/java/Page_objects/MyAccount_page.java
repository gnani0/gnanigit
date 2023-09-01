package Page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount_page extends base_page {
	WebDriver driver;

	public MyAccount_page(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[@id=\"account-account\"]")WebElement msg;
	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[13]")WebElement logout;
	public boolean check_msg() {
		try {
			return(msg.isDisplayed());
		}catch(Exception e){
			return(false);
		}
	}
	public void Click_logout() {
		logout.click();
	}
}
