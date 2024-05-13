package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathamazonsite {
	ChromeDriver driver;
	String baseurl="https://www.amazon.in/";
	
	@Before
	public void SetUp() {
	 driver = new ChromeDriver();
	  driver.get(baseurl);
	
	}
	@Test 
	public void testscript1() {
		WebElement search = driver.findElement(By.name("field-keywords"));
        search.sendKeys("mobiles");
        search.submit();
	}
        		
}

