package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class ForgotPassword {
public static void main(String[] args) {
		
	ChromeOptions options = new ChromeOptions(); 
    options.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(options);

        
        
        driver.manage().window().maximize();
		  
        driver.get("https://traact-staging.vercel.app/signin");
        
        //clicking on terms and conditions
        
         driver.findElement(By.cssSelector("#__next > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-sm-6.css-1pyleg0 > div > div.MuiGrid-root.MuiGrid-container.css-ruh28a > div > form > div.MuiGrid-root.MuiGrid-container.css-1d3bbye > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-6.css-zapnwe > a")).click();
	        WebElement emailtxt = driver.findElement(By.cssSelector("/html/body/div/div/div/div/div[5]/div/input"));
	       
	        Assert.assertTrue(emailtxt.isDisplayed());
	        emailtxt.sendKeys("priyanka@traact.com");
	        
	       driver.findElement(By.xpath("/button[@id=':r4:']")).click();
	      
         //Verify Page
         
         String actual_url = driver.getCurrentUrl();
			String expected_url = "https://traact-staging.vercel.app/forgot";
			Assert.assertEquals(actual_url, expected_url,"_Error Message_");            
	
			
}
}
