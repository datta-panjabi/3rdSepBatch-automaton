package com.saucedemo.Testpack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemo.Pompack.AddtocartPomclass;
import com.saucedemo.Pompack.LoginPomClasss;

public class AddtocartTestclass 
{
	@Test
	public void verifyAddtocartTestclass()
	{
		//launch the browser
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		System.out.println("browser has opend");
		
		//creating new chormedriver instance
		WebDriver driver = new ChromeDriver();
		
		//enter URL
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url is entered");
		
		//applying waits
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//maximize the browser
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		//send user name in the username textbox
		LoginPomClasss x = new LoginPomClasss(driver);
		x.sendusername();
		System.out.println("Username is entered");
		
		//send user name in the password textbox
        x.sendpassword();
        
        //click on login butn
		System.out.println("Password is entered");
		x.clicklgnbtn();
		System.out.println("log in activity is performed");
		
		//click on add to cart button
		AddtocartPomclass add = new AddtocartPomclass(driver);
		add.clickaddtocartbtn();
		System.out.println("Clicked on addto cart button successfully");
		
		//getting total count for total items selected
		 String numberofitemsselected =add.itemsaddtocart();
		
        System.out.println("============validation for add to cart Functionality==========");
		
		String actualitemaddedtocart = "1";
		if(numberofitemsselected.equals(actualitemaddedtocart))
		{
			System.out.println("Add to cart test case is passed");
		}else
		{
			System.out.println("Add to cart test case is Failed");
		}
		driver.quit();
        System.out.println("browser has closed");
    	System.out.println("End of Program");


		
		
	}

}
