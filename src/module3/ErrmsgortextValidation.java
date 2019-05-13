package module3;  // by using Naukari.com

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrmsgortextValidation {

	public static void main(String[] args) {
		
		 //open browser
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
		 WebDriver driver = new ChromeDriver();
		 
		 //open AUT
		 
		 driver.get("https://www.naukri.com/nlogin/login");
		 
		 driver.findElement(By.id("usernameField")).click();
		 driver.findElement(By.id("passwordField")).click();
		 
		 String Text=driver.findElement(By.id("usernameField_err")).getText(); 
		 boolean result=Text.equals("Email ID/Username cannot be left blank");
		 
		 System.out.println(result);
		 
		

	}

}
