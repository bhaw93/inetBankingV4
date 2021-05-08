package com.inetBanking.testCases;

import com.inetBanking.pageObjects.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001  extends BaseClass{
	

	@Test
	 public  void loginTest()
	 {
	 logger.info("URL is opened");
	 LoginPage lp =new LoginPage(driver);
	 lp.setUserName(username);
	 logger.info("Entered Username");
	 lp.setPassword(password);
	 logger.info("Entered password");
	 lp.clicksubmit();
	 
	 if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	 {Assert.assertTrue(true);
	 logger.info("Login Test Passed");
	 
	 }
	 else{
		 Assert.assertTrue(false);
		 logger.info("Login Test Failed");
	 }
	 
	 }
}

