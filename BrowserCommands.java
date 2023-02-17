package AutomationTesting.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class BrowserCommands extends Base
{
	@Test
	public void verifyTitle()
	{
		String expectedTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";		
		String actualTitle=driver.getTitle();
		assertEquals(expectedTitle,actualTitle,"titles are not equal");
	}
	@Test
	public void verifyUrl()
	{
		String expectedUrl ="https://www.flipkart.com/";
		String actualUrl=driver.getCurrentUrl();
		assertEquals(expectedUrl,actualUrl,"url are not same");
	}
	@Test
	public void verifyPageSource()
	{
		String expectedPageSource="Search Amazon.in";
		String actualPageSource=driver.getPageSource();
		assertTrue(actualPageSource.contains(expectedPageSource),"page source are not same");
	}

}
