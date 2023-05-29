package com.saucedemo.Testpack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.saucedemo.Pompack.AddtocartPomclass;



public class Testclass1 extends Testbaseclass
{
	@Parameters
	@Test(priority=1)
	public void TC_01verifyloginfunctionality()
	{
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
	}
	
	@Test(priority=3)
	public void TC_02verifylogoutfunctionality()
	{
		//apply validations for test case pass or fail
	    System.out.println("============vaidation for login page=============");
	    String expectedtitle = "Swag Labs";
	   // Thread.sleep(2000);
	    String Actualtitle=driver.getTitle();
	    System.out.println(Actualtitle);
	    if(expectedtitle.equals(Actualtitle))
	    {
	    	System.out.println("Test case is passed");
	    }else
	    {
	    	System.out.println("Test case is Failed");

	    }
	}
	
	@Test(priority=2)
	  public void TC_03verifyaddtocartfunctionality()
	      {
			
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
	  }
	

}
