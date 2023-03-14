package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class NotificationIcon {
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
       passwordtxt.sendKeys("Priyayoki02&");
      
        
       
       
        driver.findElement(By.cssSelector("#sign-in-button")).click();
   
        //wait-time 
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       driver.findElement(By.cssSelector("#__next > div > main > div.MuiBox-root.css-vwfq95 > div.MuiBox-root.css-d09v58 > button:nth-child(2) > span.BaseBadge-root.MuiBadge-root.css-1rzb3uu > svg")).click();
              
	
		//verifying page
       String title = "NOTIFICATIONS";
    				        
    				        String actualTitle = driver.getTitle();
    				 
    				        System.out.println("Verifying the page title has started");
    				        Assert.assertEquals(actualTitle,title,"Page title doesnt match");
    				 
    				        System.out.println("The page title has been successfully verified");
    				 
       
	}

}

