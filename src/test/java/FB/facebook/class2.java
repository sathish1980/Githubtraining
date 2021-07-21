package FB.facebook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class class2 
{
	@BeforeClass
	public void beforeclassmethod()
	{
	System.out.println("This is before Class in class2");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
	System.out.println("This is before method in class2");
	}
	
	@Test
	public void testcase1()
	{
	System.out.println("This is Testcase1 in class 2");
	}
	
	@AfterClass
	public void afterclass()
	{
	System.out.println("This is After class in class 2");
	}
	
	@AfterMethod
	public void aftermethod()
	{
	System.out.println("This is After method in class 2");
	}
	

	@Test
	public void testcase2()
	{
	System.out.println("This is Testcase2 in class 2");
	}
	

}
