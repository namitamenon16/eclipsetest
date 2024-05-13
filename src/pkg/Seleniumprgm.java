package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumprgm {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	String actualtitle=driver.getTitle();
	String expexected="Google";
	if(actualtitle.equals(expexected)) {
		System.out.println("Title comparison pass");
	}else {
		System.out.println("Title comparison fail");
	}

	}

}
