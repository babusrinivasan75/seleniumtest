package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBoxTest {
	
	public static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
		int size = driver.findElements(by).size();
		if(size == 0) {
			return false;
		}
		else {
			return true;
		}
		
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		int i = 1;
		int count = 0;
		while(isElementPresent(By.xpath("//div[4]/input["+i+"]"))) {
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
			i++;
			count++;
		}
		System.out.println("the total checkboxes = "+count);
	}

}
