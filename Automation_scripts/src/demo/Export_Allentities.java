package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Export_Allentities {
	public class Settings {
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
		       //getting in to entities tab
		       driver.findElement(By.cssSelector("#__next > div > div > div > div.MuiBox-root.css-b95f0i > ul > a:nth-child(6) > p")).click();
		       
		       //export on all entities
		        WebElement exporttxt = driver.findElement(By.cssSelector("#__next > div > main > div.MuiContainer-root.css-15kl6mt > div > div.MuiBox-root.css-1qptmau > div > div > div.MuiBox-root.css-rqh4k3 > div > button.MuiButtonBase-root.MuiButton-root.MuiButton-outlined.MuiButton-outlinedPrimary.MuiButton-sizeMedium.MuiButton-outlinedSizeMedium.MuiButton-root.MuiButton-outlined.MuiButton-outlinedPrimary.MuiButton-sizeMedium.MuiButton-outlinedSizeMedium.css-1u7koxr"));
		        Assert.assertTrue(exporttxt.isDisplayed());
		        exporttxt.sendKeys("priyanka@traact.com");
			       
		        //driver.findElement(By.cssSelector("#__next > div > main > div.MuiContainer-root.css-15kl6mt > div > div.MuiBox-root.css-1qptmau > div > div > div.MuiBox-root.css-rqh4k3 > div > button.MuiButtonBase-root.MuiButton-root.MuiButton-outlined.MuiButton-outlinedPrimary.MuiButton-sizeMedium.MuiButton-outlinedSizeMedium.MuiButton-root.MuiButton-outlined.MuiButton-outlinedPrimary.MuiButton-sizeMedium.MuiButton-outlinedSizeMedium.css-1u7koxr")).click();
		        driver.findElement(By.cssSelector("#\\:r2l\\:")).click();

			       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			        driver.findElement(By.cssSelector("body > div.MuiDialog-root.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div > div.MuiBox-root.css-1pduebn > p > a")).click();
}
		
		
}}