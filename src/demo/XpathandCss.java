package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathandCss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Darshana");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
		//driver.findElement(By.cssSelector("input[id='password']")).sendKeys("12345");
		//driver.findElement(By.cssSelector("input[id='Login']")).click();
		driver.findElement(By.xpath("//div[@id='username_container']//input[1]")).sendKeys("Darshana");
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("(//form[@id='login_form']//input)[21]")).sendKeys("12345");
		
		
	}
}
//Selector Hub tool is use to generate X-path-selenium plugin
//Absolute Xpath --it uses complete path from root element---parent-child

//Relative xpath--You can simply start by referencing the element you want and go from there.---
//Relative Xpaths are always preferred as they are not the complete paths from the root element
	
/*Syntax of x path

//tagname[@attribute='value]

//tagname[contains(Text(),'Text')]- contain text 

//a[contains(text(),'Try for Free')]
 
Parent child traverser of x path
It use when attribute values are keep changing

how to identify parent tagname
in HTML sript which open and close using same arrow
//parenttagname[@attribute='value]//childtagname

Syntax of Cssselector 
input[attribute='value']*/

//tagname--starting element, redcolor--attributes, blue color--values