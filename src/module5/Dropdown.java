package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException { //if we add thread.sleep wait command this will import
		
		//open browser
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
			 WebDriver driver = new ChromeDriver();
			 
		//open AUT
			 
		 driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		 
        //Initialize the Select class and navigate to find element
		 
		 Select iSelect=new Select(driver.findElement(By.id("continents")));
		 
		 //select south America  by visibleText
		 
		 iSelect.selectByVisibleText("South America");
		 
		 //select north America by index
		 
		 iSelect.selectByIndex(5);
		 
		 //select Antarctica by Value
		 
		  iSelect.selectByValue("g");
		  
		  Thread.sleep(2000);
		  
		  driver.quit();

	}

}
