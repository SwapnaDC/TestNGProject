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
		 driver.findElement(By.cssSelector("a[role=button]"));
		 driver.findElement(By.cssSelector("div[class=nav-sprite]"));
		 driver.findElement(By.cssSelector("script[type=a-state]"));
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
		 driver.findElement(By.cssSelector("input.nav-progressive-attribute[name=dropdown-selection-ubb]"));
		 driver.findElement(By.cssSelector("input.nav-progressive-attribute[id=unifiedLocation1ClickAddress]"));
		 driver.findElement(By.cssSelector("input.nav-progressive-attribute[id=glowValidationToken]"));
		 driver.findElement(By.cssSelector("div.nav-progressive-content[id=nav-xshop]"));
		 driver.findElement(By.cssSelector("input.nav-progressive-attribute[value=add-new]"));
		 driver.findElement(By.cssSelector("div.celwidget[id=desktop-banner]"));
		 driver.findElement(By.cssSelector("div.copilot-secure-display[id=rhf]"));
		 driver.findElement(By.cssSelector("input.nav-progressive-attribute[type=hidden]"));
	 }
	 @Test
	 public void locatingByXPathId()
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
	 public void locatingByXpathName()
	 {
		 //driver.findElement(By.xpath("form[name='site-search']"))
		 driver.findElement(By.xpath("//form[@name='site-search']"));
		 driver.findElement(By.xpath("//meta[@name='description']"));
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
	 @Test
	 public void locatingAbsoluteXpath()
	 {
		 driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[1]/a"));
		 driver.findElement(By.xpath("/html/body/header/div[2]/div/div/nav/div/ul/li[6]/a"));
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button"));
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[3]"));
	 }
	 @Test
	 public void locatingRelativeXpath()
	 {
		 driver.findElement(By.xpath("//img[@src='images/logo.png']"));
		 driver.findElement(By.xpath("//label[text()='Enter Message']"));
		 driver.findElement(By.xpath("//div[@id='message-one']"));
	 }
	 @Test
	 public void locatingrelativeXpathamazon()
	 {
		 driver.findElement(By.xpath("//div[text()='EN']"));
		 driver.findElement(By.xpath("//span[text()='All']"));
		 driver.findElement(By.xpath("//a[text()='Shop deals in Electronics']"));
		 driver.findElement(By.xpath("//span[@id='glow-ingress-line2']"));
	 }
	 @Test
	 public void locatingByXpathContains()
	 {
		 driver.findElement(By.xpath("//*[contains(@href,'simple-form')]"));
		 driver.findElement(By.xpath("//label[contains(text(),'Enter Message')]"));
		 driver.findElement(By.xpath("//label[contains(text(),'Enter value A')]"));
		 driver.findElement(By.xpath("//button[contains(@id,'one')]"));
		 driver.findElement(By.xpath("//*[contains(@id,'button-two')]"));
		 driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		 driver.findElement(By.xpath("//*[contains(@href,'radio-button')]"));
		 driver.findElement(By.xpath("//*[contains(@class,'page')]"));
		 driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		 
	 }
	 @Test
	 public void locatingORXpath()
	 {
		driver.findElement(By.xpath("//a[@href='check-box-demo.php' or @text='Radio Buttons Demo']"));
		driver.findElement(By.xpath("//a[@href='jquery-progress-bar.php' or text()=' Alerts and Modals' ]"));
		driver.findElement(By.xpath("//button[@id='button-two' or @text()='Show Message']"));
		driver.findElement(By.xpath("//button[@class='btn btn-primary' or @id='button-all']"));
		driver.findElement(By.xpath("//input[@id='single-input-field' or @placeholder='Enter Value']")); 
	 }
	 @Test
	 public void locatingANDXpath()
	 {
		 driver.findElement(By.xpath("//input[@class='form-control' and @id='single-input-field']"));
		 driver.findElement(By.xpath("//a[@class='nav-link' and @id='progress-bars']"));
		 driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-primary']"));
		 driver.findElement(By.xpath("//a[@href='jquery-progress-bar.php' and @id='progress-bars']"));
		 driver.findElement(By.xpath("//a[@class='nav-link' and @href='bootstrap-alert.php']"));
	 }
	 @Test
	 public void locatingstartsWithXpath()
	 {
		 driver.findElement(By.xpath("//a[starts-with(text(),'Checkbox')]"));
		 driver.findElement(By.xpath("//a[starts-with(@href,'select-input.php')]"));
		 driver.findElement(By.xpath("//div[starts-with(@class,'copyright')]"));
		 driver.findElement(By.xpath("//img[starts-with(@src,'images/logo.png')]"));
		 driver.findElement(By.xpath("//a[starts-with(@id,'others')]"));
		 
	 }
	 @Test
	 public void loactingParentXpath()
	 {
		 driver.findElement(By.xpath("//label[@for='inputEmail4']//parent::div[@class='form-group']"));
		 driver.findElement(By.xpath("//a[@href='simple-form-demo.php']//parent::li[@class='nav-item']"));
		 driver.findElement(By.xpath("//img[@alt='logo']//parent::a[@href='index.php']"));
		 driver.findElement(By.xpath("//a[text()='Checkbox Demo']//parent::li"));
		 driver.findElement(By.xpath("//div[@class='copyright']//parent::footer[@class='mt-5']"));
	 }
	 @Test
	 public void loactingchildXpath()
	 {
		 driver.findElement(By.xpath("//div[@class='card']//child::div[contains(text(),'Menu')]"));
		 driver.findElement(By.xpath("//div[@class='form-group']//child::label[@for='inputEmail4']"));
		 driver.findElement(By.xpath("//div[@class='card']//child::div[contains(text(),'Two Input Fields')]"));
		 driver.findElement(By.xpath("//div[@class='form-group']//child::label"));
		 driver.findElement(By.xpath("//li[@class='list-group-item']//child::a[@href='select-input.php']"));
	 }
	 @Test
	 public void locatingfollowingXpath()
	 {
		 driver.findElement(By.xpath("//div[@class='card']//following::div[contains(text(),'Menu')]"));
		 driver.findElement(By.xpath("//footer[@class='mt-5']//following::div[@class='copyright']"));
		 driver.findElement(By.xpath("//section[@class='clearfix']//following::div[@class='col-lg-9 col-md-9 col-sm-12 col-xs-12']"));
		 driver.findElement(By.xpath("//div[@class='card-body']//following::form"));
		 driver.findElement(By.xpath("//div[@class='container page']//following::a[text()='Checkbox Demo']"));
		 
	 }
	 @Test
	 public void locatingancestorXpath()
	 {
		 driver.findElement(By.xpath("//div[@class='card-header']//ancestor::section"));
		 driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ancestor::nav[@class='navbar navbar-expand-md navbar-dark']"));
		 driver.findElement(By.xpath("//button[@class='navbar-toggler']//ancestor::nav"));
		 driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']//ancestor::button[@type='button']"));
		 driver.findElement(By.xpath("//div[@class='example my-3']//ancestor::div[@class='container page']"));
	 }
	 @Test
	 public void locatingprecedingXpath()
	 {
		 driver.findElement(By.xpath("//div[@class='card-header']//preceding::div[@id='collapsibleNavbar']"));
		 driver.findElement(By.xpath("//div[@class='card-header']//preceding::div"));
		 driver.findElement(By.xpath("//section[@class='clearfix']//preceding::a[@id='others']"));
		 driver.findElement(By.xpath("//button[@class='navbar-toggler']//preceding::img[@src='images/logo.png']"));
		 driver.findElement(By.xpath("//meta[@name='author']//preceding::title[text()='Obsqura Testing']"));
		 
	 }
	 @Test
	 public void locatingfollowingsiblingXpath()
	 {
		 
		driver.findElement(By.xpath("//input[@id='invalidCheck']/following-sibling::label")); 
		 driver.findElement(By.xpath("//input[@class='check-box-list']/following-sibling::label"));
		 driver.findElement(By.xpath("//input[@id='invalidCheck']//following-sibling::label"));
		 driver.findElement(By.xpath("//input[@class='check-box-list']//following-sibling::label[contains(text(),'Check Box One')]"));
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']//following-sibling::button"));
		 
	 }
	 @Test
	 public void locatingdescendantXpath()
	 {
		 driver.findElement(By.xpath("//div[@class='container']//descendant::nav[@class='navbar navbar-expand-md navbar-dark']"));
		 driver.findElement(By.xpath("//a[@href='index.php']//descendant::img[@src='images/logo.png']"));
		 driver.findElement(By.xpath("//div[@class='top-logo']//descendant::a[@href='index.php']"));
		 driver.findElement(By.xpath("//footer[@class='mt-5']//descendant::div[@class='container']"));
		 driver.findElement(By.xpath("//div[@class='example my-3']//descendant::form[@method='POST']"));
		
		 
	 }
	 @Test
	 public void locatingselfXpath()
	 {
		 driver.findElement(By.xpath("//a[@href='bootstrap-dual-list.php']//self::a"));
		 driver.findElement(By.xpath("//section[@class='clearfix']//self::section"));
		 driver.findElement(By.xpath("//button[@id='button-one']//self::button"));
		 driver.findElement(By.xpath("//input[@id='single-input-field']//self::input"));
		 driver.findElement(By.xpath("//div[@class='container']//self::div"));
		 
	 }
}
