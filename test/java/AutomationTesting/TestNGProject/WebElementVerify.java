package AutomationTesting.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementVerify extends Base
{
	 @Test 
	 public void verifySingleInputfield() 
	 {
		 String expectedFieldText="Single Input Field";
		 WebElement inputFieldText=driver.findElement(By.xpath("(//div[@class='card-header'])[2]")); 
		 String actualfieldtext=inputFieldText.getText();
         assertEquals(expectedFieldText,actualfieldtext,"text are not same"); 
     }	 
	@Test
	public void verifyShowMessageButton()
	{
		String expectedText="Show Message";
		WebElement showbuttonText=driver.findElement(By.cssSelector("button[id='button-one']"));
		String actualShowButton=showbuttonText.getText();
		assertEquals(expectedText,actualShowButton,"button text not same");
	}
	@Test
	public void verifyFontcolorshowMessageButton()
	{
		String expectedfontcolorButton="rgba(255, 255, 255, 1)";
		WebElement showButtonMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualbuttonfontcolor=showButtonMessage.getCssValue("color");
		assertEquals(expectedfontcolorButton,actualbuttonfontcolor,"button font are not same");	
	}
	@Test
	public void verifyShapeOfShowMessageButton()
	{
		String expectedbordershapeofshowbutton="4px";
		WebElement showmessageButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		String actualboredrshapeofshowbutton=showmessageButton.getCssValue("border-radius");
		assertEquals(expectedbordershapeofshowbutton,actualboredrshapeofshowbutton,"border shape not same");
	}
	@Test
	public void verifyGetTotalButtonBackgroundColor()
	{
		String expectedtotalbuttonbackcolor="rgba(0, 123, 255, 1)";
		WebElement gettotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		String actualtotalbuttonbackcolor=gettotalButton.getCssValue("background-color");
		assertEquals(expectedtotalbuttonbackcolor,actualtotalbuttonbackcolor,"get total button backgroundcolor are not same");
	}
	@Test
	public void verifyButtonFontSize()
	{
		String expectedfontsizeverify="16px";
		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualbuttonfontverify=showmessage.getCssValue("font-size");
		assertEquals(expectedfontsizeverify,actualbuttonfontverify,"button font size not same");
	}
	
	@Test
	public void inputFieldVerify()
	{
	    int firstValue=55;
	    int secondValue=20;
	    int finalValue=firstValue+secondValue;
	    String expectedshowTotalValue="Total A + B : " +finalValue;
		WebElement firstInputField=driver.findElement(By.xpath("//input[@id='value-a']"));
		boolean firstInputFieldDisplay=firstInputField.isDisplayed();
		assertTrue(firstInputFieldDisplay,"first field are not display");
		firstInputField.sendKeys(Integer.toString(firstValue));
		WebElement secondInputField=driver.findElement(By.xpath("//input[@id='value-b']"));
		boolean secondInputFieldDisplay=secondInputField.isDisplayed();
		assertTrue(secondInputFieldDisplay,"second input field not display");
		secondInputField.sendKeys(Integer.toString(secondValue));
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean enabledButton=getTotalButton.isEnabled();
		getTotalButton.click();
		WebElement TotalmessagePrint=driver.findElement(By.xpath("//div[@id='message-two']"));
		String actualshowtotalvalue=TotalmessagePrint.getText();
		assertEquals(expectedshowTotalValue,actualshowtotalvalue,"total value not same");
	}
	
}
