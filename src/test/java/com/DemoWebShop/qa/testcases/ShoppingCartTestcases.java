package com.DemoWebShop.qa.testcases; 
 
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.DemoWebShop.qa.BaseClass.TestBase;
import com.DemoWebShop.qa.Constants.Constants;
import com.DemoWebShop.qa.PageObjectModel.LoginPage;
import com.DemoWebShop.qa.PageObjectModel.ShoppingcartPage;
import com.DemoWebShop.qa.Utilities.Highlight;
import com.DemoWebShop.qa.Utilities.ScreenRecorderUtil;
import com.DemoWebShop.qa.Utilities.Screenshots;
import com.DemoWebShop.qa.Utilities.StaticWaits;
import com.DemoWebShop.qa.Utilities.Xls_Reader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartTestcases extends TestBase{
	
	WebDriver driver;
	
	StaticWaits st=new StaticWaits();

	Xls_Reader reader= new Xls_Reader();
	
	@Given("open the chrome browser")
	public void open_the_chrome_browser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		st.staticShortWait();
		driver.get(reader.getUrl());
		driver.manage().window().maximize();
		Screenshots.capture(driver);
		st.staticShortWait();
		
		
//		OpenBrowser();
		
		LoginPage login=new LoginPage(driver); 
		login.login();
		login.email();
		login.password();
		login.loginbutton();
		
		st.staticShortWait();

	}

	 

	@Then("click on the shoppingcart")
	public void click_on_the_shoppingcart() throws Exception
	{
		ShoppingcartPage shop=new ShoppingcartPage(driver);		
	    shop.clickshoppingcart();
	    Screenshots.capture(driver);
		st.staticShortWait();

	}
	
	@Then("click on the term of services")
	public void click_on_the_term_of_services() throws Exception
	{
		 ShoppingcartPage sp=new ShoppingcartPage(driver);
		 sp.termservices();
		 Screenshots.capture(driver);
		 st.staticShortWait();

	}

	@When("click on the checkout button")
	public void click_on_the_checkout_button() throws Exception
	{
		ShoppingcartPage sp=new ShoppingcartPage(driver);
		
		Highlight h=new Highlight(driver);
		h.checkout();
		Screenshots.capture(driver);
		st.staticShortWait();

		sp.checkout();
		Screenshots.capture(driver);
		st.staticShortWait();

	}	

	
	
	@Then("select country")
	public void select_country() throws Exception
	{
		ShoppingcartPage sp=new ShoppingcartPage(driver);
		sp.selectcountry();
	    Screenshots.capture(driver);
		st.staticShortWait();

	}



	@When("enter the postalcode")
	public void enter_the_postalcode() throws Exception 
	{
		ShoppingcartPage sp=new ShoppingcartPage(driver);
		sp.postalcode();
	    Screenshots.capture(driver);
	    
	    
		ScreenRecorderUtil.stopRecord();

		driver.quit();

	}


}
	
	
	
	
