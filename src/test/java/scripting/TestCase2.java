package scripting;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import genericlib.WebDriverUtilies;
import pomPages.SkillraryDemoLogin2;
import pomPages.SkillraryDragAndDrop;
import pomPages.SkillraryLoginpage2;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() throws IOException, InterruptedException {
		SkillraryLoginpage2 login=new SkillraryLoginpage2(driver);
		login.gear();
		login.seleniumdemoapp();
		
		driverutilities.switchtabs(driver);
		SkillraryDemoLogin2 demo=new SkillraryDemoLogin2(driver);
		driverutilities.dropdown(demo.getSelectcat(), pdata.getdata("dropdown"));
		
		
		driverutilities.switchtabs(driver);
		
		Thread.sleep(5000);
		
		SkillraryDragAndDrop dd=new SkillraryDragAndDrop(driver);
		Thread.sleep(5000);
		driverutilities.draganddrop(driver, dd.getDrag(), dd.getDrop());
		
		Point Loc=dd.getTwitter().getLocation();
		int x=Loc.getX();
		int y=Loc.getY();
		driverutilities.scroll(driver, x, y);
		
		
		
		dd.twittertab();
	}
	}
		
		
		
		
		
		
		
		
		

	



		
		
		


		
		
		
	
	
	
	
		
	
	
	
	
	
   	

	
	
	



