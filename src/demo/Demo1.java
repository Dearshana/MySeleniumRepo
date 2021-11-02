package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	driver.getTitle();
	System.out.println(driver.getTitle());
	driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
	}
}