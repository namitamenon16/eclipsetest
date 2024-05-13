package testngpkg;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99doubleclick {
ChromeDriver driver;
	

@BeforeTest
public void setUp() {
	driver=new ChromeDriver();
	driver.get();
}
@Test
public void testrightclick() {
	WebElement rht=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
	WebElement dblcl=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	Actions act=new Actions(driver);
	act.contextClick(rht).perform();
	edit.click();
	driver.switchTo().alert().accept();
	act.doubleClick(dblcl).perform();
	Alert a=driver.switchTo().alert();
	System.out.println("Alert"+a.getText());
	a.accept();
	
	
	
	
}
}
