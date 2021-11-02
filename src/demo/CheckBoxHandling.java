package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		WebElement a=driver.findElement(By.xpath("//input[@type='checkbox']"));
		//driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).;
		a.isSelected();
		a.isEnabled();
		a.isDisplayed();
		System.out.println(a.isSelected()+"  "+a.isEnabled()+"  "+a.isDisplayed());
		/*List<WebElement> obj=driver.findElements(By.xpath("//input[@type='checkbox']"));
		//input[@id='checkBoxOption1']
		obj.size();
		System.out.println(obj.size());
		for(WebElement elementex: obj){
			elementex.click();
			
		}*/
		
		
		
		/*......to select single element......
		 * 
		 * 
		List<WebElement> object=driver.findElements(By.xpath("//input[@type='checkbox']"));
		//input[@id='checkBoxOption1']
		object.size();
		System.out.println(object.size());
		for(WebElement elementex1: object){
			System.out.println(elementex1.getAttribute("value"));
			if(elementex1.getAttribute("value").equalsIgnoreCase("Option2"))
			{
				System.out.println(elementex1.getAttribute("value"));
				elementex1.click();
				break;
			}
			*/
			
		}
		
		//driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
}
