package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examplesel {
	
		ChromeDriver driver;
		String baseurl="http://www.google.com";
		@Before 
		
		public void setUp() {
			
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		
		@Test
		public void testscript1() {
			WebElement search=driver.findElement(By.name("q"));
			search.sendKeys("Books");
			search.submit();
			//driver.findElement(By.name("btnk")).click();
		}

}
