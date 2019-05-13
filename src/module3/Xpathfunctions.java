package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfunctions {

	public static void main(String[] args) {
		
		//open browser
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
			 WebDriver driver = new ChromeDriver();
			 
		//open AUT
			 
		 driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		 
		 
		// by using Lastname textfield we are doing all Xpath operations
		 
		 driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[1]/input[2]")).sendKeys("Ram");  // normal Xpath
		 
		 
		
		 // preceding Xpath
		 
		 driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[1]/input[2]//preceding::input[1]")).sendKeys("Deep");
			 
		 // following Xpath
		  
		 driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[1]/input[2]//following::input[10]")).sendKeys("5-7-2019");
		 
		 // Contains Xpath
		
		 driver.findElement(By.xpath("//*[contains(@id,'profession-1')]//following::input[4]")).click();
			
		
		  // starts-with Xpath
		 
		 driver.findElement(By.xpath("//*[starts-with(text(),'Test')]")).click();
			 
	    

		

	}

}
