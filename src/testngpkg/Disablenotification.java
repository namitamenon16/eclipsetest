package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Disablenotification {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable--notifications");
		
		
		driver=new ChromeDriver(options);
		
	}
	@Test
	public void test() {
		driver.get("https://www.justdail.com");
	}
}
