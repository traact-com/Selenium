package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {
public static void main(String[] args) {
		
		
        WebDriver driver = new ChromeDriver();
        
        
        driver.manage().window().maximize();
		  
        driver.get("https://traact-staging.vercel.app/signin");
        
         driver.findElement(By.cssSelector("#__next > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-sm-6.css-1pyleg0 > div > p > a")).click();
  
         
         // to verify the imput fields
         
         WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
         firstName.sendKeys("TX"); 
        
         WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
         lastName.sendKeys("YZ"); 
        
        
        
        
        
}
}
