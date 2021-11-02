package dropdown.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			  
			//to scroll down the page
			js.executeScript("window.scrollBy(0,600 )");
			Thread.sleep(2000);
			
			//to scroll up on page
			js.executeScript("window.scrollBy(600,0 )");
			Thread.sleep(2000);
			
			js.executeScript("arguments[0].scrollIntoView();", "WebElement");
			
		driver.findElement(By.xpath("//span[contains(text().'Login')]")).sendKeys(Keys.ARROW_DOWN);//to handle key on keyboard
	}

}
