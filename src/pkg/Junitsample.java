package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitsample {
	ChromeDriver driver;
	String baseurl="http://www.google.com";
	@Before 
	
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void testscript1() {
		String exp="Google";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exp)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	@Test
	public void testscript2() {
	  String src=driver.getPageSource();
	  if(src.contains("Gmail")) {
		  System.out.println("Text present");
	
	  }else
	  {
		  System.out.println("Test not present");
	  }
	}
	@After
	public void result() {
		driver.quit();
	}

}
