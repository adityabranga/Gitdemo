package Testcases;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Pageobject.BasePage;
import Pageobject.Objectslocation1;
import Pageobject.WebDriverInstance;

public class Testclass2 extends BasePage {
	
	   public Testclass2() {
		   
	   }
	
	   
	   @Test
	    public void main2() throws IOException, InterruptedException  {
	        getDriver();
	        getUrl();
		    Objectslocation1 obj1 = new Objectslocation1();
		    obj1.getTshirt().click();
		    Thread.sleep(3000);
		    WebDriverInstance.cleanDriver();
		
	}

}

