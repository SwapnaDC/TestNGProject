package AutomationTesting.TestNGProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ListFindElement extends Base 
{
	@Test
	public void findList()
	{
		List<WebElement> FindListCategory=driver.findElements(By.xpath("//li[@class='list-group-item']"));
	}
	@Test
	public void findListElementCount()
	{
		List<WebElement> CountElements=driver.findElements(By.xpath("//li[@class='list-group-item']"));
		int listsize=CountElements.size();
		
	}

}
