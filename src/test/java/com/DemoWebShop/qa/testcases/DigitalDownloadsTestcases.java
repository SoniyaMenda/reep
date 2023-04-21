package com.DemoWebShop.qa.testcases;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.DemoWebShop.qa.BaseClass.TestBase;
 import com.DemoWebShop.qa.PageObjectModel.DigitalDownloadsModule;
import com.DemoWebShop.qa.PageObjectModel.LoginPage;
import com.DemoWebShop.qa.PageObjectModel.ShoppingcartPage;
import com.DemoWebShop.qa.Utilities.Highlight;
import com.DemoWebShop.qa.Utilities.Screenshots;
import com.DemoWebShop.qa.Utilities.StaticWaits;
import com.DemoWebShop.qa.Utilities.Xls_Reader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DigitalDownloadsTestcases extends TestBase {
	
	WebDriver driver;
	
	StaticWaits st=new StaticWaits();
	Xls_Reader reader= new Xls_Reader();

	
	
	@Given("The user Open the browser")
	public void the_user_open_the_browser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (4)//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		st.staticShortWait();	
		
		
//		OpenBrowser();
//		System.out.println("chrome");
	}

	@When("user launch the url {string}")
	public void user_launch_the_url(String string) throws Exception 
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

	@Then("user click on the Digital Downloads")
	public void user_click_on_the_digital_downloads() throws Exception
	{	
		DigitalDownloadsModule dd=new DigitalDownloadsModule(driver);
		Highlight h=new Highlight(driver);
		h.digitaldownloads();
	    Screenshots.capture(driver);

		dd.click_digital_downloads();
	    Screenshots.capture(driver);

		st.staticShortWait();
	}

	@Then("next click 3rd Alubm")
	public void next_click_3rd_alubm() throws Exception
	{
		DigitalDownloadsModule dd=new DigitalDownloadsModule(driver);
		Highlight h=new Highlight(driver);
		h.digitaldownloads();	
		st.staticShortWait();
		
		dd.click_3rd_album();
	    Screenshots.capture(driver);

		st.staticShortWait();
	}

	@Then("click on Addcart button")
	public void click_on_addcart_button() throws Exception 
	{
		DigitalDownloadsModule dd=new DigitalDownloadsModule(driver);
		dd.add_cart();
 		st.staticShortWait();
		
		ShoppingcartPage sp=new ShoppingcartPage(driver);
		sp.clickshoppingcart();
	    Screenshots.capture(driver);

		driver.quit();

		
	}

}
