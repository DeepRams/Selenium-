package module3;     // pageload wait command also included

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwaitcommand {

	public static void main(String[] args) {
		
		//open browser
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
		 WebDriver driver = new ChromeDriver();
		 
		//open AUT
		 driver.get("http://newtours.demoaut.com/");
		 
		 //pageload
		 
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); // pageload works on every time when page loads
		 
		 // implicit wait
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit command works on each line of code
		 
		 //setscript timeout
		  
		 driver.manage().timeouts().setScriptTimeout(70,TimeUnit.SECONDS); // works on whole script execution time
		 
		 
		 driver.findElement(By.name("userName")).sendKeys("abcd"); //10sec
		 driver.findElement(By.name("password")).sendKeys("pwd"); //10sec
		 driver.findElement(By.name("login")).click();  //10sec
		 
		driver.close();
		 
		 

	}

}
