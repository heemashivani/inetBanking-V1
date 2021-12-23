package com.inetBanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By email = By.name("uid");
	By password = By.name("password");
	By login = By.name("btnLogin");
	By message = By.cssSelector(".heading3");
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Login()
	{
		return driver.findElement(login);
	}
	public WebElement LoginMessage()
	{
		return driver.findElement(message);
	}
}
