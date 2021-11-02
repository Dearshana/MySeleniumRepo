package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		//driver.findElement(By.id("username")).sendKeys("Darshana");
		//driver.findElement(By.id("password")).sendKeys("123456");
		//driver.findElement(By.id("Login")).click();
		//driver.findElement(By.linkText("forgot_password_link")).click();
		//driver.findElement(By.tagName("input"));
		//driver.findElement(By.partialLinkText("Forgot Your")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("Darshana");
		
	
	}

}//get and navigate difference

/*It is responsible for loading the page and waits until the page has finished loading.

It cannot track the history of the browser.

It is only responsible for redirecting the page and then returning immediately.

It tracks the browser history and can perform back and forth in the browser.*/

//partial link text,tagname,classname - homework
//Input is tagname
//red colour- attributes
//blue colour- Value
//Locators: id,name,link text,partial link text, xpath, css, tagname classname

