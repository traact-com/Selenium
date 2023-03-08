package demo;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redirection {
	public static String baseUrl = "https://traact-staging.vercel.app/";
	public static WebDriver driver = new ChromeDriver();
	StringBuffer verificationErrors = new StringBuffer();
	
	/* Methods in chronological order */
	
		@BeforeTest (alwaysRun= true)
		public void beforeTest() throws InterruptedException
		{
			System.out.println("BeforeSuite Set Browser window to Full Size");
			// Set Browser window to full screen 
			driver.manage().window().maximize(); 
			System.out.println("BeforeTest System will wait to load the resourses");	
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
					System.out.println("Automation Testing for Side menu Redirection Check Started");
				}
					/*
					 * Redirect to Traact SignIn Page and SignIn
					 */
					@Test (priority=2)
					public void SigninToApp() throws InterruptedException
					{
						System.out.println("Insert data to get into the app");
						driver.findElement(By.cssSelector("#email")).sendKeys("jitendra.suthar@traact.com");
					    driver.findElement(By.cssSelector("#password")).sendKeys("Jitendra@1234");
					    //driver.findElement(By.cssSelector("email")).click();
					    driver.findElement(By.cssSelector("#sign-in-button")).click();
					    Thread.sleep(5000); //Until the user get into the app
					    String actual_url = driver.getCurrentUrl();
						String expected_url = "https://traact-staging.vercel.app/";
						Assert.assertEquals(actual_url, expected_url,"_Error Message_");
						}
					
						/*
						 * Redirect to Dashboard
						 */						
						@Test (priority=3, enabled = true, dependsOnMethods = {"SigninToApp"} )
						public void DashboardRedirection() throws InterruptedException
						{
						    Thread.sleep(2000); //Until Page Load
						    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/ul/a[1]/p")).click();
						    String actual_url = driver.getCurrentUrl();
							String expected_url = "https://traact-staging.vercel.app/";
							Assert.assertEquals(actual_url, expected_url,"_Error Message_");
						}
						
						/*
						 * Redirect to Task Page
						 */
						@Test (priority=4, enabled = true)
						public void Tasks() throws InterruptedException
						{
							Thread.sleep(2000); //Until Page Load
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/ul/a[2]/p")).click();
						    String actual_url = driver.getCurrentUrl();
							String expected_url = "https://traact-staging.vercel.app/task/list";
							Assert.assertEquals(actual_url, expected_url,"_Error Message_");
						}
						
						@Test (priority=5, enabled = true)
						public void Analytics() throws InterruptedException
						{
							Thread.sleep(2000); //Until Page Load
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/ul/a[3]/p")).click();
						    String actual_url = driver.getCurrentUrl();
							String expected_url = "https://traact-staging.vercel.app/analytics";
							Assert.assertEquals(actual_url, expected_url,"_Error Message_");
						}
						
						@Test (priority=6, enabled = true)
						public void Entities() throws InterruptedException
						{
							Thread.sleep(2000); //Until Page Load
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/ul/a[4]/p")).click();
						    String actual_url = driver.getCurrentUrl();
							String expected_url = "https://traact-staging.vercel.app/entities";
							Assert.assertEquals(actual_url, expected_url,"_Error Message_");
						}
						
						@Test (priority=7, enabled = true)
						public void Boards() throws InterruptedException
						{
							Thread.sleep(2000); //Until Page Load
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/ul/a[5]/p")).click();
						    String actual_url = driver.getCurrentUrl();
							String expected_url = "https://traact-staging.vercel.app/boards";
							Assert.assertEquals(actual_url, expected_url,"_Error Message_");
						}
						
						@Test (priority=8, enabled = true)
						public void Contracts() throws InterruptedException
						{
							Thread.sleep(2000); //Until Page Load
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/ul/a[6]/p")).click();
						    String actual_url = driver.getCurrentUrl();
							String expected_url = "https://traact-staging.vercel.app/contracts";
							Assert.assertEquals(actual_url, expected_url,"_Error Message_");
						}
						
						@Test (priority=9, enabled = true)
						public void Disputes() throws InterruptedException
						{
							Thread.sleep(2000); //Until Page Load
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/ul/a[7]/p")).click();
						    String actual_url = driver.getCurrentUrl();
							String expected_url = "https://traact-staging.vercel.app/disputes";
							Assert.assertEquals(actual_url, expected_url,"_Error Message_");
						}
						
						@Test (priority=9, enabled = true)
						public void License() throws InterruptedException
						{
							Thread.sleep(2000); //Until Page Load
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/ul/a[8]/p")).click();
							String actual_url = driver.getCurrentUrl();
							String expected_url = "https://traact-staging.vercel.app/licenses";
							Assert.assertEquals(actual_url, expected_url,"_Error Message_");    
						}
						
						@Test (priority=10, enabled = true)
						public void FPNA() throws InterruptedException
						{
							Thread.sleep(2000); //Until Page Load
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/ul/a[9]/p")).click();
							String actual_url = driver.getCurrentUrl();
							String expected_url = "https://traact-staging.vercel.app/fpa";
							Assert.assertEquals(actual_url, expected_url,"_Error Message_");    
						}
						
						@Test (priority=11, enabled = true)
						public void Dataroom() throws InterruptedException
						{Thread.sleep(2000); //Until Page Load
						driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/ul/a[10]/p")).click();
						String actual_url = driver.getCurrentUrl();
						String expected_url = "https://traact-staging.vercel.app/documents";
						Assert.assertEquals(actual_url, expected_url,"_Error Message_");    
						}
						
						@Test (priority=12, enabled = true)
						public void Contacts() throws InterruptedException
						{
							Thread.sleep(2000); //Until Page Load
							driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/ul/a[11]/p")).click();
							String actual_url = driver.getCurrentUrl();
							String expected_url = "https://traact-staging.vercel.app/contacts";
							Assert.assertEquals(actual_url, expected_url,"_Error Message_");            
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

	