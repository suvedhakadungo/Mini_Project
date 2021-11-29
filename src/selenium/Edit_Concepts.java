package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
	WebElement emailbox=	driver.findElement(By.id("email"));
	emailbox.sendKeys("test@gmail.com");
		
	WebElement appended =	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
	appended.sendKeys("text");
	
	WebElement gettextbox =driver.findElement(By.name("username"));
	String value =gettextbox.getAttribute("value");
	
	System.out.println(value);
	WebElement cleartext = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	cleartext.clear();
	WebElement disabledbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
    boolean enabled =	disabledbox.isEnabled();
     System.out.println(enabled);
      
			
		
		
	}

}
