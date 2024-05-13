package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void tester() {
		WebElement drager=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement draggerdestin= driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement draggerele= driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement draggereledestin= driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drager, draggerdestin).perform();
		act.dragAndDrop(draggerele, draggereledestin).perform();
		
		
		
		
		
	}

}
