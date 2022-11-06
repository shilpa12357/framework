package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin2 {
	@FindBy(name="addresstype")
	private WebElement selectcat;
	
	
	
	
	public SkillraryDemoLogin2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public WebElement getSelectcat() {
		return selectcat;
	}


	
	


	





	
	

}
