package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile1{
	public String getData(String key) throws IOException  {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant1.Propertyfilepath);
		p.load(fis);
		return p.getProperty(key);
	}

}
