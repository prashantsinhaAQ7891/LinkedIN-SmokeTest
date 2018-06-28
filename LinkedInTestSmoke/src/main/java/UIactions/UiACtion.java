package UIactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UiACtion {
	
	public static WebDriver driver;
	
	@FindBy(id="login-email")
	WebElement ID;
	
	@FindBy(id="login-password")
	WebElement Password;
	
	@FindBy(id="login-submit")
	WebElement LogInButton;
	
	@FindBy(css="#nav-settings__dropdown-trigger")
	WebElement DropMenu;
	
	@FindBy(linkText="Sign out")
	WebElement SignOutBtn;
	
	@FindBy(css="#jobs-tab-icon")
	WebElement Jobs;
	
	@FindBy(linkText="Career interests")
	WebElement CareerIntrest;
	
	public UiACtion(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void startProcess() throws InterruptedException
	{
		ID.sendKeys("prashant.sinha@astraqube.com");
		Password.sendKeys("prashantsinha");
		LogInButton.click();
		Thread.sleep(3000);
		Jobs.click();
		Thread.sleep(8000);
		CareerIntrest.click();
		Thread.sleep(2000);
		DropMenu.click();
		Thread.sleep(3000);
		SignOutBtn.click();
	}
}