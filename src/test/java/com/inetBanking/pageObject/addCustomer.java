package com.inetBanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addCustomer 
{
	public WebDriver driver;
	public addCustomer(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By addCust = By.cssSelector("a[href*='addcustomer']");
	By name =  By.cssSelector("[name='name']");
	By gender= By.xpath("//input[@type='radio'][2]");
	By dob =  By.id("dob");
	By address = By.cssSelector("[name='addr']");
	By city = By.cssSelector("[name='city']");
	By state = By.cssSelector("[name='state']");
	By pincode = By.xpath("//input[@name='pinno']");
	By phnNo = By.name("telephoneno");
	By emailid = By.name("emailid");
	By register =  By.name("sub");
	
	public WebElement addCust()
	{
		return driver.findElement(addCust);
	}
	
	public WebElement CustName()
	{
		return driver.findElement(name);
	}
	
	public WebElement CustGen()
	{
		return driver.findElement(gender);
	}
	
	public WebElement Custdob()
	{
		return driver.findElement(dob);
	}
	
	public WebElement Custadd()
	{
		return driver.findElement(address);
	}
	
	public WebElement Custcity()
	{
		return driver.findElement(city);
	}
	
	public WebElement Custstate()
	{
		return driver.findElement(state);
	}
	
	public WebElement CustpinNum()
	{
		return driver.findElement(pincode);
	}

	public WebElement CustNum()
	{
		return driver.findElement(phnNo);
	}
	
	public WebElement Custemail()
	{
		return driver.findElement(emailid);
	}	
	
	public WebElement CustReg()
	{
		return driver.findElement(register);
	}
}
