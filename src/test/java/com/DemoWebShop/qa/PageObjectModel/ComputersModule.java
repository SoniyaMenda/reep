package com.DemoWebShop.qa.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ComputersModule {
	WebDriver driver;
	
	By Computer=By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']");

	By desktop=By.xpath("//ul[@class='top-menu']//a[normalize-space()='Desktops']");
	
    By Positionvalue=By.name("products-orderby");

    By product=	By.xpath("//div[@class='product-item']//img[@title='Show details for Build your own cheap computer']");

	By cart=By.xpath("//input[@id='add-to-cart-button-72']");
	
	By notebook=By.xpath("//ul[@class='top-menu']//a[normalize-space()='Notebooks']");
	
	By laptop=By.xpath("//img[@title='Show details for 14.1-inch Laptop']");
	
    By addcart=	By.xpath("//input[@id='add-to-cart-button-31']");
	
	By accessories=By.xpath("//li[@class='inactive']//a[normalize-space()='Accessories']");
	
	By item=By.xpath("//img[@title='Show details for TCP Instructor Led Training']");
	
	By addtocart=By.xpath("//input[@id='add-to-cart-button-66']");
	
	By shoppingcart=By.xpath("//span[normalize-space()='Shopping cart']");
	
	
	

	public ComputersModule(WebDriver driver)
	{
		this.driver=driver;	
	}

	public void clickcomputers()
	{
		Actions a1 = new Actions(driver);
		WebElement mainMenu = driver.findElement(Computer );
		a1.moveToElement(mainMenu).build().perform();
		
//		driver.findElement(Computer).click();
	
	}
	
	public void desktops()
	{
		driver.findElement(desktop).click();
	}
	
	public void positionvlaues()
	{		
		Select position = new Select(driver.findElement(Positionvalue));
		position.selectByVisibleText("Price: High to Low");
 	}
	public void system()
	{
		driver.findElement(product).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}
	
	
	public void addtocart() {
		driver.findElement(cart).click();
	}
	
	
	public void notebook()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250);");
		
		driver.findElement(notebook).click();
	
	}
	
	public void laptop()
	{
		driver.findElement(laptop).click();
	}

	public void notebookaddtocart()
	{
		driver.findElement(addcart).click();
	}	
	public void accessories()
	{
		driver.findElement(accessories).click();
	}
 
	public void item() {
		driver.findElement(item).click();

	}
	public void accessoriesaddtocart()
	{
		driver.findElement(addtocart).click();
	}

	
	public void Shoppingcart() 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250);");
		
	driver.findElement(shoppingcart).click();	
	}
	
}
