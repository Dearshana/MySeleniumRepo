package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C:\\Users\\DELL\\Desktop\\JavaTraining\\scrn.png"));
}
}//((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);