package AutomationTesting.TestNGProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locaters extends Base
{
	
	 @Test 
	 public void locatingByName()
	 {
		 driver.findElement(By.name("field-keywords"));
		 driver.findElement(By.name("site-search"));
		 driver.findElement(By.name("top"));
		 driver.findElement(By.name("google"));
		 driver.findElement(By.name("google-site-verification"));
	 }
	 @Test 
	 public void locatingByClassName()
	 {
		 driver.findElement(By.className("nav-opt-sprite"));
		 driver.findElement(By.className("nav-search-submit-text" ));
		 driver.findElement(By.className("nav-sprite-v1"));
		 driver.findElement(By.className("a-m-us"));
		 driver.findElement(By.className("nav-sprite"));
			 
	 }

	 @Test
	 public void locatingById()
	 {
		 driver.findElement(By.id("nav-search-bar-form"));
		 driver.findElement(By.id("navbar-main"));
		 driver.findElement(By.id("skiplink")); 
		 driver.findElement(By.id("be"));
		 driver.findElement(By.id("a-page"));
	 }
	 @Test
	 public void locatingByLinkText() 
	 {
		 driver.findElement(By.linkText("Today's Deals"));
		 driver.findElement(By.linkText("Gift Cards"));
		 driver.findElement(By.linkText("Customer Service"));
		 driver.findElement(By.linkText("Registry"));
		 driver.findElement(By.linkText("Sell")); 
	 }
	@Test
	public void locatingPartialByLinkText() 
	{
		driver.findElement(By.partialLinkText("Deals"));
		driver.findElement(By.partialLinkText("Customer"));
		driver.findElement(By.partialLinkText("Gift"));
		driver.findElement(By.partialLinkText("Shop"));
	}
	 @Test 
	 public void locatingByTagName() 
	 {
		 driver.findElement(By.tagName("a"));
		 driver.findElement(By.tagName("div"));
		 driver.findElement(By.tagName("script"));
		 driver.findElement(By.tagName("input"));
		 driver.findElement(By.tagName("head"));
	}
	 //CSS Selector
	 @Test
	 public void locatingByTagAndId()
	 {
		 //syntax:-tag name#id value
		 
		 driver.findElement(By.cssSelector("input#unifiedLocation1ClickAddress"));
		 driver.findElement(By.cssSelector("a#nav-logo-sprites"));
		 driver.findElement(By.cssSelector("header#navbar-main"));
		 driver.findElement(By.cssSelector("a#skiplink"));
		 driver.findElement(By.cssSelector("input#issprefix"));
		 driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		 driver.findElement(By.cssSelector("span#logo-ext"));
	 }
	 @Test
	 public void locatingByTagAndClass()
	 {
		 //syntax:- tag name.class name
		 
		 driver.findElement(By.cssSelector("div.a-section"));//class
		 driver.findElement(By.cssSelector("span.nav-logo-locale"));
		 driver.findElement(By.cssSelector("a.skip-link"));
		 driver.findElement(By.cssSelector("div.navFooterColHead"));
		 driver.findElement(By.cssSelector("span.nav-line-2"));
		 driver.findElement(By.cssSelector("div.copilot-secure-display"));
		 driver.findElement(By.cssSelector("div.nav-sprite"));
		 driver.findElement(By.cssSelector("div.layoutToolbarPadding"));
		 driver.findElement(By.cssSelector("span.hm-icon-label"));
		 driver.findElement(By.cssSelector("input.nav-progressive-attribute"));
		 
		 //syntax:-tag name[id=value]
		 
		 driver.findElement(By.cssSelector("a[id=skiplink]"));//id
		 driver.findElement(By.cssSelector("a[id=nav-hamburger-menu]"));
		 driver.findElement(By.cssSelector("div[id=nav-main]"));
		 driver.findElement(By.cssSelector("div[id=a-page]"));
		 driver.findElement(By.cssSelector("div[id=pageContent]"));
		 driver.findElement(By.cssSelector("a[id=navBackToTop]"));
		 driver.findElement(By.cssSelector("div[id=navbar]"));
		 driver.findElement(By.cssSelector("span[id=glow-ingress-line2]"));
		 driver.findElement(By.cssSelector("input[id=ubbShipTo]"));
		 driver.findElement(By.cssSelector("form[id=nav-search-bar-form]"));
	 }
	 @Test
	 public void locatingByTagClassAttribute() 
	 {
		 driver.findElement(By.cssSelector("input.nav-progressive-attribute[id=ubbShipTo]"));
		 driver.findElement(By.cssSelector("input.nav-progressive-attribute[id=unifiedLocation1ClickAddress]"));
		 driver.findElement(By.cssSelector("input.nav-progressive-attribute[id=glowValidationToken]"));
		 driver.findElement(By.cssSelector("div.nav-progressive-content[id=nav-xshop]"));
		 driver.findElement(By.cssSelector("div.nav-swm-text-widget[id=nav-swmslot]"));
		 driver.findElement(By.cssSelector("div.celwidget[id=desktop-banner]"));
		 driver.findElement(By.cssSelector("div.copilot-secure-display[id=rhf]"));
		 driver.findElement(By.cssSelector("div.nav-progressive-attribute[id=nav-cart-text-container]"));
	 }
	 @Test
	 public void locatingByXPath()
	 {
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 driver.findElement(By.xpath("//div[@id='a-page']"));
		 driver.findElement(By.xpath("//a[@id='navBackToTop']"));
		 driver.findElement(By.xpath("//div[@id='rhf']"));
		 driver.findElement(By.xpath("//div[@id='navbar']"));
		 driver.findElement(By.xpath("//div[@id='pageContent']"));
		 driver.findElement(By.xpath("//div[@id='gw-layout']"));
		 
	 }
	 @Test
	 public void locatingByXPathText()
	 {
		 driver.findElement(By.xpath("//div[text()='EN']"));
		 driver.findElement(By.xpath("//span[text()='All']"));
		 driver.findElement(By.xpath("//a[text()='Shop deals in Electronics']"));
		 driver.findElement(By.xpath("//h2[text()='Gaming accessories']"));
		 driver.findElement(By.xpath("//span[text()='International top sellers']"));
		 driver.findElement(By.xpath("//h2[text()='Shop Laptops & Tablets']"));
	 }
	
}
