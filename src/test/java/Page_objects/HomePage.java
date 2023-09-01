package Page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends base_page {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement myacc;
	@FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")
	WebElement register;
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement Login;

	public void MyAcc() {
		myacc.click();
	}

	public void click_register() {
		register.click();
	}

	public void click_login() {
		Login.click();
	}
}
