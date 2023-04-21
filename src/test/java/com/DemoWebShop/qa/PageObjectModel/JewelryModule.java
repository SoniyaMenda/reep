package com.DemoWebShop.qa.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JewelryModule
{
WebDriver driver;

By jewelry=By.xpath("//ul[@class='top-menu']//li[6]");

By item=By.xpath("//div[@class='product-item']//img[@title='Show details for Black & White Diamond Heart']");

By cart=By.xpath("//input[@id='add-to-cart-button-14']");

	public JewelryModule(WebDriver driver2) 
	{
        this.driver=driver2; 
	}
	public void click_jewelry()
	{
		driver.findElement(jewelry).click();
 		
	}
	
	public void click_item()
	{
		driver.findElement(item).click();
 	}
	
	public void click_addcart()
	{
		driver.findElement(cart).click();
 	}
	
	
	
	
	
	
	
	
}
