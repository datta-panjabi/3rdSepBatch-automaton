package com.saucedemo.Pompack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClasss 
{
	private WebDriver driver;
	
	@FindBy(xpath=("//input[@id='user-name']"))
	private	WebElement username ;
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}

	@FindBy(xpath="id('password')")
	private WebElement pass;
	public void sendpassword()
	{
		pass.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="id('login-button')")
	private	WebElement login;
	public void clicklgnbtn()
	{
		login.click();
	}
	
	 public LoginPomClasss(WebDriver driver)
	 {
		 this.driver =driver;
		 PageFactory.initElements(driver, this);
	 }
	
}
