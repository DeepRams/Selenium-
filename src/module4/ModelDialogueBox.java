package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModelDialogueBox {

	public static void main(String[] args) {
		//open browser
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
			 WebDriver driver = new ChromeDriver();
			 
		//open AUT
			 
		 driver.get("https://www.flipkart.com/");
		 
		 // finding element(for login user name) by copying way of normal xpath
		 
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("Deepthi");
		 
		 //finding element(close(x)) button by writing way of normal xpath 
		 
		 driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		  driver.quit();
	}

}
