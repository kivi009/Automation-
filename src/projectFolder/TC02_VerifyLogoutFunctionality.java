package projectFolder;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_VerifyLogoutFunctionality 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","V:\\Personal\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("Browser is maximized");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL is opened");
	Thread.sleep(2000);
//	apply wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	LoginPOMClass lp = new LoginPOMClass(driver);
	
	lp.sendUsername();
	System.out.println("username is entered");
	Thread.sleep(2000);

	lp.sendPassword();
	System.out.println("Password is entered");
	Thread.sleep(2000);

	lp.sendLoginbutton();
	System.out.println("Loginbutton is clicked");
	Thread.sleep(2000);

	System.out.println("Went on homepage");
	
	HomePOMClass hp = new HomePOMClass(driver);
	
	hp.clickMenuButton();
	System.out.println("menu button clicked");
	Thread.sleep(2000);

	hp.clickLogoutButton();
	System.out.println("Logout button clicked");
	Thread.sleep(2000);

	System.out.println("Went on login page");
	Thread.sleep(2000);

    System.out.println("apply verification");
    
    String expectedtitle = "Swag Labs";
	
	String actualtitle = driver.getTitle();
	
	if(expectedtitle.equals(actualtitle))
	{
		System.out.println("Logout test case is pass");
	}
	else
	{
		System.out.println("Logout test case is failed");
	}	
		
		
	driver.quit();
	System.out.println("Browser is closed");
		
	System.out.println("End of Program");	

}
}
