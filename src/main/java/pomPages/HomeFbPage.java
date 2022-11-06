package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeFbPage {
	@FindBy(xpath="//div[@class='x1n2onr6 x78zum5']")
	private WebElement Signin;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logout;
	
	
	public HomeFbPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	



public void Signinbtn() {
	Signin.click();
}
	public void logoutbtn() {
		logout.click();
		
	}
}
