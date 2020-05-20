package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitTestcase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		
		// implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		//fluent wait
		
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).pollingEvery(Duration.ofSeconds(5)).withTimeout(Duration.ofSeconds(10));
		//finding elements
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("identifier"))).sendKeys("babsri12@gmail.com");
		
		//driver.findElement(By.name("identifier")).sendKeys("babsri12@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		//driver.findElement(By.name("password")).sendKeys("Baabu1devi");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("Baabu1devi");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		
		driver.close();
		

	}

}
