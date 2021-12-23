package com.inetBanking.testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.UnhandledAlertException;
import com.inetBanking.pageObject.LoginPage;
import com.inetBanking.pageObject.base;  

@SuppressWarnings("unused")
public class TC_LoginTest_001 extends base
{
	public WebDriver driver;
	public static Logger log=(Logger) LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void setup() throws IOException
	{
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Url Opened");
	}
	
	@Test
	public void loginTest() throws IOException
	{
	//	DOMConfigurator.configure("./src\\test\\java\\com\\inetBanking\\pageObject\\log4j.xml");  
		LoginPage lp = new LoginPage(driver);
		lp.Email().sendKeys(prop.getProperty("username"));
		log.info("Username entered");
		lp.Password().sendKeys(prop.getProperty("password"));
		log.info("Password entered");
		lp.Login().click();
		log.info("Login is Successful");
		System.out.println(lp.LoginMessage().getText());
		log.info("Login message is Typed in Console Output");
		
		log.info("Validating Page Title");
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			log.info("Title Validated");
		}
		else
		{
			Assert.assertTrue(false);
			log.info("Title Validation Failed");
		}
	}
	
}
