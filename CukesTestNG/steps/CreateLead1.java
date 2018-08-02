package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead1 {

	public static RemoteWebDriver driver;

	@Given("Navigate to create lead Page")
	public static void navCreatelead()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();

		//open the web site
		driver.get("http://leaftaps.com/opentaps");
		String uName="DemoSalesManager";
		driver.findElementById("username").sendKeys(uName);
		String pwd="crmsfa";
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
	}
	
	@And("Enter the Company Name (.*)")
	public static void entercname(String cny)
	{
		String cnyvalue=cny;
		WebElement cname = driver.findElementByXPath("(//input[@name='companyName'])[2]");
		cname.sendKeys(cnyvalue);
		
	}
	
	@And("Enter the First Name (.*)")
	public static void enterfname(String frstnme)
	{
		String frstnmevalue=frstnme;
		WebElement fname = driver.findElementByXPath("(//input[@name='firstName'])[3]");
		fname.sendKeys(frstnmevalue);
		
	}
	
	@And("Enter the Last Name (.*)")
	public static void enterlname(String lstname)
	{
		String lstnamevalue=lstname;
		WebElement lname = driver.findElementByXPath("(//input[@name='lastName'])[3]");
		lname.sendKeys(lstnamevalue);
		
	}
	
	@When("click on create lead")
	public static void createlead()
	{
		WebElement clead = driver.findElementByName("submitButton");
		clead.click();
		
	}
	
	@Then("Verify the create lead is success")
	public static void verifylead()
	{
		WebElement leadname = driver.findElementById("viewLead_firstName_sp");
		System.out.println(leadname.getText()+" is created successfully");
		
	}

}
