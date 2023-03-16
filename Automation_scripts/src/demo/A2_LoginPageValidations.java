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
import org.testng.asserts.SoftAssert;

public class A2_LoginPageValidations 
{
	public static String baseUrl = "https://traact-staging.vercel.app/"; //Variable defined as baseUrl
	public static WebDriver driver = new ChromeDriver(); //To Execute the WebBrowser 
	StringBuffer verificationErrors = new StringBuffer(); //Assertion Controls 
	SoftAssert softAssert = new SoftAssert();
	
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
				}
					
					/*
					 * Required fields and validation error message assertions to be added here
					 */
					@Test (priority=1, enabled = true)
					public void WithoutEmail() throws InterruptedException
					{
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//Wait until page get load
						driver.findElement(By.id("sign-in-button")).click();
						String actualError = driver.findElement(By.id("email-helper-text")).getText();
						String expectedError = "Email is a required field";
						Assert.assertEquals(actualError, expectedError, "_Error Message_");	
						softAssert.assertAll();
					}
					
					@Test (priority=2, enabled = true)
					public void WithoutPassword() throws InterruptedException
					{
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//Wait until page get load
						driver.findElement(By.id("sign-in-button")).click();
						String actualError = driver.findElement(By.id("password-helper-text")).getText();
						String expectedError = "Password is a required field";
						Assert.assertEquals(actualError, expectedError, "_Error Message_");	
						softAssert.assertAll();
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

