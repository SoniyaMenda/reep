package com.DemoWebShop.qa.testcases;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.DemoWebShop.qa.Constants.Constants;
import com.DemoWebShop.qa.PageObjectModel.JewelryModule;
import com.DemoWebShop.qa.PageObjectModel.LoginPage;
import com.DemoWebShop.qa.PageObjectModel.ShoppingcartPage;
import com.DemoWebShop.qa.Utilities.Highlight;
import com.DemoWebShop.qa.Utilities.Screenshots;
import com.DemoWebShop.qa.Utilities.StaticWaits;
import com.DemoWebShop.qa.Utilities.Xls_Reader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JewelryTestcases {
	WebDriver driver;
	
	StaticWaits st=new StaticWaits();

	Xls_Reader reader= new Xls_Reader();

	@Given("user should Open the browser")
	public void user_should_open_the_browser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
 	    st.staticShortWait();
	}

	@When("launch the url {string}")
	public void launch_the_url(String string) throws Exception
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

	@Then("I click on the jewelry")
	public void i_click_on_the_jewelry() throws Exception 
	{
		JewelryModule j=new JewelryModule(driver);
		Highlight h=new Highlight(driver);
		h.jewelry();
		Screenshots.capture(driver);
		st.staticShortWait();
		
		
        j.click_jewelry();
        Screenshots.capture(driver);
		st.staticShortWait();


	}

	@Then("next click on  Black and white Diamond heart")
	public void next_click_on_black_and_white_diamond_heart() throws Exception
	{

		JewelryModule j=new JewelryModule(driver);
		j.click_item();
	    Screenshots.capture(driver);

		st.staticShortWait();

	}

	@Then("click on ADDcart button")
	public void click_on_ad_dcart_button() throws Exception
	{

		JewelryModule j=new JewelryModule(driver);
		j.click_addcart();
 		  st.staticShortWait();
  
	    ShoppingcartPage sp=new ShoppingcartPage(driver);
		sp.clickshoppingcart();
	    Screenshots.capture(driver);
	    
		driver.quit();

	}
}
