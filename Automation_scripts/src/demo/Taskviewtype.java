package demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Taskviewtype {
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
       passwordtxt.sendKeys("Priyayoki02*");
       
       driver.findElement(By.cssSelector("#sign-in-button")).click();
	   
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // to get in to card view
       
       driver.findElement(By.cssSelector("#__next > div > main > div.MuiBox-root.css-vwfq95 > div.MuiBox-root.css-14oqdsi > div > div.MuiBox-root.css-10kje1b > div:nth-child(2)")).click();
     // to verify page
       String actual_url = driver.getCurrentUrl();
		String expected_url = "https://traact-staging.vercel.app/task/card";
		Assert.assertEquals(actual_url, expected_url,"_Error Message_");
       
// to get in to project view

driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[1]/div/div[2]/div[3]")).click();

}
}

