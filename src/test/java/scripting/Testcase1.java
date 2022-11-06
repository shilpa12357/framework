package scripting;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginpage;

public class Testcase1 extends BaseClass {
	@Test
	public void tc1()
	{
		SkillraryLoginpage s1=new SkillraryLoginpage(driver);
		s1.gearsbtn();
		s1.skillrarydemoapp();
		
		driverutilities.switchtabs(driver);
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilities.mouseover(driver, sd.getCorsetb());
		sd.seleniumTraining();
		
		AddToCart a=new AddToCart(driver);
		driverutilities.doubleclick(driver, a.getPlus());
		
	}

}
