package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {
		

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
			 WebDriver driver = new ChromeDriver();
			 
		//open AUT
			 
		 driver.get("https://www.myntra.com/");
		 
		 //entering data into search box and clicking on search button  
		 
		 driver.findElement(By.className("desktop-searchBar")).sendKeys("chiffon sarees");
		 driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")).click();
		 
		 // initializing the Actions class
		 
		 Actions act=new Actions(driver);
		 
		 // mouse hovering on the desired element means here on "chiffon saree"
		 
		 WebElement MH=driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img"));
		 
		 act.moveToElement(MH).perform(); 
		           
		 
	}
}
