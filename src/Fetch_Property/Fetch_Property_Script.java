package Fetch_Property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Fetch_Property_Script 
{
	@Test
	public static String fetchProperty() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./Property_Files/URL.properties"));
		String value = p.getProperty("baseURL");
		return value;
	}
}
