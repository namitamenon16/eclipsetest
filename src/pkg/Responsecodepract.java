package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodepract {
  ChromeDriver driver;
  String baseurl="https://facebook.com";
  
  @Before
  public void SetUp() {
	  driver=new ChromeDriver();
	  driver.get(baseurl);
	  
  }
  @Test
  public void testscript() {
	 List<WebElement> wv= driver.findElements(By.tagName("a"));
	 System.out.println("links"+wv.size());
	
  }
}
