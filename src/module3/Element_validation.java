package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_validation {

	public static void main(String[] args) {
		 //open browser
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
		 WebDriver driver = new ChromeDriver();
		 
		 //open AUT
		 
		 driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		 
		 driver.findElement(By.id("profession-0")).click();
		 WebElement element=driver.findElement(By.id("profession-0"));
		 
		 boolean result=element.isSelected();
		 System.out.println(result);
				 

	}

}
