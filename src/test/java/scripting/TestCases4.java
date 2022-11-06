package scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.BaseClass1;
import pomPages.HomeFbPage;
import pomPages.Loginfb;

public class TestCases4 extends BaseClass1 {
	@Test
	public void tc4() throws IOException, InterruptedException {
	Loginfb f=new Loginfb(driver);
	f.getuser(pdata.getData("username"));
	f.getpwd(pdata.getData("password"));
	f.logintb();
	Thread.sleep(5000);
	HomeFbPage bb=new HomeFbPage(driver);
	Thread.sleep(5000);
	bb.Signinbtn();
	utilities.notificationpopupO();
	
	Thread.sleep(5000);
	bb.logoutbtn();
	}
}
	


