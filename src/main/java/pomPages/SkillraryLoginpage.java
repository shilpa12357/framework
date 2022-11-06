package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginpage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[@class='ignorelink'])[16]")
	private WebElement Demoapp;
	
	public SkillraryLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 public void gearsbtn()
 {
	 gearsbtn.click();
 }
 public void skillrarydemoapp() {
	 Demoapp.click();
 }
}
