package com.saucedemo.Testpack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemo.Pompack.LoginPomClasss;
import com.saucedemo.Pompack.Logoutpomclass;

public class Logouttestcaseclass 
{
	@Test
	public  void verifyLogouttestcasefunctionality() throws InterruptedException
	{
		//preparing for browsser setup
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		System.out.println("browser has opend");
		
		//creating a new instance of chromedriver
		WebDriver driver = new ChromeDriver();
		
		//entering the url
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getCurrentUrl());
		
		//apply the implicite wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Url is entered");
		
		//browser maximize
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		//perform log in functionality
		LoginPomClasss x = new LoginPomClasss(driver);
		x.sendusername();
		System.out.println("Username is entered");
        x.sendpassword();
		System.out.println("Password is entered");
		x.clicklgnbtn();
		System.out.println("log in activity is performed");
		
		//creating object of the logout class
		Logoutpomclass js = new Logoutpomclass(driver);
		
		//click on option button
		js.clickoptionbutton();
		System.out.println("clicked on opotioins button");
	    
		//y.clicklogoutbtn();
		js.clicklogoutbtn();
		System.out.println("clicked on Logout button");

	    System.out.println("Logout activity is performed");
	    
	    //apply validations for test case pass or fail
	    System.out.println("============vaidation for login page=============");
	    String expectedtitle = "Swag Labs";
	    Thread.sleep(2000);
	    String Actualtitle=driver.getTitle();
	    System.out.println(Actualtitle);
	    if(expectedtitle.equals(Actualtitle))
	    {
	    	System.out.println("Test case is passed");
	    }else
	    {
	    	System.out.println("Test case is Failed");

	    }
	    driver.quit();
        System.out.println("browser has closed");
    	System.out.println("End of Program");

	}

}
