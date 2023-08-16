package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Pageobject.BasePage;
import Pageobject.Objectslocation1;
import Pageobject.WebDriverInstance;

public class Testclass1 extends BasePage  {
      
	public Testclass1() {
    	     }
	
	

	
	    @Test
	    public void main2() throws InterruptedException, IOException {
	    getDriver();
	    getUrl();
		Objectslocation1 obj1 = new Objectslocation1();
		obj1.getTshirt().click();
		obj1.AddToCart().click();
		Thread.sleep(3000);
		obj1.ProceedtoCheckout().click();
		Thread.sleep(3000);
		WebDriverInstance.cleanDriver();
	}

}
	


