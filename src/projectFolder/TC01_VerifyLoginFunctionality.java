package projectFolder;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_VerifyLoginFunctionality 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
	"V:\\Personal\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is Opened");
		Thread.sleep(2000);

//		apply wait
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
		System.out.println("Apply verification");
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
	    
		if (expectedTitle.equals(actualTitle))
		{
			System.out.println("Login test case is pass");
		}
		else
		{
			System.out.println("Login test case is failed");
		}
		
		driver.quit();
		System.out.println("Browser is closed");
		System.out.println("End of Program");
		
}		
}
