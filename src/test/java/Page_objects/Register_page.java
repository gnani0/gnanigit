package Page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_page extends base_page {
	WebDriver driver;

	public Register_page(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "firstname")
	WebElement firstname;
	@FindBy(name = "lastname")
	WebElement lastname;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "confirm")
	WebElement confirm;
	@FindBy(name = "telephone")
	WebElement telephone;
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
	WebElement radio;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement checkbox;
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement submit;
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	WebElement msg;

	public void frstnm(String fn) {
		firstname.sendKeys(fn);
	}

	public void lstnm(String ln) {
		lastname.sendKeys(ln);
	}

	public void pswd(String pw) {
		password.sendKeys(pw);
	}

	public void cell(String tel) {
		telephone.sendKeys(tel);
	}

	public void cnfrm(String cpw) {
		confirm.sendKeys(cpw);
	}

	public void eml(String eid) {
		email.sendKeys(eid);
	}

	public void click_radio() {
		radio.click();
	}

	public void click_box() {
		checkbox.click();
	}

	public void click_continue() {
		submit.click();
	}

	public String check_msg() {
		try {
			return (msg.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}

	}
}
