package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlpractice {
	
	ChromeDriver ht;
	String baseurl="file:///C:/Users/HP/.appinventor/Desktop/index.html";
	
	@Before
	public void SetUp() {
		ht=new ChromeDriver();
		ht.get(baseurl);
		
	}
	
	@Test
	public void testhtml() {
		ht.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a =ht.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		ht.findElement(By.xpath("/html/body/input[2]")).sendKeys("ABC");
		ht.findElement(By.xpath("/html/body/input[1]")).sendKeys("ggg");
		
	}

}
