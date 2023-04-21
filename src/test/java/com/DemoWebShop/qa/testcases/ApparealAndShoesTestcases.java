package com.DemoWebShop.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.DemoWebShop.qa.BaseClass.TestBase;
 import com.DemoWebShop.qa.PageObjectModel.ApparelAndShoesModule;
import com.DemoWebShop.qa.PageObjectModel.LoginPage;
import com.DemoWebShop.qa.Utilities.Highlight;
import com.DemoWebShop.qa.Utilities.ScreenRecorderUtil;
import com.DemoWebShop.qa.Utilities.Screenshots;
import com.DemoWebShop.qa.Utilities.StaticWaits;
import com.DemoWebShop.qa.Utilities.Xls_Reader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApparealAndShoesTestcases extends TestBase
{


	WebDriver driver;
	StaticWaits st=new StaticWaits();
	
	Xls_Reader reader=new Xls_Reader();

 	
	@Given("I Open the browser")
	public void i_open_the_browser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (4)//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
 		st.staticShortWait();
//	
//		OpenBrowser();
 
		
	}

	@When("I launch the url {string}")
	public void i_launch_the_url(String string) throws Exception
	{
		ScreenRecorderUtil.startRecord("DEMO WEBSHOP WEBSITE");

		
		driver.get(reader.getUrl());
		driver.manage().window().maximize();
		Screenshots.capture(driver);
		st.staticShortWait();
			
			
			LoginPage login=new LoginPage(driver); 
			login.login();
			login.email();
			login.password();
			login.loginbutton();
			
			
//			Loginpage();			
	}
 

	@Then("I click on the Apparel and shoes")
	public void i_click_on_the_apparel_and_shoes() throws Exception
	{
		
		ApparelAndShoesModule as=new ApparelAndShoesModule(driver);
		Highlight h=new Highlight(driver);
		h.ApparealAndShoes();
		Screenshots.capture(driver);

	    as.click_appareal_and_shoes();
		Screenshots.capture(driver);
		st.staticShortWait();

	}

	@Then("next click on Any one Apparel and shoes")
	public void next_click_on_any_one_apparel_and_shoes() throws Exception
	{
		
		ApparelAndShoesModule as=new ApparelAndShoesModule(driver);
	    as.click_any_one_item();
		Screenshots.capture(driver);
		st.staticShortWait();

	}

	@Then("click on the ADDcart button")
	public void click_on_the_ad_dcart_button() throws Exception 
	{
		
		ApparelAndShoesModule as=new ApparelAndShoesModule(driver);
	    as.add_cart();
 		st.staticShortWait();		
		as.Shoppingcart();
		Screenshots.capture(driver);

		driver.quit();

	}

}
