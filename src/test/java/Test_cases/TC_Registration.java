package Test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Page_objects.Register_page;
import Page_objects.HomePage;
import Test_base.baseClass;

public class TC_Registration extends baseClass{
	@Test
	public void test_account_Registration() throws InterruptedException
	{
		logger.debug("application logs......");
		logger.info("***  Starting TC_001_AccountRegistrationTest ***");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.MyAcc();
		logger.info("Clicked on My account link");
		
		hp.click_register();
		logger.info("Clicked on register link");
		
		Register_page regpage=new Register_page(driver);
			
		logger.info("Providing customer data");
		
		regpage.frstnm(randomeString().toUpperCase());
		
		regpage.lstnm(randomeString().toUpperCase());
		
		regpage.eml(randomeString()+"@gmail.com");// randomly generated the email
		
		regpage.cell(randomeNumber());
		
		String password=randomAlphaNumeric();
		regpage.pswd(password);
		regpage.cnfrm(password);
		
		regpage. click_box();
		regpage.click_radio();
		
		regpage.click_continue();
		logger.info("Clicked on continue");
		
		String confmsg=regpage.check_msg();
		
		logger.info("Validating expected message");
		Assert.assertEquals(confmsg, "Your Account Has Been Create!","Test failed");
		
		}catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("***  Finished TC_001_AccountRegistrationTest ***");		
		}
	
	
}