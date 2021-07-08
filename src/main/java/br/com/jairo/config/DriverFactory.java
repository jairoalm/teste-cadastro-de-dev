package br.com.jairo.config;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	public DriverFactory(){		
	}
	
	public static WebDriver getDriver(){
		
		if (driver == null){
			switch (Propriedade.browser){
			case CHROME:
				driver = new ChromeDriver();
				break;
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			case IE:
				driver = new InternetExplorerDriver();
				break;
			case SAFARI:
				driver = new SafariDriver();
				break;
			case OPERA:
				driver = new OperaDriver();	    
			}
			//Definir dimensões do browser
			driver.manage().window().maximize();
			DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		return driver;
		
	}

}
