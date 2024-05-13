package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Aamazonswitchbrowswer {
	ChromeDriver d;
	@BeforeTest
	public void setUp() {
		
		d= new ChromeDriver();
		d.get("https://www.amazon.in/");
		
		
	}
	@Test
	public void test1() {
	d.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
	
}
	public void test2() {
		String actual= d.getTitle();
		String expect ="Amazon.in : mobile phones";
		if(actual.equalsIgnoreCase(expect)) {
			System.out.println("Title pass");
		}
		else {
			System.out.println("Title fail");
		}
		
	}
	public void test3() {
		String parent = d.getWindowHandle();
		d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
	}
}

