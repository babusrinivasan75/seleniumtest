package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBoxTestcase {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.wikipedia.org");
	driver.manage().window().maximize();
	
	WebElement element = driver.findElement(By.id("searchLanguage"));
	
	Select select = new Select(element);
	select.selectByVisibleText("Italiano");
	
	WebElement blockLinks = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[1]"));
	List<WebElement> links = blockLinks.findElements(By.tagName("a"));
	
	for(WebElement link : links) {
		System.out.println(link.getAttribute("href"));
	}
	
	
	}

}
