package testngpkg;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenpackage {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		
	}
	@Test
	public void teste() throws Exception{
		FileInputStream p= new FileInputStream("\"C:\\Users\\HP\\Downloads\\Datadrivenpract.xlsx\"");
         XSSFWorkbook wb = new XSSFWorkbook(p);//excel book
         XSSFSheet Sh= wb.getSheet("sheet1");//sheet details
         int n= Sh.getLastRowNum();
         for(int i=1;i<=n; i++) {
        	 String username=Sh.getRow(i).getCell(0).getStringCellValue();
        	 String password=Sh.getRow(i).getCell(1).getStringCellValue();
        	 driver.get("https://www.facebook.com/");
        	 driver.findElement(By.name("email")).clear();
        	 driver.findElement(By.name("email")).sendKeys(username);
        	 driver.findElement(By.name("pass")).clear();
        	 driver.findElement(By.name("pass")).sendKeys(password);
        	 driver.findElement(By.name("login")).click();
         }
         )
	}

}

