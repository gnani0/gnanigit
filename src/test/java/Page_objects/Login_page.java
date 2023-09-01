package Page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page extends base_page {
	WebDriver driver;

	public Login_page(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="email")WebElement txt_email;
	@FindBy(name="password")WebElement txt_password;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")WebElement login_btn;
	public void Email(String em) {
		txt_email.sendKeys(em);
	}
	public void Password(String pw) {
		txt_password.sendKeys(pw);
		}
	public void Click_login() {
		login_btn.click();
	}

	

}
