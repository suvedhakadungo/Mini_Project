package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
