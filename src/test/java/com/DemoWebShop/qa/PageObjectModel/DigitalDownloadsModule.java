package com.DemoWebShop.qa.PageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DigitalDownloadsModule {
	
WebDriver driver;

By DD=By.xpath(" //ul[@class='top-menu']//a[normalize-space()='Digital downloads']");
By album=By.xpath("//div[@class='product-item']//img[@title='Show details for 3rd Album']");

By addcart=By.xpath("//input[@id='add-to-cart-button-53']");

	public DigitalDownloadsModule(WebDriver driver2) 
	{
		this.driver=driver2;
	}
	public void click_digital_downloads()
      {
		driver.findElement(DD).click();
		
//		Assert.assertTrue(driver.findElement(DD).isEnabled());
//	 
//	 	System.out.println(driver.findElement(DD).isEnabled());
		
       }
	public void click_3rd_album()
	{
		driver.findElement(album).click();
//		
//		Assert.assertTrue(driver.findElement(album).isEnabled());
//		 
//	 	System.out.println(driver.findElement(album).isEnabled());
		
	}
	
	public void add_cart()
	{
		driver.findElement(addcart).click();
		
		Assert.assertTrue(driver.findElement(addcart).isEnabled());
		 
	 	System.out.println(driver.findElement(addcart).isEnabled());
 	}
	
	
	
	
	
	
	
	
	
	
	
}
