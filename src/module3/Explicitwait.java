package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		
		//open browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
		 WebDriver driver = new ChromeDriver();
		 
		 //open AUT
		 
		 driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");
		 
		 //using Explicit wait
		 
		 WebDriverWait wait=new WebDriverWait(driver,15); //it works on only particular webelement
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-5"))).click();
		 
		 
		

	}

}
