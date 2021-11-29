package selenium;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {

	 public static void main(String[] args)  {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
	   driver.findElement(By.name("q")).sendKeys("Pondicherry"+ Keys.ENTER);
		
		
				
	
		
		
		
	}

}
