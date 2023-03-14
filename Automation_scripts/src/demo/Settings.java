package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Settings {
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
      
        
       
       
        driver.findElement(By.cssSelector("#sign-in-button")).click();
   
        //wait-time 
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       //getting in to settings page
       driver.findElement(By.cssSelector("#__next > div > main > div.MuiBox-root.css-vwfq95 > div.MuiBox-root.css-d09v58 > button:nth-child(3) > svg")).click();
       //verifying page
       
       String actual_url = driver.getCurrentUrl();
		String expected_url = "https://traact-staging.vercel.app/settings";
		Assert.assertEquals(actual_url, expected_url,"_Error Message_");  
       
	
       
}
}
