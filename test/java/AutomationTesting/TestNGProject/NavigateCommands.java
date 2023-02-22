package AutomationTesting.TestNGProject;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateCommands extends Base
{
	//code for test
	
	  
	  public void navigateToCommand()
	  { 
		  String currentUrl=driver.getCurrentUrl();
		  driver.navigate().to("https://www.flipkart.com/");
		  driver.navigate().back();
		  String expectedUrl="https://www.amazon.com/";
		  assertEquals(expectedUrl,currentUrl,"expected url cannot navigate to current url"); 
	  }
	  
	  public void navigateBackCommand()
	  {
		  String currentUrl=driver.getCurrentUrl();
		  driver.navigate().to("https://www.flipkart.com/");
		  driver.navigate().back();
		  String expectedUrl="https://www.amazon.com/";
		  assertEquals(expectedUrl,currentUrl,"flipkart cannot back to amazon "); 
	  }
	  
	  public void navigateForwardCommand()
	  { 
		  String currentUrl=driver.getCurrentUrl();
		  driver.navigate().to("https://www.flipkart.com/");
		  driver.navigate().back();
		  String expectedUrl="https://www.amazon.com/";
		  driver.navigate().forward();
		  assertEquals(expectedUrl,currentUrl,"amazone cannot forward to flipkart "); 
	  }
	 
	  public void navigateRefreshCommand()
	  {
		  String currentUrl=driver.getCurrentUrl();
		  driver.navigate().to("https://www.flipkart.com/");
		  driver.navigate().back();
		  driver.navigate().forward();
		  String expectedUrl="https://www.amazon.com/";
		  driver.navigate().refresh();
		  assertEquals(expectedUrl,currentUrl,"cannot refresh this page");
	  }
		 
	
}