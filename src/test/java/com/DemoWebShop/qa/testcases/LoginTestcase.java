package com.DemoWebShop.qa.testcases; 

import com.DemoWebShop.qa.BaseClass.TestBase;
import com.DemoWebShop.qa.PageObjectModel.LoginPage;
import com.DemoWebShop.qa.Utilities.Highlight;
import com.DemoWebShop.qa.Utilities.Screenshots;
import com.DemoWebShop.qa.Utilities.StaticWaits;

 import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestcase  extends TestBase{
	
 	
	StaticWaits st=new StaticWaits();
 
	@Given("user should open the browser")
	public void user_should_open_the_browser() throws Exception
	{
		OpenBrowser( );
		System.out.println(driver.getTitle());
	    Screenshots.capture(driver);     
	}


	@Then("user Login to the application")
	public void user_login_to_the_application() throws Exception
	{
		 LoginPage lp= new LoginPage(driver);
		 Highlight h=new Highlight(driver);
	     h.login();
	     Screenshots.capture(driver);
 	     st.staticShortWait();
		 lp.login();
	     Screenshots.capture(driver);
	     st.staticShortWait();

	}
	
	
	@When("enter the valid email")
	public void enter_the_valid_email() throws Exception
	{
		 LoginPage lp= new LoginPage(driver);		 
		 lp.email();		 
		 Screenshots.capture(driver);		 
		 st.staticShortWait();

	}

	@When("enter the valid password") 
	
	public void enter_the_valid_password()throws Exception
	{
		LoginPage lp= new LoginPage(driver);		
		lp.password();		
		Screenshots.capture(driver);		
		st.staticShortWait();
	}
	
	@Then("click on the login button")
	public void click_on_the_login_button() throws Exception 
	{

		 LoginPage lp= new LoginPage(driver);		 
		 Highlight h=new Highlight(driver);
	     h.loginbutton();
		 Screenshots.capture(driver);		 
		 lp.loginbutton( );		 
		 Screenshots.capture(driver);

closeBrowser();
	}

	
	}
 
