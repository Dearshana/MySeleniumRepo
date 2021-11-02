package dropdown.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
	driver.findElement(By.xpath("//input[@id='travel_date']")).click();
	//td[@class='day']
	List<WebElement> element=driver.findElements(By.xpath("//td[@class='day']"));
	
	for(int i=0; i<element.size(); i++) {
		String value= element.get(i).getText();
		if (value.equalsIgnoreCase("26"))
		{
			element.get(i).click();
			break;
		}
		driver.findElement(By.xpath("//div[@class='sumome-react-svg-image-container']")).click();
	}
	}

}
