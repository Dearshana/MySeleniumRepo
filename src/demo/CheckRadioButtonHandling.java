package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckRadioButtonHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		
		WebElement a=driver.findElement(By.xpath("//input[@name='radioButton']"));
		
		//driver.findElement(By.xpath(""//input[@value='radio1']")).isSelected();
		
		a.isSelected();
		a.isEnabled();
		a.isDisplayed();
		System.out.println(a.isSelected()+"  "+a.isEnabled()+"  "+a.isDisplayed());
		
		
		/*List<WebElement> obj=driver.findElements(By.xpath("//input[@name='radioButton']"));
		//input[@name='radioButton']
		
		obj.size();
		System.out.println(obj.size());
		
		for(WebElement element1: obj){
			
			element1.click();
			
		}*/
		
		
		
		//......to select single element......
		  
		List<WebElement> object=driver.findElements(By.xpath("//input[@name='radioButton']"));
		//input[@name='radioButton']
		object.size();
		System.out.println(object.size());
		for(WebElement element2: object){
			System.out.println(element2.getAttribute("value"));
			if(element2.getAttribute("value").equalsIgnoreCase("Radio2"))
			{
				System.out.println(element2.getAttribute("value"));
				element2.click();
				break;
			}
		}
	}	
}
		
		//driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

