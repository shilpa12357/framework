package genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1{
	public WebDriver driver;
	public PropertyFile1 pdata=new PropertyFile1();
	public WebDriverUtilies1 utilities=new WebDriverUtilies1();
	
	@BeforeMethod
	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void closeApp(ITestResult res) {
		int status = res.getStatus();
		String name = res.getName();
		if(status==2) {
			Photo1 p=new Photo1();
			p.getPhoto(driver, name);
		}
		
		driver.quit();
		
	}
	
}