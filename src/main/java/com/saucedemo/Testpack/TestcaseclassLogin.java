package com.saucedemo.Testpack;

import java.lang.System.Logger;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemo.Pompack.LoginPomClasss;

public class TestcaseclassLogin 
{
	  
	@Test
	public  void verifyloginfunctionality()
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		System.out.println("browser has opend");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Url is entered");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		LoginPomClasss x = new LoginPomClasss(driver);
		x.sendusername();
		System.out.println("Username is entered");
        x.sendpassword();
		System.out.println("Password is entered");
		x.clicklgnbtn();
		System.out.println("log in activity is performed");
		System.out.println("=======validation check for home page==========");
		String actualurl ="https://www.saucedemo.com/inventory.html";
        String Expectedurl = driver.getCurrentUrl();
        if(actualurl.equals(Expectedurl))
        {
        	System.out.println("Test case passed");
        }else
        {
        	System.out.println("Test case Failed");

        }
        driver.quit();
        System.out.println("browser has closed");
    	System.out.println("End of Program");

	}

}
