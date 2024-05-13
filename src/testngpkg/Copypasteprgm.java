package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypasteprgm {
 ChromeDriver driver;
 
 
 @BeforeTest
 public void setUp() {
	 driver= new ChromeDriver();
	 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 
 }
 @Test
 public void testcopy() {
	 WebElement fn= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	 WebElement df= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	 fn.sendKeys("Namita");
	 Actions act= new Actions(driver);
	 act.keyDown(fn,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	 act.keyDown(fn,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	 act.keyDown(df,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	 act.perform();
	 
 }
}
