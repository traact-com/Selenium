package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PrivacyPolicy {
public static void main(String[] args) {
		
		
        WebDriver driver = new ChromeDriver();
        
        
        driver.manage().window().maximize();
		  
        driver.get("https://traact-staging.vercel.app/signin");
        
        //clicking on terms and conditions
        
         driver.findElement(By.cssSelector("#__next > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-sm-6.css-1pyleg0 > div > div.signin__Terms-sc-1nz85nb-6.jnQcly.MuiBox-root.css-y1gt6f > a:nth-child(2)")).click();
  
         //Verify Page
         
         String actual_url = driver.getCurrentUrl();
			String expected_url = "https://www.traact.com/privacy";
			Assert.assertEquals(actual_url, expected_url,"_Error Message_");            
	
         //driver.quit();
         
       
       
        
}
}


