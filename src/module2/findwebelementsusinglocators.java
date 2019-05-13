package module2; // Facebook  Example

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findwebelementsusinglocators {

	public static void main(String[] args) {

		// open browser

		 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
		 WebDriver driver = new ChromeDriver();

		// open AUT (Application under test)

		 driver.get("https://www.facebook.com/");

		
		  //finding web elements using ID locator
		  
		  driver.findElement(By.id("u_0_c")).sendKeys("Deep");
		  driver.findElement(By.id("u_0_e")).sendKeys("Ram");
		  
		  //using Name locator
		  
		  
		  driver.findElement(By.name("firstname")).sendKeys("Deep");
		  driver.findElement(By.name("lastname")).sendKeys("Ram ");
		  driver.findElement(By.name("reg_email__")).sendKeys("9985456238");
		  
		  
		  // using Classname locator
		  
		  driver.findElement(By.className("inputtext")).sendKeys("Deep");
		  driver.findElement(By.className("inputtext")).sendKeys("Ram");
		  
		  
		  
		  // using LinkText locator
		  
		  driver.findElement(By.linkText("Forgot account?")).click();
		  
		  // using partial linkText locator
		  
		  driver.findElement(By.partialLinkText("forgot")).click();
		  driver.navigate().back(); driver.navigate().forward();
		  
		  // using cssselector
		  
		  driver.findElement(By.cssSelector("input#u_0_e")).sendKeys("Ram");
		  
		  // using Tagname
		  
		  List<WebElement> list = driver.findElements(By.tagName("a"));
		  
		  System.out.println(list.size());
		  
		  // using xpath
		 
		  driver.findElement(By.xpath("//*[@id=\"u_0_c\"]")).sendKeys("Deep"); //normal xpath
		  
		  
		  driver.findElement(By.xpath("//*[contains(@name,'last')]")).sendKeys("Ram");  // by using contains function
		  
		  driver.findElement(By.xpath("//*[@class=\"inputtext\"and @ name=\"email\"] "
		  )).sendKeys("Deepram"); // by using and operator
		 
	}

	
}
