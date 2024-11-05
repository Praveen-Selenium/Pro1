package Generic_Facebook;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Fetch_Property.Fetch_Property_Script;
import Interface_Package.Constant_Interfaces;

public class Facebook_Generic_Script implements Constant_Interfaces
{
	public WebDriver driver;
	@BeforeMethod
	public void openApplication() throws FileNotFoundException, IOException
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Fetch_Property_Script.fetchProperty());
		
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.quit();
	}
}
