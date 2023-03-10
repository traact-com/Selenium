package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	public static void main(String[] args) {
		
		
		        WebDriver driver = new ChromeDriver();
		  
		        // Maximize the browser
		        driver.manage().window().maximize();
		  
		        driver.get("https://traact-staging.vercel.app/signin");
		        
		        
		        //assertion check for each fields
		        WebElement usernametxt = driver.findElement(By.cssSelector("#email"));
		        WebElement passwordtxt = driver.findElement(By.cssSelector("#password"));
               
		        Assert.assertTrue(usernametxt.isDisplayed());
               usernametxt.sendKeys("priyanka@traact.com");
               
               Assert.assertTrue(passwordtxt.isDisplayed());
               passwordtxt.sendKeys("Priyayoki02&");
              
		        
		       
		       // String Actualtext = driver.findElement(By.linkText("https://traact-staging.vercel.app/")).getText();

		       // Assert.assertEquals(Actualtext, "https://traact-staging.vercel.app/" );

		        
		        driver.findElement(By.cssSelector("#sign-in-button")).click();
		   
		        //wait-time 
		        //comment addee
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	}

}