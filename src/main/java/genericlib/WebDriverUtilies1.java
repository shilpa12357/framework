package genericlib;

import java.util.Set;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilies1 {
	
	public void dropdown(WebElement ele, String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
	}
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions a =new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void doubleclick(WebDriver driver) {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
	}
	public void draganddrop(WebDriver driver, WebElement src, WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest);
		
	}
	public void notificationpopupO() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disabled-notification");
	}
	
	public void scrollbar(WebDriver driver) {
		Actions a =new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(+x+","+y+");
	}
	public void alertPop(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void switchframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	public void switchbacktoframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void switchtabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String c:child) {
			driver.switchTo().window(c);
	}
	
		
		
	}
	
}