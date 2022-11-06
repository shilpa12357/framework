package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VideoWishlist {
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playbtn;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlist;
	
	public  VideoWishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void videoPlay()
	{
		playbtn.click();
	}
	public void videoPause()
	{
		pausebtn.click();
	}
	public void addWish()
	{
		wishlist.click();	
	}

}
