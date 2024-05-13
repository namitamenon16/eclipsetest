package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Switchbetweenbrowsers {
	ChromeDriver d;
	@BeforeTest
	public void setUp() {
		
		d= new ChromeDriver();
		
	}
	@Test
	public void test1() {
		d.get("http://demo.guru99.com/popup.php");
		String parentWindow =d.getWindowHandle();
		d.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allWindowHandles=d.getWindowHandles();
		for (String handle :allWindowHandles) {
			if(!handle.equalsIgnoreCase(parentWindow)) {
				d.switchTo().window(handle);
				d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
				d.close();
			}
			d.switchTo().window(parentWindow);
			
		}
		
		
		
		
		
	}


}
