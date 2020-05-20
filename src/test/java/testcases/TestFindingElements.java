package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFindingElements {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//finding elements
		driver.findElement(By.name("identifier")).sendKeys("babsri12@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		driver.findElement(By.name("password")).sendKeys("Baabu1devi");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		
		driver.close();
		

	}

}
