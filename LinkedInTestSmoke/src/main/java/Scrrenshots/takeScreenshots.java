package Scrrenshots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takeScreenshots {
			public static void captureAsScreenshot(WebDriver driver,String ScreenshotName)
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			try
			{
				FileUtils.copyFile(source, new File("C://selenium//screenshot//"+ScreenshotName+".png"));
				System.out.println("Screenshot Taken");
			}
			catch(Exception e)
			{
				System.out.println("Exception Occured during screenshot"+e.getMessage());
			}
		}
}



