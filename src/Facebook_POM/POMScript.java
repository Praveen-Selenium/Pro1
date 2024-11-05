package Facebook_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMScript 
{
	@FindBy(id="email")
	private WebElement uName;
	@FindBy(id="pass")
	private WebElement pswd;
	@FindBy(name="login")
	private WebElement button;
	
	public POMScript(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void passData(String un)
	{
		uName.sendKeys(un);
	}
	
	public void passPwd(String pw)
	{
		pswd.sendKeys(pw);
	}
	
	public void validClick()
	{
		button.click();
	}
	
}
