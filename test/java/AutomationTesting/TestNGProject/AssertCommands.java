package AutomationTesting.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertCommands extends Base
{
	@Test 
	public void softAssertcommand() 
	{ 
		String expectedUrl=driver.getCurrentUrl();
		String actualUrl="https://www.amazon.com/";
		SoftAssert softassert=new SoftAssert();
		String verifyNullValue=null;
		String verifynotNullValue="guru99";
		String actPageSource="browserstack";
		String actualPageSource="Myntra";
		softassert.assertEquals(expectedUrl,actualUrl,"url not same");
		driver.navigate().to("https://www.myntra.com/");
		String currentUrl=driver.getCurrentUrl();
		softassert.assertNotEquals(expectedUrl,currentUrl,"url are same");
		softassert.assertNull(verifyNullValue);
		softassert.assertNotNull(verifynotNullValue);
		String ExpectedPageSource=driver.getPageSource();
		softassert.assertTrue(ExpectedPageSource.contains(actualPageSource));
		softassert.assertFalse(ExpectedPageSource.contains(actPageSource));
		softassert.assertAll();
		
		
	}
	@Test
	public void hardAssertCommands()
	{
		driver.navigate().to("https://www.flipkart.com/");
		String expectedUrl="https://www.flipkart.com/";
		String actualUrl=driver.getCurrentUrl();
		String verifyNull=null;
		String verifyNotNull="amazon";
		String expectedPageSource=driver.getPageSource();
		String actualPageSource="flipkart";
		String PageSource="Myntra";
		assertEquals(expectedUrl,actualUrl,"url are not same");
		driver.navigate().back();
		String expectedGetUrl=driver.getCurrentUrl();
		String actualGetUrl="Myntra";
		assertNotEquals(expectedGetUrl,actualGetUrl,"pagesourecare are same");
		assertNull(verifyNull);
		assertNotNull(verifyNotNull);
		assertTrue(expectedPageSource.contains(actualPageSource));
		assertFalse(expectedPageSource.contains(PageSource));
		
	}

}
