package FB.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginclass 
{
	
	
	@BeforeClass(alwaysRun=true)
	public void beforeclassmethod()
	{
	System.out.println("This is before Class");
	}
	
	@BeforeMethod(groups="Sanity")
	public void beforemethod()
	{
	System.out.println("This is before method");
	}
	
	@Test(priority=2,groups= {"Sit","Sanity"})
	public void testcase1()
	{
	System.out.println("This is Testcase1");
	int a=10;
	int b=0;
	int c=a/b;
			
	}
	
	@Test(priority=1,groups= {"Sanity","Sit","Regression"},invocationCount=3,invocationTimeOut=60,successPercentage=70,timeOut=60)
	public void testcase3()
	{
	System.out.println("This is Testcase3");
	}
	
	@Test(priority=4,groups={"Sit"},description="USername validation",enabled=true)
	public void testcase4()
	{
	System.out.println("This is Testcase4");
	}
	
	@Test(priority=0,dependsOnMethods="testcase1",alwaysRun=true,groups="Sanity",expectedExceptions=org.testng.TestNGException.class)
	public void testcase2()
	{
	System.out.println("This is Testcase2");
	}
	

	@AfterMethod(alwaysRun=true)
	public void aftermethod()
	{
	System.out.println("This is After method");
	}
	
	@AfterClass
	public void afterclass()
	{
	System.out.println("This is After class");
	}
	
	@AfterTest
	public void afterTest()
	{
	System.out.println("This is After Test");
	}
	
	@AfterSuite
	public void aftersuite()
	{
	System.out.println("This is After Suite");
	}
	
	@BeforeSuite
	public void launch()
	{
		/*System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sathish.kumar15\\\\OneDrive - EY\\\\Desktop\\\\SathishkumarR\\\\Personal\\\\Software\\chromedriver_win32\\\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com");
		dr.manage().window().maximize();*/
		System.out.println("This is before Suite");
	}
	
	@BeforeTest
	public void beforetestmethod()
	{
	System.out.println("This is before test");
	}
}
