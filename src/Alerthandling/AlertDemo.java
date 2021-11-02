package Alerthandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
			//Thread.sleep(2000);
			//driver.switchTo().alert().accept();
			//driver.switchTo().alert().dismiss();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Darshana");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().getText();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
	}

}
