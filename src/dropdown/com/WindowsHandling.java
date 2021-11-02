package dropdown.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");

    driver.findElement(By.xpath("//button[@id='openwindow']")).click();
    Set<String> obj = driver.getWindowHandles();//will return parent and child window
    Iterator<String> b=obj.iterator();
    String parentwindow=b.next();//to store parent window
    String childwindow=b.next();//to store child window
    driver.switchTo().window(childwindow);//it will switch control to the child window
    driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
    driver.switchTo().window(parentwindow);//it will switch control to the parent window
    driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
    //span[contains(text(),'Login')]- contain text 
}
}

/*get.windowhandle(): This method helps to get the window handle of the current window
get.windowhandles(): This method helps to get the handles of all the windows opened
set: This method helps to set the window handles in the form of a string. set<string> set= driver.get.windowhandles()
switch to: This method helps to switch between the windows
action: This method helps to perform certain actions on the windows*/