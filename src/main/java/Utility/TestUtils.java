package Utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestUtils 
{
	public static String getPropertiesData(String key)
	{
		String value = null;
		try 
		{
			String path = "./src/main/resources/data.properties";
			FileInputStream file = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(file); 
			value = prop.get(key).toString();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		return value;
	}
	
	public static Logger log()   
	{
		return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}
	
}
