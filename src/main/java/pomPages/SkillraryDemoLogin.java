package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {
	@FindBy(id="course")
	private WebElement corsetb;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement SeleniumTraining;
	
	public  SkillraryDemoLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getCorsetb() {
		return corsetb;
	}

	public void seleniumTraining() {
		SeleniumTraining.click();
		
	}
	
	

}
