package com.saucedemo.Pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpomclass 
{
	private WebDriver driver;
	private Actions act;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement optionbtn;
	public void clickoptionbutton()
	{
		optionbtn.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")            
	WebElement logoutbtn;
	public void clicklogoutbtn()
	{
		logoutbtn.click();
	}
	
	//by using mouse click action
//	private void clicklogoutbtn1()
//	{
//		
//		act.click(logoutbtn).perform();
//	}
	
	
	public Logoutpomclass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

}
