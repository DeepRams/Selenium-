package module2;

import org.openqa.selenium.By;
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
        
       // Close and Quit
     		
            driver.close();// this will close the current active window of the current instance
     		driver.quit();// this will close all the windows in the current instance
     		
        // Get commands
     		
     		driver.get("url"); // to get URL of the AUT(Application under test)
     		driver.getTitle();  // to capture the current page title
     		driver.getCurrentUrl(); // to capture current URL of that page
     		driver.getWindowHandle(); // to capture the name of the window
     		
     	// Navigation Commands
     		
     		driver.navigate().to("URL"); // to move from A to B
     		driver.navigate().back(); // to move to the previous page
     		driver.navigate().forward(); // to move to the next page
     		driver.navigate().refresh(); // to refresh the page
     		
     	// Element Handling
     		
     		driver.findElement(By.id(" ")).click();
     		driver.findElement(By.id(" ")).sendKeys();
     		driver.findElement(By.id(" ")).clear();
     	//  driver.findElement(By id(" ")).Submit()
     		
     		
     	}
 }
