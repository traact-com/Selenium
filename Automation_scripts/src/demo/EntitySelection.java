package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EntitySelection {
	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions(); 
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
  
        
        
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
	   
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.findElement(By.cssSelector("#__next > div > main > div.MuiBox-root.css-vwfq95 > div.MuiBox-root.css-14oqdsi > div > div.MuiBox-root.css-12vmat7")).click();
       
     //*[@id=":r32:"]
       WebElement searchbar = driver.findElement(By.id(":r39:"));
       Assert.assertTrue(searchbar.isDisplayed());
       searchbar.sendKeys("century labs ui");
       driver.findElement(By.cssSelector("body > div.MuiModal-root.MuiDialog-root.css-1mipqhv > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div.MuiDialogContent-root.css-1gxl0ec > nav > div:nth-child(2) > p")).click();
       driver.findElement(By.cssSelector("#\\:r31\\:")).click();
       }
	}

  
        
