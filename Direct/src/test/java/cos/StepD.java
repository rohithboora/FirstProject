package cos;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cos.Logs;

public class StepD {
	
	WebDriver driver;
	 int i;
	 int k;
	Home H = new Home();
	
	public String UL = "http://www.tesco.com/direct/";
	
	 public int number()
	 {
		 BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Please Enter Browser Number");
		 
		 try
		 {
			 i = Integer.parseInt(dataIn.readLine());
		 }
		 catch(IOException e)
		 {
			 System.out.println("Error");
		 }
		 return i;
	 }
	 
	 public void Setup()
	 {
		 k = number();
		 if (k == 1)
		 {
			 driver = new FirefoxDriver();
		 }
		 else if (k == 2)
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohith.boora\\Documents\\Selenium Ext\\chromedriver.exe");
			 driver=new ChromeDriver();
		 }
		 else if (k == 3)
		 { 
			 File file = new File("C:\\Users\\rohith.boora\\Documents\\Selenium Ext\\IEDriverServer.exe");
			 System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			 driver=new InternetExplorerDriver();
		 } 
	 }

	@Before 
	public void start()
	{
		Setup();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(UL);
		
	}
	
	@After
	public void stop()
	{
		driver.quit();
		System.out.println("Tesco Direct is Offline");
	}
	
	@Given("^User is on Tesco Direct Home Page$")
	public void user_is_on_Tesco_Direct_Home_Page() throws Throwable {
	   
		
	}

	@When("^User tries to login with Username \"(.*?)\" and Password \"(.*?)\"$")
	public void user_tries_to_login_with_Username_and_Password(String arg1, String arg2) throws Throwable {
		//Try2 T = PageFactory.initElements(driver, Try2.class);
		Logs Login = PageFactory.initElements(driver, Logs.class);

		Home H = PageFactory.initElements(driver, Home.class);
		
		 //H.cookie.click();
		H.Cookieclose.click();
		System.out.println("click sign in link");
		Login.UserName.sendKeys(arg1);
		System.out.println("Type Email - "+ arg1);
		Login.Password.sendKeys(arg2);
		System.out.println("Type Pass - "+ arg2);
		Login.LoginButton.click();
		System.out.println("Select Login Button");
		System.out.println("User Profile Online");
	}

	@Then("^User can see the profile page with sign out option$")
	public void user_can_see_the_profile_page_with_sign_out_option() throws Throwable {
	  
		
	}
	
}
