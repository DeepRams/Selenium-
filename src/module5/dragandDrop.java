package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandDrop {

	public static void main(String[] args) throws InterruptedException {
		//open browser
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
			 WebDriver driver = new ChromeDriver();
			 
		//open AUT
			 
		 driver.get("http://jqueryui.com/droppable/");
		  
		//calling the web Element Frame, means main outer Box
		 
		 WebElement Box=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")); // Box is my own local variable
		 
		 //switching the focus of the driver towards the frame
		 
		 driver.switchTo().frame(Box);
		 
		 //initializing Actions class
		 
		 Actions act=new Actions(driver);
		 
		 // defining the webElements Source n Target
		 
		 WebElement Source=driver.findElement(By.id ("draggable"));
		 
		 Thread.sleep(2000);
		 WebElement Target=driver.findElement(By.id ("droppable"));
		 
		 act.dragAndDrop(Source, Target).perform();
		 
		 
		 
		 
		 
		 

	}

}
