package com.DemoWebShop.qa.PageObjectModel;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
 
public class BooksModule {
	
	WebDriver driver;	
	
	By books=By.xpath("//ul[@class='top-menu']//a[normalize-space()='Books']");
	
	By selectbook=By.xpath("//img[@title='Show details for Computing and Internet']");
	
	By addcart= By.xpath("//input[@id='add-to-cart-button-13']");	
	
	By shoppingcart=By.xpath("//span[normalize-space()='Shopping cart']");	
	
	public BooksModule(WebDriver driver2) 
	{
		this.driver=driver2;
	 }

	public void books()
	{
		driver.findElement(books).click();		
//		
//		Assert.assertTrue(driver.findElement(books).isEnabled());
//
//	 	System.out.println(driver.findElement(books).isEnabled());
		
 	}
	
	public void clickonebook()
	{
		driver.findElement(selectbook).click();
		
//		Assert.assertTrue(driver.findElement(selectbook).isEnabled());
//
//	 	System.out.println(driver.findElement(selectbook).isEnabled());
		
	}
	public void addcart()
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
