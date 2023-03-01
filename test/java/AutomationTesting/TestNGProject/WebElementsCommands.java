package AutomationTesting.TestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementsCommands extends Base 
{
	@Test
	public void sendKeys()
	{
		WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("iPhone");
	}
}
