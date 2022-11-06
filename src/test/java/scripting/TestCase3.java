package scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.CoreJava;
import pomPages.SkillraryLoginpage2;
import pomPages.VideoWishlist;


public class TestCase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginpage2 sk=new SkillraryLoginpage2(driver);
		sk.searchT(pdata.getdata("coursename"));
		sk.searchButton();
		
		CoreJava cj=new CoreJava(driver);
		cj.core();
		VideoWishlist vw=new VideoWishlist(driver);
		driverutilities.switchFrame(driver);
		Thread.sleep(10000);

		vw.videoPlay();
		Thread.sleep(10000);
		vw.videoPause();
		driverutilities.switchbackframe(driver);
		vw.addWish();
		
		


		
	}
	

}
