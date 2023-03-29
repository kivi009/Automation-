package projectFolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

       public class LoginPOMClass
       {
       WebDriver driver;

       @FindBy(xpath="//input[@id='user-name']")
       WebElement username;

       public void sendUsername()
       {
    	   username.sendKeys("standard_user");
       }
       
       @FindBy(xpath="//input[@id='password']")
       WebElement password;

       public void sendPassword()
       {
    	   password.sendKeys("secret_sauce");
       }
       
       @FindBy(xpath="//input[@id='login-button']")
       WebElement loginbutton;

       public void sendLoginbutton()
       {
    	   loginbutton.click();
       }
       
//       constructor create
       
       public LoginPOMClass(WebDriver driver)
       {
    	   this.driver= driver;
    	   PageFactory.initElements(driver, this);
       }
       
       
       
       
       
       
       
       
       
       
       



}
