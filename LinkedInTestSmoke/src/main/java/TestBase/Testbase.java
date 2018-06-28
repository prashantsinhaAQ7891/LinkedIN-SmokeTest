package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testbase {
	
	public static WebDriver driver;
	
	String url="https://www.linkedin.com";
	String browser="chrome";
	
	public void init() throws InterruptedException
	{
		selectBrowser(browser);
		geturl(url);
	}
private void selectBrowser(String browser) {
	if(browser.equalsIgnoreCase("chrome"))
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		driver=new ChromeDriver(options);
	}
	}
private void geturl(String url) throws InterruptedException {
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
}
}
