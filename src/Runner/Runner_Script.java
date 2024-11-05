package Runner;

import org.testng.annotations.Test;

import Facebook_POM.POMScript;
import Generic_Facebook.Facebook_Generic_Script;

public class Runner_Script extends Facebook_Generic_Script
{
	@Test
	public void runnerScript()
	{
		POMScript p = new POMScript(driver);
		p.passData("Praveen");
		p.passPwd("Admin123");
		p.validClick();
		
		
	}
}
