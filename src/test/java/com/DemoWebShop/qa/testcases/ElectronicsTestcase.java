package com.DemoWebShop.qa.testcases;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.DemoWebShop.qa.Constants.Constants;
import com.DemoWebShop.qa.PageObjectModel.ElectronicsModule;
import com.DemoWebShop.qa.PageObjectModel.LoginPage;
import com.DemoWebShop.qa.PageObjectModel.ShoppingcartPage;
import com.DemoWebShop.qa.Utilities.Highlight;
import com.DemoWebShop.qa.Utilities.Screenshots;
import com.DemoWebShop.qa.Utilities.StaticWaits;
import com.DemoWebShop.qa.Utilities.Xls_Reader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ElectronicsTestcase {

	WebDriver driver;
	
	StaticWaits st=new StaticWaits();
	Xls_Reader reader= new Xls_Reader();

	
	@Given("user open the browser")
	public void user_open_the_browser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
 	    st.staticShortWait();
	}

	@When("user enter url {string}")
	public void user_enter_url(String string) throws Exception
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

	@Then("user Mousehover on the Electronics")
	public void user_mousehover_on_the_electronics() throws Exception
	{
		ElectronicsModule e=new ElectronicsModule(driver);
		Highlight h=new Highlight(driver);
		h.Electronics();	
		st.staticShortWait();	
		
		
		e.electonics();
	    Screenshots.capture(driver);
 		st.staticShortWait();

 	}

	@Then("user click on the Camera and photo")
	public void user_click_on_the_camera_and_photo() throws Exception
	{
		ElectronicsModule e=new ElectronicsModule(driver);		
		e.cameraandphoto(); 
	    Screenshots.capture(driver);
	    st.staticShortWait();
	}

	@Then("user click any one camera")
	public void user_click_any_one_camera() throws Exception 
	{
		ElectronicsModule e=new ElectronicsModule(driver);
		e.camera();    
	    Screenshots.capture(driver);
 		st.staticShortWait();
	}

	@Then("user click on the Addtocart")
	public void user_click_on_the_addtocart() throws InterruptedException, Exception 
	{
		ElectronicsModule e=new ElectronicsModule(driver);
		e.addcart(); 
	    Screenshots.capture(driver);
 		st.staticShortWait();
 		
 		ShoppingcartPage sp=new ShoppingcartPage(driver);
		sp.clickshoppingcart();
	    Screenshots.capture(driver);
		driver.quit();

	}

//	@Then("user click on the cellphones")
//	public void user_click_on_the_cellphones() throws Exception
//	{
//		ElectronicsModule e=new ElectronicsModule(driver);
//		e.cellphones(); 
//	    Screenshots.capture(driver);
//
// 		st.staticShortWait();
//	}
//
//	@When("user click any one cellphone")
//	public void user_click_any_one_cellphone() throws Exception
//	{
//		ElectronicsModule e=new ElectronicsModule(driver);
//		e.mobile();
//	    Screenshots.capture(driver);
// 		st.staticShortWait();
//
//	}
//
//	@Then("user click ADDcart")
//	public void user_click_ad_dcart() throws Exception
//	{
//		ElectronicsModule e=new ElectronicsModule(driver);
//		e.mobileaddcart();  
//	    Screenshots.capture(driver);
//
// 		st.staticShortWait();
//	}
//	
	
}
