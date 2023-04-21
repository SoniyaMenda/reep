package com.DemoWebShop.qa.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.support.ui.Select;

 import com.DemoWebShop.qa.Utilities.Xls_Reader;

public class ShoppingcartPage {

	WebDriver driver;
	
	Xls_Reader reader=new Xls_Reader();
	
	
	By shoppingcart=By.xpath("//span[normalize-space()='Shopping cart']");

	
	By terms=By.xpath("//input[@id='termsofservice']");
	
    By company=By.xpath("//input[@id=\"BillingNewAddress_Company\"]");
	
	By country=By.xpath("//select[@id='CountryId']");
    
 	
	By city=By.xpath("//input[@id='BillingNewAddress_City']");
	
	By checkout=By.xpath("//button[@id='checkout']");	
	
	By Address=By.xpath("//input[@id='BillingNewAddress_Address1']");
	
	By postalcode=By.xpath("//input[@id='ZipPostalCode']");
	
	By phonenumber=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
	
	By save=By.xpath("//input[@onclick='Billing.save()']");

	
	public ShoppingcartPage(WebDriver driver)
	{
        this.driver=driver;	
    }
	
	public void clickshoppingcart()
	{

		driver.findElement(shoppingcart).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
	}
	public void  termservices()
	{
		driver.findElement(terms).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}
	
	public void checkout()
	{
		driver.findElement(checkout).click();
	}
	
	public void selectcountry() 
	{
		Select drpCountry = new Select(driver.findElement(country));
		drpCountry.selectByIndex(41);		
	}
	public void city() throws Exception
	{
		 driver.findElement(city).sendKeys(reader.getcity());
		
	}
	public void adderess() throws Exception
	{
		 driver.findElement(Address).sendKeys(reader.getaddress());
		
	}
	public void postalcode() throws Exception 
	{
		driver.findElement(postalcode).sendKeys(reader.getpostalsode());
		
	}
	public void phonenumber() throws Exception 
	{
		driver.findElement(phonenumber).sendKeys(reader.getphonenumber());
		
	}
	public void continuebutton() 
	{
		driver.findElement(save).click(); 
		
	}
		
	
}
