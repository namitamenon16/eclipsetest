package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpass;
	
	@FindBy(id="login")
	WebElement fblogin;
	
	public Fbloginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setValues( String email, String paswd) {
		fbemail.sendKeys("abc@gmail.com");
		fbpass.sendKeys("abcde");
	}
	public void loginclick() {
		fblogin.click();
	}
	
}
