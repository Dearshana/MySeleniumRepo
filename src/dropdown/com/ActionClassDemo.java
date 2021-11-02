package dropdown.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            Actions a= new Actions(driver);
            
            WebElement element=driver.findElement(By.xpath("//button[contains(text(),'Home')]"));
            a.contextClick(element).perform();
            a.doubleClick(element).perform();
	}

}
