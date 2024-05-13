package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;

public class Fblogintest {

	WebDriver driver;
     String basurl="https://www.facebook.com/";
     @BeforeTest
    	public void loginsetup() {
    	 driver=new ChromeDriver();
    	 driver.get(basurl);
    	 
    	 
    	 
     }
     @Test
     public void logintest() {
     
     Fbloginpage ob= new Fbloginpage(driver);
     ob.setValues("abc@gmail.com", "abcde");
     ob.loginclick();
     
     driver.navigate().back();
     driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
    String titleverifi= driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[1]/div/div[1]/h1/a/i")).getText();    
     String actual="Facebook";
     if(titleverifi.equalsIgnoreCase(actual)) {
    	 System.out.println("Title verification pass");
     }else {
    	 System.out.println("Title verification fail");
     }
     
     }
	
}
