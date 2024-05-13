package testngpkg;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginvalidationofTorrid {
	ChromeDriver driver;
	 
	 
	 @BeforeTest
	 public void setUp() {
		 driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 
}
	 @Test
	 public void tes1() {
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("namitagmenon@gmail.com");;
	      
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("Manualtestong@123");
	       
	       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	      
	         
	        String link=driver.getCurrentUrl();
	        System.out.println(link);
	        String expectlink="https://www.facebook.com/";
	        if(link.equals(expectlink)){
	        	System.out.println("login succecful");
	        }
	        	else {
	        		System.out.println("login unsuccesful");
	        	}
	        }
	        
	        
	        
		 
	 }

