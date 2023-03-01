package AutomationTesting.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementObsqura extends Base
{
	@Test
	public void showMessage()
	{
		String inputMessage="hai";
		String expectedMessage="Your Message : "+inputMessage;
		WebElement showmessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		showmessage.sendKeys(inputMessage);
		WebElement showmessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessageButton.click();
		WebElement yourMessage=driver.findElement(By.cssSelector("div[id=message-one]"));
		String Message=yourMessage.getText();
		assertEquals(expectedMessage,Message,"message not same");
	}
	
	@Test
	public void clearInputMessage()
	{
		String inputMessage="hai";
		WebElement showMessageTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		boolean displayInputMessage=showMessageTextField.isDisplayed();
		assertTrue(displayInputMessage,"single input field is not displayed");
		showMessageTextField.sendKeys(inputMessage);
		showMessageTextField.clear();
		String getButtonTagName=showMessageTextField.getTagName();
		String placeHolder=showMessageTextField.getAttribute("placeholder");
		String className=showMessageTextField.getAttribute("class");
		WebElement showMessageButton=driver.findElement(By.cssSelector("button[id='button-one']"));
		String backgroundcolor=showMessageButton.getCssValue("background-color");
		String bordercolor=showMessageButton.getCssValue("border-color");
	}
	@Test
	public void showMessagebuttonLocationfind()
	{
		WebElement showMessageButton=driver.findElement(By.cssSelector("button[id='button-one']"));
		Point location=showMessageButton.getLocation();
		int showMessageButtonX=location.getX();
		int showMessageButtonY=location.getY();
		Dimension showMessageButtonDimension=showMessageButton.getSize();
		int Width=showMessageButtonDimension.getWidth();
		int Height=showMessageButtonDimension.getHeight();
	}
	
	@Test
	public void verifyGetTotalButtonAlignAndValueBTextBoxAlign()
	{
		WebElement valueBTextbox=driver.findElement(By.xpath("//input[@id='value-b']"));
		Point getLocationValueBTextBox=valueBTextbox.getLocation();
		int getValueBTextBoxX=getLocationValueBTextBox.getX();
		int getValueBTextBoxY=getLocationValueBTextBox.getY();
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		Point getVerifyButtonLocation=getTotalButton.getLocation();
		int getTotalButtonX=getVerifyButtonLocation.getX();
		int getTotalButtonY=getVerifyButtonLocation.getY();
		boolean checkalignmentY=getTotalButtonY>getValueBTextBoxY;
		assertTrue(checkalignmentY,"value b textbox alignment is greater than gettotal button");
		
	}
	
	
	
	
}