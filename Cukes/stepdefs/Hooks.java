package stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {
	
	@Before(order=1)
	public void beforeScenario(Scenario sc)
	{
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		System.out.println("status in before method="+sc.getStatus());
		System.out.println("is failed in before method"+sc.isFailed());
		System.out.println("Before method is called in hooks");
	}
	
	@Before(order=0)
	public void beforeScenarioStart()
	{
		
		System.out.println("-------------Start of Scenario----------------");
	}

	@After(order=1)
	public void AfterScenario(Scenario sc)
	{
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());
		System.out.println("After method is called in hooks");
	}
	
	@After(order=0)
	public void AfterScenarioFinish()
	{
		System.out.println("-------------End of Scenario----------------");
	}
	
}
