package testcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIframewithScreenshot {
	
	public static WebDriver driver;
	
	public static void captureScreenshot() throws IOException {
		
		Date date = new Date();
		String fileName = date.toString().replace(":", "_").replace(" ", "_")+".jpg";
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//screenshot/"+fileName));
		
	}

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().defaultContent();
		
		captureScreenshot();
		
		
	}

}
