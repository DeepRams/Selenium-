package module3; // using google.com as example

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Validation {

	public static void main(String[] args) { 
		 //open browser
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
		 WebDriver driver = new ChromeDriver();
		 
		 //open AUT
		 
		 driver.get("https://www.google.com/");
		 
		 String AppTitle=driver.getTitle();
		 System.out.println(AppTitle);
		 
		 boolean result=AppTitle.equals("Google");
		 System.out.println(result);
		 

	}

}
