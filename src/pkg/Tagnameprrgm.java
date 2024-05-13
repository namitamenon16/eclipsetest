package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnameprrgm {

	ChromeDriver driver;
	String baseurl="http://facebook.com";
	
	@Before
	public void Setup() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
		public void testscript() {
			List<WebElement> li =driver.findElements(By.tagName("a"));
			System.out.println("total no of links=" +li.size());
			for(WebElement ele:li) {
				String link=ele.getAttribute("href");
				String linktext=ele.getText();
				System.out.println(link+ "============"+linktext);
			
		}
	}
}

