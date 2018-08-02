package stepdefs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInSteps {

	public static RemoteWebDriver driver;

	@Given("Invoke Leaftap application")
	public static void invokeApp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();

		//open the web site
		driver.get("http://leaftaps.com/opentaps");
	}

	@And("Enter the user name as (.*)")
	public static void enterUserName(String uName)
	{
		//Enter user id
		//uName="DemoSalesManager";
		
		driver.findElementById("username").sendKeys(uName);
		System.out.println(driver.findElementById("username").getText());


	}


	@And("Enter the password (.*)")
	public static void enterPassword(String pwd)
	{
		//pwd="crmsfa";
		//Enter the password
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("click on login button")
	public static void Login()
	{

		//Click the login button
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("Verify the login is success")
	public static void verifyLogin()
	{

	   System.out.println(driver.getTitle()+"is opened successfully");
	   
	}
	
	@But("Verify the login is fail")
	public static void Loginfailure()
	{

	   System.out.println("Login is failed");
	   System.out.println(driver.findElementById("errorDiv").getText());
	   
	}

}
