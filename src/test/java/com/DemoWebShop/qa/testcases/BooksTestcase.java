package com.DemoWebShop.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.DemoWebShop.qa.BaseClass.TestBase;
 import com.DemoWebShop.qa.PageObjectModel.BooksModule;
import com.DemoWebShop.qa.PageObjectModel.LoginPage;
import com.DemoWebShop.qa.Utilities.Highlight;
//import com.DemoWebShop.qa.Utilities.Highlight;
import com.DemoWebShop.qa.Utilities.Screenshots;
import com.DemoWebShop.qa.Utilities.StaticWaits;
import com.DemoWebShop.qa.Utilities.Xls_Reader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BooksTestcase extends TestBase {

	WebDriver driver;
	StaticWaits st=new StaticWaits();
	
	Xls_Reader reader= new Xls_Reader();
 	
	@Given("I open the browser")
	public void i_open_the_browser() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (4)//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		st.staticShortWait();
		
//		OpenBrowser();
//		System.out.println("browser");
		
		
		
	}

	@When("I enter the url {string}")
	public void i_enter_the_url(String string) throws Exception
	{
		driver.get(reader.getUrl());
		driver.manage().window().maximize();

		Screenshots.capture(driver);
		st.staticShortWait();
		
		
		LoginPage login=new LoginPage(driver); 
		login.login();
		login.email();
		login.password();
		login.loginbutton();
		
		
		
		
	}

	@Then("I click on the Books")
	public void i_click_on_the_books() throws IOException 
	{
		BooksModule b=new BooksModule(driver);
		
		Highlight h=new Highlight(driver);
		h.books();
		Screenshots.capture(driver);

		st.staticShortWait();
		
		b.books();
		Screenshots.capture(driver);
		
		st.staticShortWait();
	}

	@Then("I next click on Any one Book")
	public void i_next_click_on_any_one_book() throws IOException 
	{
		BooksModule b=new BooksModule(driver);
	    b.clickonebook();
	    
	    Screenshots.capture(driver);
		st.staticShortWait();		
	}

	@Then("next click on the ADDcart button")
	public void next_click_on_the_ad_dcart_button() throws IOException 
	{
		BooksModule b=new BooksModule(driver);
		b.addcart();
 		st.staticShortWait();
        b.Shoppingcart();
		Screenshots.capture(driver);
		driver.quit();

	}
	
}