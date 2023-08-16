package Pageobject;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {
	
	
	
   
   private static Properties prop;
   private static FileInputStream data;
   

   
	 
   public static void propertiesMethod() throws IOException {
	   prop=new Properties();
		FileInputStream data= new FileInputStream("C:\\Users\\bhask\\OneDrive\\Documents\\Selenium\\MavenCmd\\src\\main\\java\\Pageobject\\config.properties");
       prop.load(data);
   }
	
	
	public static void getDriver() throws IOException  {     
		
		WebDriverInstance.getDriver();
         }
			
		
	
	
	public static void getUrl() throws IOException {
		propertiesMethod();
        
      WebDriverInstance.getDriver().get(prop.getProperty("url"));
	}
		
	    
	
	
	}


	
	
	

