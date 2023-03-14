package demo;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A3_LoginCase 
{
	public static String baseUrl = "https://traact-staging.vercel.app/"; //Variable defined as baseUrl
	public static WebDriver driver = new ChromeDriver(); //To Execute the WebBrowser 
	StringBuffer verificationErrors = new StringBuffer(); //Assertion Controls 
	
		@BeforeTest (alwaysRun= true) //Annotation to set what should run before the Test 
		public void beforeTest() throws InterruptedException
		{
			System.out.println("BeforeSuite Set Browser window to Full Size");
			driver.manage().window().maximize();  // Set Browser window to full screen 
		}
		
			@BeforeClass //Annotation to set what should run before the Class
			public void beforeClass()throws Exception
			{
				System.out.println("Command to Run the Traact URL on WebBrowser");
				
			}
			
				@BeforeMethod
				public void beforeMethod()
				{
					System.out.println("Automation started from here");
					driver.get(baseUrl);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//Wait until page get load
				}
					
					/*
					 * Redirect to Traact SignIn Page
					 */
				
					@Test (priority=1, enabled = true)
					public void TryWithInvalidEmail() throws InterruptedException
					{
						System.out.println("Enter Non existing email for login attempt");
						driver.findElement(By.id("email")).sendKeys("ghostuser@xyz.com");
					    driver.findElement(By.id("password")).sendKeys("Jitendra@123");
					    driver.findElement(By.id("sign-in-button")).click();
					    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//Wait until page get load 
					    String actualResult = driver.findElement(By.xpath("/div/div/div[2]/h6")).getText();
						String expectedResult = "User not found or wrong credentials";
						Assert.assertEquals(actualResult, expectedResult, "_Error Message_");
					}
					
					@Test (priority=2, enabled = true)
					public void TryWithIncorrectPassword() throws InterruptedException
					{
						System.out.println("Clear the existing input data from the field");
						driver.findElement(By.id("email")).clear();
						driver.findElement(By.id("password")).clear();
						
						System.out.println("Enter incorrect password and check");
						driver.findElement(By.id("email")).sendKeys("jitendra.suthar@traact.com");
					    driver.findElement(By.id("password")).sendKeys("1230878994");
					    driver.findElement(By.id("sign-in-button")).click();
					    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//Wait until page get load 
					    String actualResult = driver.findElement(By.xpath("/div/div/div[2]/h6")).getText();
						String expectedResult = "User not found or wrong credentials";
						Assert.assertEquals(actualResult, expectedResult, "_Error Message_");
					}
					
				@AfterMethod
				public void afterMethod()
				{
					System.out.println("Execution of the test cases are done");
				}
				
			@AfterClass(alwaysRun = true)
			public void tearDown() throws Exception 
			{	
				System.out.println("Teardown the Test Execution Process of Class");
			    driver.quit();
			    String verificationErrorString = verificationErrors.toString();
				if (!"".equals(verificationErrorString))
					{
				      fail(verificationErrorString);
				    }
			}
}
