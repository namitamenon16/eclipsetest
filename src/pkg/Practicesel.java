package pkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicesel {
 ChromeDriver oh;
 String baseurl="https://www.facebook.com";
 @Before
 public void SetUp() {
	 oh=new ChromeDriver();

	 oh.get(baseurl);
 }
 @Test
 public void tesscript11() {
	 oh.findElement(By.id("email")).sendKeys("namitagmenon@gmail.com");
	  oh.findElement(By.id("pass")).sendKeys("rori@gmail.com");
	 
 }

}
