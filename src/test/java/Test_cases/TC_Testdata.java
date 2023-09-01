package Test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Test_base.baseClass;
import Page_objects.HomePage;
import Page_objects.Login_page;

import Page_objects.MyAccount_page;

import Utilities.DataProviders;

public class TC_Testdata extends baseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void test_LoginDDT(String email, String pwd, String exp) {
		logger.info(" Starting TC_Testdata ");

		try {
			HomePage hp = new HomePage(driver);
			hp.MyAcc();
			logger.info("Clicked on My account link");
			hp.click_login();

			Login_page lp = new Login_page(driver);
			lp.Email(email);
			lp.Password(pwd);
			lp.Click_login();

			MyAccount_page macc=new MyAccount_page(driver);
			boolean targetpage = macc. check_msg();// this method is created MyAccountPage

			if (exp.equals("Valid")) {
				if (targetpage == true) {
					macc.Click_logout();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equals("Invalid")) {
				if (targetpage == true) {
					MyAccount_page myaccpage = new MyAccount_page(driver);
					myaccpage.Click_logout();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}

		} catch (Exception e) {
			Assert.fail();
		}

		logger.info(" Finished TC_003_LoginDataDrivenTest");

	}

}
