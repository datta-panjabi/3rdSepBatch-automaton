package com.saucedemo.Pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPomclass 
{
   WebDriver driver;
   @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
   WebElement adtocartbutn;
   public void clickaddtocartbtn()
   {
	   adtocartbutn.click();
   }
   
   @FindBy(xpath="//span[@class='shopping_cart_badge']")
   WebElement addtocart;
   
   public String itemsaddtocart()
   {
	 String totalitemselected=  addtocart.getText();
	 return totalitemselected;
   }
   
   
   
   public AddtocartPomclass(WebDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
}
