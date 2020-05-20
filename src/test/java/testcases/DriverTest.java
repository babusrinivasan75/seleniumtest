package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver cm = new ChromeDriver();
		cm.get("http://www.way2automation.com");
		
		System.out.println("title is  "+cm.getTitle());
		cm.close();
		cm.quit();
		
		;
//		InternetExplorerDriver id = new InternetExplorerDriver();
//		id.get("www.google.co.in");
		
//		EdgeDriver ed = new EdgeDriver();
//		ed.get("http://www.vodafone.com");

	}

}
