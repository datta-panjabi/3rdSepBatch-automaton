package com.saucedemo.Testpack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.Pompack.AddtocartPomclass;
import com.saucedemo.Pompack.LoginPomClasss;
import com.saucedemo.Pompack.Logoutpomclass;



public class Testnganootaions 
{
	      WebDriver driver;
	        Logger log   = Logger.getLogger("Ecommerce_project_3rdSepBatch");
	       @BeforeMethod
	       public void setup()
	       {
		        //launch the browser
				System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
				PropertyConfigurator.configure("log4j.properties");
				log.info("browser has opend");
				
				
				//creating new chormedriver instance
			    driver = new ChromeDriver();
				
				//enter URL
				driver.get("https://www.saucedemo.com/");
				log.info("Url is entered");
				
				//applying waits
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				//maximize the browser
				driver.manage().window().maximize();
				log.info("Browser is maximized");
				
				//send user name in the username textbox
				LoginPomClasss x = new LoginPomClasss(driver);
				x.sendusername();
				log.info("Username is entered");
				
				//send user name in the password textbox
		        x.sendpassword();
		        
		        //click on login butn
		        log.info("Password is entered");
				x.clicklgnbtn();
				log.info("log in activity is performed");
				
//				//click on add to cart button
//				AddtocartPomclass add = new AddtocartPomclass(driver);
//				add.clickaddtocartbtn();
//				System.out.println("Clicked on addto cart button successfully");
//				
//				//getting total count for total items selected
//				 String numberofitemsselected =add.itemsaddtocart();
//				
//		        System.out.println("============validation for add to cart Functionality==========");
//				
//				String actualitemaddedtocart = "1";
	       }
				
				@Test
				public void verifyaddtocartfunctionality()
				{
					//click on add to cart button
					AddtocartPomclass add = new AddtocartPomclass(driver);
					add.clickaddtocartbtn();
					log.info("Clicked on addto cart button successfully");
					
					//getting total count for total items selected
					 String numberofitemsselected =add.itemsaddtocart();
					
					 log.info("============validation for add to cart Functionality==========");
					
					String actualitemaddedtocart = "1";
					
					if(numberofitemsselected.equals(actualitemaddedtocart))
					{
						System.out.println("Add to cart test case is passed");
					}else
					{
						System.out.println("Add to cart test case is Failed");
					}
					
					
				}
				
				@AfterMethod
				public void teardown()
				{
					driver.quit();
					log.info("browser has closed");
					log.info("End of Program");

				}
	}



