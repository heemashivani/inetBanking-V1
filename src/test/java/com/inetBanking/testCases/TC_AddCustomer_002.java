package com.inetBanking.testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;
import com.inetBanking.pageObject.addCustomer;
import com.inetBanking.pageObject.base;

public class TC_AddCustomer_002 extends base
{

	public WebDriver driver;
	public static Logger log = (Logger) LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void setup() throws IOException
	{
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Url Opened");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.Email().sendKeys(prop.getProperty("username"));
		lp.Password().sendKeys(prop.getProperty("password"));
		lp.Login().click();
		log.info("Login is Successful");
		
		addCustomer ac = new addCustomer(driver);
		ac.addCust().click();
		ac.CustName().sendKeys("Shane");
		ac.CustGen().click();
		ac.Custdob().sendKeys("08281990");
		ac.Custadd().sendKeys("Koturu");
		ac.Custcity().sendKeys("Vijayawada");
		ac.Custstate().sendKeys("Kerala");
		ac.CustpinNum().sendKeys("255804");
		ac.CustNum().sendKeys("544313224");
		ac.Custemail().sendKeys("agghadh@gmail.com");
		ac.CustReg().click();
		log.info("Customer Sucesfully registered");
	}	
}