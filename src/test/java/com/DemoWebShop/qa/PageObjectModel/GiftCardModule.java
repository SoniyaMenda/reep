package com.DemoWebShop.qa.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 import com.DemoWebShop.qa.Utilities.Xls_Reader;

public class GiftCardModule
{
WebDriver driver;

Xls_Reader reader=new Xls_Reader();

By giftcards=By.xpath("//ul[@class='top-menu']//li[7]");

By cards=By.xpath("//div[@class='product-item']//img[@title='Show details for $5 Virtual Gift Card']");

By cart=By.xpath("//input[@id='add-to-cart-button-1']");

By recipientname=By.xpath("//input[@id='giftcard_1_RecipientName']");
 
By recipientmail=By.xpath("//input[@id='giftcard_1_RecipientEmail']");

By sendername=By.xpath("//input[@id='giftcard_1_SenderName']");

By sendermail=By.xpath("//input[@id='giftcard_1_SenderEmail']");

	public GiftCardModule(WebDriver driver2) {
        this.driver=driver2;
	}

	public void click_giftcards()
	{
		driver.findElement(giftcards).click();
 	}
	
	public void click_cards()
	{
		driver.findElement(cards).click(); 
	}
	
	public void recipientname() throws Exception
	{
		driver.findElement(recipientname).sendKeys(reader.getrecipientname());
	}
	
	public void recipientemail() throws Exception
	{
		driver.findElement(recipientmail).sendKeys(reader.getrecipientemail());
	}
	
	public void yourname() throws Exception 
	{
		driver.findElement(sendername).sendKeys(reader.getname());
	}
	public void youremail() throws Exception
	{
		driver.findElement(sendermail).sendKeys(reader.getEmail());
	}
	
	public void Click_cart()
	{
		driver.findElement(cart).click(); 
	}
	
}
