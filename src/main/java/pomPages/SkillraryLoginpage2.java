package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginpage2 {
	@FindBy(xpath="//a[text()=' GEARS ']") 
	private WebElement gearbtn;
	
	@FindBy(xpath="(//a[@class='ignorelink'])[16]")
	private WebElement seleniumdemoappbtn;
	
	@FindBy(name="q")
	private WebElement searchtab;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;


     public SkillraryLoginpage2(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     public void gear() {
    	 gearbtn.click();
     }
     public void seleniumdemoapp() {
    	 seleniumdemoappbtn.click();
    	 
     }
     public void searchT(String coursename) {
    	 searchtab.sendKeys(coursename);
    	 
     }
     public void searchButton() {
    	 searchbtn.click();
    	 
     }
     
     }
	


