package Testcase;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Commonmethods.Browser;
import Commonmethods.reusable;
import Pages.facebooklogin;
import Pages.facebooklogout;
import Util.excelreadandwrite;
import Commonmethods.*;



public class loginandlogout extends Browser
{

	//lg.info("log");
	reusable cs= new reusable();
	excelreadandwrite ew= new excelreadandwrite();

	@BeforeSuite
	public void launch()
	{
		launchbrowser("chrome");
	}
	
	@BeforeTest
	public void urllaunch()
	{
		dr.get("https://www.facebook.com");
	}
	
	@Test(priority=0,dataProvider="excel",dataProviderClass=dataproviderclass.class)
	public void loginandlogout(String username,String password)
	{
		try
		{
		facebooklogin fb= new facebooklogin(dr);
		fb.username(username);
		fb.password(password);
		fb.loginbutton();
		facebooklogout fl = new facebooklogout(dr);
		fl.logoutdropdown();
		String reportpath =cs.capture(dr);
		fl.signout();
		//et.log(LogStatus.PASS,"This is a sucess message");
		et.log(LogStatus.PASS,et.addScreenCapture(reportpath));
		}
		catch(Exception e)
		{
			et.log(LogStatus.FAIL,e);
		}
	/*dr.findElement(By.id("email")).sendKeys(username);
	dr.findElement(By.id("pass")).sendKeys(password);
	dr.findElement(By.name("login")).click();
	cs.elementclickable(dr,By.xpath("//div[@aria-label='Account']"));
	dr.findElement(By.xpath("//div[@aria-label='Account']")).click();
	cs.elementclickable(dr,By.xpath("//span[text()='Log Out']//ancestor::div[2]"));
	dr.findElement(By.xpath("//span[text()='Log Out']//ancestor::div[2]")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	}
	
	@AfterSuite
	public void teardown()
	{
		dr.quit();
		er.endTest(et);
		er.flush();
	}
}
