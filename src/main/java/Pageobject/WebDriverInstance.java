package Pageobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverInstance {
	
	public static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	
	public static WebDriver getDriver() {
		if(driver.get()==null) {
			try {
				driver.set(createDriver());
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		return driver.get();
	}
	
	public static WebDriver createDriver() throws IOException {
		WebDriver driver=null;
		Properties prop=new Properties();
		FileInputStream data= new FileInputStream("C:\\Users\\bhask\\OneDrive\\Documents\\Selenium\\MavenCmd\\src\\main\\java\\Pageobject\\config.properties");
        prop.load(data);
        if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\bhask\\OneDrive\\Documents\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
        return driver;
	}
	
	public static void cleanDriver() {
	//	driver.get().quit();
		driver.remove();
	 
	}
	
      
}


