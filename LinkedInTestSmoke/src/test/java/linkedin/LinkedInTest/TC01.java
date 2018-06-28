package linkedin.LinkedInTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Scrrenshots.takeScreenshots;
import TestBase.Testbase;
import UIactions.UiACtion;

public class TC01 extends Testbase{
	UiACtion PageObj;
	
@BeforeTest
		public void openBrowser() throws InterruptedException
				{
					init();
				}
@Test
		public void  runTest() throws InterruptedException
				{
					PageObj=new UiACtion(driver);
					takeScreenshots.captureAsScreenshot(driver,"Test Started");
					PageObj.startProcess();
					takeScreenshots.captureAsScreenshot(driver,"Test Ended");
				}
@AfterTest
		public void close()
				{
					driver.close();
				}
}
