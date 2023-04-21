package com.DemoWebShop.qa.testcases;

 
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.DemoWebShop.qa.BaseClass.TestBase;
import com.DemoWebShop.qa.Constants.Constants;
import com.DemoWebShop.qa.PageObjectModel.GiftCardModule;
import com.DemoWebShop.qa.PageObjectModel.LoginPage;
import com.DemoWebShop.qa.Utilities.Highlight;
import com.DemoWebShop.qa.Utilities.Screenshots;
import com.DemoWebShop.qa.Utilities.StaticWaits;
import com.DemoWebShop.qa.Utilities.Xls_Reader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftCardTestcases extends TestBase {
	
	WebDriver driver;
	StaticWaits st=new StaticWaits(); 
	Xls_Reader reader= new Xls_Reader();

@Given("I open the chrome")
public void i_open_the_chrome() throws Exception
{
	System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	st.staticShortWait();
 
	
	
//	OpenBrowser();

	
}

@When("I open the url {string}")
public void i_open_the_url(String string) throws Exception 
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

@Then("I click on the GiftCards")
public void i_click_on_the_gift_cards() throws Exception
{
	 GiftCardModule gc=new GiftCardModule(driver);
	 Highlight h=new Highlight(driver);
	 h.giftcards();
	 st.staticShortWait();
	 Screenshots.capture(driver);
	 
	 gc.click_giftcards();
	 Screenshots.capture(driver);
	 st.staticShortWait();

}

@Then("I next click on Any one GiftCard")
public void i_next_click_on_any_one_gift_card() throws Exception 
{
	 GiftCardModule gc=new GiftCardModule(driver);
	 gc.click_cards();
	 Screenshots.capture(driver);
	 st.staticShortWait();

}

@When("I enter Recipients Name")
public void i_enter_recipients_name() throws Exception
{
	 GiftCardModule gc=new GiftCardModule(driver);
	 gc.recipientname();
	 Screenshots.capture(driver);
	 st.staticShortWait();
}

@When("I enter Recipient Email")
public void i_enter_recipient_email() throws Exception 
{
	 GiftCardModule gc=new GiftCardModule(driver);
	 gc.recipientemail();
	 Screenshots.capture(driver);
	 st.staticShortWait();
 
}


//@Then("I enter your name")
//public void i_enter_your_name() throws Exception
//{
//	 GiftCardModule gc=new GiftCardModule(driver);
//	 gc.yourname();
//	 Screenshots.capture(driver);
//	 st.staticShortWait();
//}
//
//@Then("I enter your email")
//public void i_enter_your_email() throws Exception
//{
//	GiftCardModule gc=new GiftCardModule(driver);
//	gc.youremail();
//    Screenshots.capture(driver);
//    st.staticShortWait();
//}

@Then("next click ADDcart button")
public void next_click_ad_dcart_button() throws Exception 
{
	GiftCardModule gc=new GiftCardModule(driver);
	gc.Click_cart();
    st.staticShortWait();   
    
//    ShoppingcartPage sp=new ShoppingcartPage(driver);
//  	sp.clickshoppingcart();
//  	Screenshots.capture(driver);
	driver.quit();


}
}
