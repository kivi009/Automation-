package projectFolder;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03_VerifyProductAddToCartFunctionality 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 	"V:\\Personal\\Selenium\\chromedriver.exe");
		
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
		
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickonbagpack();
		System.out.println("Click on product");
		Thread.sleep(2000);
		
		System.out.println("Apply the verification");
		
		String expectedprodselect = "Sauce Labs Backpack";
		String actualprodSelect = hp.getTextfrombagpack();
		
		if(expectedprodselect.equals(actualprodSelect))
		{
			System.out.println("product select test case is passed");
		}
		else	
		{
			System.out.println("product select test case is failed");
		}	
		
	
        
		
        hp.clickaddToCart();
		System.out.println("product add to cart");
		Thread.sleep(2000);
		
		System.out.println("Apply the verification");
		
		String expectedProduct = "1";
		String actualProduct = hp.getTextFromCart();
		
		if(expectedProduct.equals(actualProduct))
		{
			System.out.println("Add to cart test case is passed");
		}
		else	
		{
			System.out.println("Add to cart test case is failed");
		}	
		
		driver.quit();
		System.out.println("Browser is Closed");
		Thread.sleep(2000);

		System.out.println("End of Program");	
			
			
			
			
			
			
		
}
}
