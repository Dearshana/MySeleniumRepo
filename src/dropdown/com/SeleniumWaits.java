package dropdown.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Explicit wait
				WebDriverWait wait = new WebDriverWait(driver,5);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
}
}

//Implicit wait: Wait after every action and we have to just declare it one time
//Explicit wait: Wait for specific webelement and we have to declare it everytime
//Fluent wait
//Tread.sleep not use in company because it have performance issue. it is java concept.