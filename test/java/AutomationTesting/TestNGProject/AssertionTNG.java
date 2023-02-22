package AutomationTesting.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class AssertionTNG extends Base
{
	
	  @Test 
	  public void assertEqualcommands()
	  {
		  String expectedUrl="https://www.amazon.in/";
		  driver.navigate().to("https://www.myntra.com/");
		  driver.navigate().back();
		  String actualUrl=driver.getCurrentUrl();
		  assertEquals(actualUrl,expectedUrl,"url note same"); 
	  }
	  @Test
	  public void assertNotEqualCommand() 
	  {
		  driver.navigate().to("https://www.flipkart.com/");
		  String actualTitle=driver.getTitle();
		  String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		  assertNotEquals(actualTitle,expectedTitle,"titles are mismatch");
	  }
	  @Test 
	  public void assertTrueCommand() 
	  {
		  driver.navigate().to("https://www.flipkart.com/");
		  driver.navigate().back();
		  driver.navigate().to("https://www.amazon.com/");
		  boolean verifyTitle=driver.getTitle().contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		  assertTrue(verifyTitle);
	  }
	  @Test 
	  public void assertFalseCommand()
	  {
		  driver.navigate().to("https://www.flipkart.com/");
		  driver.navigate().back();
		  boolean verifyTitle=driver.getTitle().contains("Means Sports Apparel - Buy Mens Sports Apparel online in India myntra.com"); 
		  assertFalse(verifyTitle); 
	  }
	  @Test
	  public void assertNullCommand()
	  {
		  String varifyNull=null;
		  driver.navigate().to("https://www.flipkart.com/");
		  assertNull(varifyNull);
	  }
	  @Test
	  public void verifyNotNullCommand()
	  {
		  driver.navigate().to("https://www.flipkart.com/");
		  driver.navigate().back();
		  boolean verifyNotNull=driver.getPageSource().contains("Search Amazon.com");
		  assertNotNull(verifyNotNull);
	  }
}
