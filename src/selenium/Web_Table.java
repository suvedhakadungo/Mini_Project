package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.leafground.com/pages/table.html");
		System.out.println("********All Datas********");
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement webElement : all_data) {
			String text = webElement.getText();
			System.out.println(text);
		}
		System.out.println("********Specific Row Datas********");
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		for (WebElement webElement : row) {
			String text = webElement.getText();
			System.out.println(text);
		}
		System.out.println("********Specific Datas********");
		WebElement specific = driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]"));
		System.out.println(specific.getText());
		
		System.out.println("********Header Datas********");
		List<WebElement> header = driver.findElements(By.xpath("//table/tbody/tr/th"));
		for (WebElement webElement : header) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
	}
	
}
