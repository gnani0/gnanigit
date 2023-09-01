package Test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_objects.HomePage;
import Page_objects.Login_page;
import Page_objects.MyAccount_page;
import Test_base.baseClass;

public class TC_loginPage extends baseClass {
	@Test
	public void Login() {
		HomePage hp=new HomePage(driver);
		hp.MyAcc();
		logger.info("Clicked on My account link");
		
		hp.click_login();
		logger.info("Clicked on login link");
		Login_page lp=new Login_page(driver);
		lp.Email(rb.getString("email"));
		logger.info("email entered");
		lp.Password(rb.getString("password"));
		logger.info("password entered");
		lp.Click_login();
		logger.info("login");
		MyAccount_page my=new MyAccount_page(driver);
		boolean text=my.check_msg();
		Assert.assertEquals(text, true ,"passed");
		 logger.info("***finished***");
		my.Click_logout(); 
	}

}
