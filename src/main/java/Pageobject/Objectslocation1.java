package Pageobject;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objectslocation1 extends BasePage{
	 
	
  public  WebDriver driver;
   
  
    public Objectslocation1() {
    	driver=WebDriverInstance.getDriver();
    }
    
   
	
	By HummingTshirt= By.cssSelector("article[data-id-product='1'] div a");
	By AddToCart= By.cssSelector("button[class*='add-to-cart'");
	By ProceedtoCheckout=By.cssSelector("div[class='cart-content-btn'] a");
	
	
	public WebElement getTshirt()  {
		return driver.findElement(HummingTshirt);
	}
	
	public WebElement AddToCart() {
		return driver.findElement(AddToCart);
	}
	
	public WebElement ProceedtoCheckout() {
		return driver.findElement(ProceedtoCheckout);
	}
	
}

