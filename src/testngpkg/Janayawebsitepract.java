package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Janayawebsitepract {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver= new ChromeDriver();
		driver.get("https://janasya.com");
		
	}
	@Test
	public void testJanasya() {
		WebElement newarr =driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a"));
		newarr.click();
		
		boolean logop=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16316676800682__9c03747e-b054-4db8-8194-5a35c71f82ca\"]/div/div/div/div[1]/div/a/img")).isDisplayed();
		if(logop) {
			System.out.println("logo is displayed");
		}
		else {
			System.out.println("logo not displayed");
		}
		
		
	    WebElement collectio= driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3"));
	    collectio.click();
	    WebElement kurta=driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a"));
	    kurta.click();
	    List<WebElement>links=driver.findElements(By.tagName("a"));
	    for (WebElement link:links) {
	    	System.out.println(link.getText());
	    }
	    List<WebElement>menusw= driver.findElements(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul"));
	    for(WebElement nenu:menusw) {
	    	System.out.println(nenu.getText());
	    }
	    WebElement cartadd=driver.findElement(By.xpath("//*[@id=\"44894923489450\"]"));
	    cartadd.click();
	   
	    
	}
	
	

}
