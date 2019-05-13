package module5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect_dropdown {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\Installation stuff\\Installation stuff\\chromedriver.exe ");
			 WebDriver driver = new ChromeDriver();
			 
		//open AUT
			 
		 driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		 
       //Initialize the Select class and navigate to find element
		 
		 // where iselect is my own local variable
		 
		 Select iselect=new Select(driver.findElement(By.id("selenium_commands")));
		 
		 //To select and deselect "Browser commands" in dropdown list by index n visibletext options
		 
		 iselect.selectByIndex(0);
		
		 Thread.sleep(2000);
		 
		 iselect.deselectByVisibleText("Browser Commands");
		 
		 //To start the loop to select the option one by one or all at a time we need total count
		 
		 List<WebElement> tcount=iselect.getOptions(); //tcount my own variable
		 
		 int itotaloptions=tcount.size();
		 System.out.println(itotaloptions);
		 
		 //starting the loop to select the options one by one and deselect the options and will come out of the loop
		 
         	for(int i=0; i<itotaloptions; i++)
         	{
         		
				//to get the value of the options and using get text i will print the same in the console
         		String svalue= tcount.get(i).getText();
         		System.out.println(svalue);
         		
         		//to select option by using index of i
         		
         		iselect.selectByIndex(i);
         		Thread.sleep(2000);
         		//to deselect option by using index of i
         		
         		iselect.deselectByIndex(i);
         		Thread.sleep(2000);
         	}
         	

	}

}
