package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenBrowser {
	public static String baseUrl = "https://traact-staging.vercel.app/";
	ChromeDriver driver = new ChromeDriver();
	  //WebDriver driver; 
	 //driver = new ChromeDriver();
	/* Methods in chronological order */
	@BeforeTest (alwaysRun= true)
	public void beforeTest() throws InterruptedException
	{
	System.out.println("BeforeSuite Set Browser window to Full Size");
	// Set Browser window to full screen
	//driver.manage().window().maximize();
	System.out.println("BeforeTes System will take 5 Sec delay to load the resourses");
	Thread.sleep(5000);
	}
	@BeforeClass
	public void beforeClass()throws Exception
	{
	System.out.println("Go to the SignIn Page");
	driver.get(baseUrl);
	}
	@BeforeMethod
	public void beforeMethod()
	{
	System.out.println("Automation Testing started from here");
	}
	
	
	 @Test
	public void Traact() throws InterruptedException
	{
	Thread.sleep(5000);
	
	}
	}
