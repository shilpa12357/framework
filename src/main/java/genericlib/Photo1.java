package genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo1 {
	public void getPhoto(WebDriver driver,String namr) {
		Date d=new Date();
		d.toString().replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver ;
		File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File(AutoConstant1.PhotoPath);
	}

	
}
