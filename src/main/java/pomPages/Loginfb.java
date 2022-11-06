package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginfb {
	@FindBy(id="email")
	private WebElement usern;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement login;
	
	public Loginfb(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void getuser(String username) {
		usern.sendKeys(username);
	}
	public void getpwd(String password) {
		pass.sendKeys(password);
	}
	public void logintb() {
		login.click();
		
	}

}
