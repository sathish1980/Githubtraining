package Commonmethods;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class Browser 
{
	
	public static ExtentReports er;
	public static ExtentTest et;
	public Logger lg= Logger.getLogger(Browser.class);
	public static WebDriver dr;
	String chromediverpath="C:\\Users\\sathish.kumar15\\OneDrive - EY\\Desktop\\SathishkumarR\\Personal\\EY\\chromedriver_win32\\chromedriver.exe";
	public void launchbrowser(String browservalue)
	{
		if(browservalue.equalsIgnoreCase("chrome"))
		{
		lg.info("********* Execution begin**********");
		System.setProperty("webdriver.chrome.driver",chromediverpath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--disable-notifications");
		lg.info("********* Notification disabled**********");
		dr=new ChromeDriver(options);
		dr.manage().window().maximize();
		lg.info("********* Maximized**********");
		lg.warn("********* This is warning**********");
		
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sathish.kumar15\\OneDrive - EY\\Desktop\\SathishkumarR\\Personal\\Software\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			dr=new FirefoxDriver();
			lg.info("*********Firefox browser enabld**********");
			dr.manage().window().maximize();
		}
		
		lg.info("********* Extent reports enabled**********");
			er = new ExtentReports(System.getProperty("user.dir")
				+"\\extentreport\\ExtentReportResults.html",true);
		et = er.startTest("Sanity testing started");
		lg.info("********* Extent report begin**********");
		lg.warn("********* extenr report warning**********");
	}

}
