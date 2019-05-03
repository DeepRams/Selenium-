package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Seleniumcommands {

	public static void main(String[] args) {
		
	//invoke/open  browser
		
		// open Chrome browser  
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Exe Files\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        // Here Webdriver is an Interface, driver is a reference variable, new is a keyword,Chromedriver is a class
        
        //  open Firefox browser 
        
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Exe Files\\geckodriver.exe");
        WebDriver driver1=new FirefoxDriver();
        
        // open Internetexplorer browser
        
        System.setProperty("webdriver.ie.driver", "C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Exe Files\\IEDriverServer.exe");
        WebDriver driver2=new InternetExplorerDriver(); 
        
        
	}

}
