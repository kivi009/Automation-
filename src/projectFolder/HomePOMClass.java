package projectFolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

     public class HomePOMClass
     {
     WebDriver driver;
     
     @FindBy(xpath="//button[@id='react-burger-menu-btn']")
     WebElement menuButton;
     
     public void clickMenuButton()
     {
    	 menuButton.click();
     }	
     
     
     @FindBy(xpath="//a[@id='logout_sidebar_link']")
     WebElement logoutButton;
     
     public void clickLogoutButton()
     {
    	 logoutButton.click();
     }	
     

      //     Select product (bag)
     @FindBy(xpath="//div[text()='Sauce Labs Backpack']")
     WebElement bagpack;
     
     public void clickonbagpack()
     {
    	bagpack.click(); 
     }
     public String getTextfrombagpack()
     {
    	 String actualprodSelect = bagpack.getText();
    	 return actualprodSelect;
     }

     
     //     add to cart
     @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
     WebElement addToCart;
     
     public void clickaddToCart()
     {
    	 addToCart.click();
     }
     
     
    
     @FindBy(xpath="//span[@class='shopping_cart_badge']")
     WebElement cart;
     
     public String getTextFromCart()
     {
    	 String actualProdSelected = cart.getText();
    	 return actualProdSelected;
     }
     
     
   //   creating constructor
     
   public HomePOMClass(WebDriver driver)
   {
  	  this.driver = driver;
  	 
  	 PageFactory.initElements(driver, this);
   }
        
 }
