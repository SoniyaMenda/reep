package com.DemoWebShop.qa.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 
public class ApparelAndShoesModule
{
	WebDriver driver;
	
	By click=By.xpath("//ul[@class='top-menu']//a[normalize-space()='Apparel & Shoes']");
	By item=By.xpath("//img[@title=\"Show details for 50's Rockabilly Polka Dot Top JR Plus Size\"]");
	By addcart=By.xpath("//input[@id='add-to-cart-button-5']");
	By shoppingcart=By.xpath("//span[normalize-space()='Shopping cart']");
	
	
	
public ApparelAndShoesModule(WebDriver driver2)
{
        this.driver=driver2;
}


public void click_appareal_and_shoes()
{
	driver.findElement(click).click();	
	
//	Assert.assertTrue(driver.findElement(click).isEnabled());
//
// 	System.out.println(driver.findElement(click).isEnabled());
	

}

	public void click_any_one_item()
	{
		WebElement apparel=driver.findElement(item);
		apparel.click(); 
//		
//		Assert.assertEquals(driver.findElement(item),apparel);
		
//		Assert.assertTrue(driver.findElement(item).isDisplayed());
//
//	 	System.out.println(driver.findElement(item).isEnabled());
	}
	
	public void add_cart()
	{
		driver.findElement(addcart).click();			
		
//		Assert.assertTrue(driver.findElement(addcart).isEnabled());
//
//	 	System.out.println(driver.findElement(addcart).isEnabled());
		
	}
	
	public void Shoppingcart()
	{
		driver.findElement(shoppingcart).click();
	}
	
	
	
}
