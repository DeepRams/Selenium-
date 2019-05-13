package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		//open browser
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
			 WebDriver driver = new ChromeDriver();
			 
		//open AUT
			 
		 driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		 
		 //finding element 
		 
		 driver.findElement(By.id("confirm")).click();
		 
		 //Alert class  
		 
		 Alert CA=driver.switchTo().alert();   //CA means Confirmation alert where we define our own variable
		 
		 CA.dismiss();
		 
		 


	}

}
