package web_project_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




public class WebTesting {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		
		//WebDriver Initialization 
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		
	    
		//First Method
		
		   //URL Check
		
		String ExpectedURL = "https://www.saucedemo.com/";
		String ActualURL=driver.getCurrentUrl();
		System.out.println("ActualURL=  " + ActualURL);
		
		if(ActualURL.equals(ExpectedURL)) {
		System.out.println("URL Match");
		} 
		else {
			System.out.println("URL Doesn't Match");
		}
		
		   // Title Check
		
		
		String ExpectedTitle = "Swag Labs";
		String ActualTitle=driver.getTitle();
		System.out.println("ActualTitle= n" + ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Title Match");
		}
		else {
			System.out.println("Title Doesn't Match");
		}
		
		
		//UserName and Password and Login Automation
		
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	   
	   driver.findElement(By.id("login-button")).click();
		
	   //Add to card(Relative Path)
	   
	   driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
	   driver.findElement(By.xpath("//button[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
	   driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
	   
	  //Click Bucket(Relative Path)
	   
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		
	  //Checkout
		
		driver.findElement(By.id("checkout")).click();
		
		
	 //Address 
		
		driver.findElement(By.id("first-name")).sendKeys("Tamim");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("Rahman");
		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("1207");
	 
	  //Continue
		
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		Thread.sleep(2000);
		
	  //Finish(Absolute Path)
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();
		
		driver.quit();
	}

}
