package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
		 WebDriver driver = new ChromeDriver();
		 
	//open AUT
		 
	 driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
	 
	 //calling webelement Firstname
	 
	 WebElement Fname=driver.findElement(By.id("ts_first_name"));
	 
	 // initializing Actions class
	 
	 Actions act=new Actions(driver);
	 
	 //performing Action interface to club all the actions where action class doesnot
	 
	 Action newact=act
			       .moveToElement(Fname) //keyboard actions
			       .keyDown(Fname,Keys.SHIFT)
			       .sendKeys(Fname,"deepthi")
			       .keyUp(Fname,Keys.SHIFT)
			       .doubleClick(Fname)//mouse action
			       .contextClick(Fname)//mouse action
			       .build();
	 newact.perform();
			       
	 
			       
	 		
	

	}

}
