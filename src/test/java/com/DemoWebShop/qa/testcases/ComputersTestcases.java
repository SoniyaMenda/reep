package com.DemoWebShop.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
 

import com.DemoWebShop.qa.BaseClass.TestBase;
import com.DemoWebShop.qa.Constants.Constants;
import com.DemoWebShop.qa.PageObjectModel.ComputersModule;
import com.DemoWebShop.qa.PageObjectModel.LoginPage;
import com.DemoWebShop.qa.Utilities.Highlight;
import com.DemoWebShop.qa.Utilities.Screenshots;
import com.DemoWebShop.qa.Utilities.StaticWaits;
import com.DemoWebShop.qa.Utilities.Xls_Reader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputersTestcases extends TestBase  {
	
WebDriver driver;

StaticWaits st=new StaticWaits();

Xls_Reader reader= new Xls_Reader();

@Given("user open the browser and enter url\"<url>\"")
public void user_open_the_browser_and_enter_url_url() throws Exception

{
	System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	
	
//	System.setProperty("webdriver.edge.driver", "C:\\Users\\smenda1\\Downloads\\edgedriver_win32\\msedgedriver.exe");
//	EdgeOptions options1 = new EdgeOptions();
//	options1.addArguments("--remote-allow-origins=*");
//	driver = new EdgeDriver(options1);
	

	
 	st.staticShortWait();
	driver.get(reader.getUrl());
	driver.manage().window().maximize();
	Screenshots.capture(driver);
	st.staticShortWait();
	
//	OpenBrowser();
	
	LoginPage login=new LoginPage(driver); 
	
	login.login();
 
	login.email();
 
	login.password();
 
	login.loginbutton();
	
	
	
}

@Then("user Mousehover on the computers")
public void user_mousehover_on_the_computers() throws Exception 
{
	ComputersModule cm= new ComputersModule(driver);
	
	Highlight h=new Highlight(driver);
	h.computers();	
	st.staticShortWait();
	cm.clickcomputers();
	Screenshots.capture(driver);
	st.staticShortWait();

}

@When("user click on the Desktops")
public void user_click_on_the_desktops() throws Exception
{

	ComputersModule cm= new ComputersModule(driver);
    cm.desktops();
    Screenshots.capture(driver);
    st.staticShortWait();

}

@When("user click on Any one Desktop")
public void user_click_on_any_one_desktop() throws InterruptedException, Exception
{
	ComputersModule cm= new ComputersModule(driver);
	cm.positionvlaues();
	Screenshots.capture(driver);
	st.staticShortWait();
	cm.system();
	Screenshots.capture(driver);

}

@Then("next user click  ADDcart button")
public void next_user_click_ad_dcart_button() throws Exception 
{
	st.staticShortWait();
	ComputersModule cm= new ComputersModule(driver);
	cm.addtocart();
 	st.staticShortWait();
 	cm.Shoppingcart();
	Screenshots.capture(driver);
	driver.quit();

}


















//
//@Then("user click on the Notebook")
//public void user_click_on_the_notebook() throws Exception
//{
//	
//	ComputersModule cm= new ComputersModule(driver);
//  cm.notebook();    
//  Screenshots.capture(driver);
//	st.staticShortWait();
//
//}
//
//@When("user click any one Notebook")
//public void user_click_any_one_notebook() throws Exception
//{
//	ComputersModule cm= new ComputersModule(driver);
//	cm.laptop();
//	Screenshots.capture(driver);
//	st.staticShortWait();
//
//}
//
//@Then("user click to the ADD cart button")
//public void user_click_to_the_add_cart_button() throws Exception
//{
//	ComputersModule cm= new ComputersModule(driver);
//	cm.notebookaddtocart();
//	Screenshots.capture(driver);
//	st.staticShortWait();
//
//}
//
//@Then("user click on the Accessories")
//public void user_click_on_the_accessories() throws Exception
//{
//	ComputersModule cm= new ComputersModule(driver);
//    cm.accessories();
//    Screenshots.capture(driver);
//	st.staticShortWait();
//
//}
//
//@When("user click any one Accessories")
//public void user_click_any_one_accessories() throws Exception
//{
//	ComputersModule cm= new ComputersModule(driver);
//    cm.item();
//    Screenshots.capture(driver);
//	st.staticShortWait();
//
//}
//
//@Then("user click on ADDcart button")
//public void user_click_on_ad_dcart_button() throws Exception 
//{
//	ComputersModule cm= new ComputersModule(driver);
//    cm.accessoriesaddtocart();
//    Screenshots.capture(driver);
//	st.staticShortWait();
//
//}

//@Then("next user click on the Shoppingcart")
//public void next_user_click_on_the_shoppingcart() throws Exception
//{
//	ComputersModule cm= new ComputersModule(driver);
//    cm.Shoppingcart();
//    Screenshots.capture(driver);
//	st.staticShortWait();
//
//}


}

