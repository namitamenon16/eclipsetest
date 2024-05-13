package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathclasspractice {
	ChromeDriver pract;
	String baseurl="https://www.facebook.com";
@Before
public void setUp() {
	pract=new ChromeDriver();
    pract.get(baseurl);
    
    
}
@Test
public void xpathtest1() {
	pract.findElement(By.xpath("//input[@name='email']")).sendKeys("namitagmenon@gmail.com");
}
}
