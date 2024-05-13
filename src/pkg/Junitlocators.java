package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitlocators {
 ChromeDriver driver;
 String baseurl="http://facebook.com";
  @Before
 public void setUp() {
	  driver=new ChromeDriver();
	  driver.get(baseurl);
	  
  }
  @Test
  public void Testfb() {
	  driver.findElement(By.id("email")).sendKeys("namitagmenon@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("rori@gmail.com");
	  driver.findElement(By.name("login")).click();
	  
	  
  }
}
 

