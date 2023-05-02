package com.DemoWebShop.qa.BaseClass;


 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.DemoWebShop.qa.Constants.Constants;
import com.DemoWebShop.qa.PageObjectModel.LoginPage;
import com.DemoWebShop.qa.Utilities.Xls_Reader;

 

public class TestBase 
{
	 public static WebDriver driver;		
		
		static Xls_Reader reader=new Xls_Reader();
		
		@Test
		@Parameters("browser")
		public static void OpenBrowser() throws Exception 
	    {			
			
            //chrome
		
			System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
// 			ChromeOptions options = new ChromeOptions();
// 			options.addArguments("--remote-allow-origins=*");
// 			driver = new ChromeDriver(options);
//			
			ChromeOptions ops = new ChromeOptions();
                        ops.addArguments("--remote-allow-origins=*");
                        WebDriver driver = new ChromeDriver(ops);
			
			
			
//			//edge
// 			
// 			System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
// 			EdgeOptions options1 = new EdgeOptions();
// 			options1.addArguments("--remote-allow-origins=*");
// 			driver = new EdgeDriver(options1);
		
	
			
		 				
 			//headless browser
	
// 			System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
//			ChromeOptions options1 = new ChromeOptions();
//			options1.addArguments("--remote-allow-origins=*");
//			options1.addArguments("headless");
//			driver = new ChromeDriver(options1); 			
// 			
// 		
	    		
 			

	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();			
  
	    

	    }
		
public static void Loginpage() throws Exception
		{
		
			LoginPage login=new LoginPage(driver); 
			login.login();
			login.email();
			login.password();
			login.loginbutton();
			
			
			
		}
		
		
		
		
 public static void closeBrowser()
 {
		driver.quit();
 }
	
}








