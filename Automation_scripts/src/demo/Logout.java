package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Logout {
	public static void main(String[] args) {
		
		
        ChromeOptions options = new ChromeOptions(); 
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
  
        
        // Maximize the browser
        
        driver.manage().window().maximize();
  
        driver.get("https://traact-staging.vercel.app/signin");
        


        //assertion check for each fields
        WebElement usernametxt = driver.findElement(By.cssSelector("#email"));
        WebElement passwordtxt = driver.findElement(By.cssSelector("#password"));
       
        Assert.assertTrue(usernametxt.isDisplayed());
       usernametxt.sendKeys("priyanka@traact.com");
       
       Assert.assertTrue(passwordtxt.isDisplayed());
       passwordtxt.sendKeys("Priyayoki02*");
      
        
       
       // String Actualtext = driver.findElement(By.linkText("https://traact-staging.vercel.app/")).getText();

       // Assert.assertEquals(Actualtext, "https://traact-staging.vercel.app/" );

        
        driver.findElement(By.cssSelector("#sign-in-button")).click();
   
        //wait-time 
        //comment ad
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("#__next > div > div > div > div.MuiBox-root.css-0 > div > div.MuiBox-root.css-4g6ai3 > div > img")).click();
        driver.findElement(By.cssSelector("body > div.MuiModal-root.MuiPopover-root.css-jp7szo > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation2.MuiPopover-paper.css-1yno45j > div > p:nth-child(2)")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        //verification
        String actual_url = driver.getCurrentUrl();
		String expected_url = "https://traact-staging.vercel.app/signin";
		Assert.assertEquals(actual_url, expected_url,"_Error Message_");  
}

}
