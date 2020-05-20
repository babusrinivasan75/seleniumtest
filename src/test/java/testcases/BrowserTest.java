package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static String browser = "firefox";
	public static WebDriver driver = null;

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.get("http://www.way2automation.com");
		System.out.println("title is " + driver.getTitle());
		driver.quit();

	}
}
