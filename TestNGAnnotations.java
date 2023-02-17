package AutomationTesting.TestNGProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations extends Base
{
@AfterMethod
public void afterMethod()
{
	System.out.println("after method");
}
@BeforeMethod
public void beforeMethod()
{
	System.out.println("before method");
}
@AfterClass
public void afterClass()
{
	System.out.println("after class");
}
@BeforeClass
public void beforeClass()
{
	System.out.println("before class");
}
@AfterTest
public void afterTest()
{
	System.out.println("after method");
}
@BeforeTest
public void beforeTest()
{
	System.out.println("before method");
}
@BeforeSuite
public void testSuitebefore()
{
	System.out.println("before testsuite");
}
@AfterSuite
public void testSuitafter()
{
	System.out.println("after testsuite");
}
@Test
public void test()
{
	System.out.println("test");
}
@Test
public void testcase1()
{
	System.out.println("testcase 1");
}
@Test
public void testcase2()
{
	System.out.println("testcase2");
}
}
