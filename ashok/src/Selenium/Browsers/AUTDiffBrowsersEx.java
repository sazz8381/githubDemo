package Selenium.Browsers;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import SelectClasses.highlight;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AUTDiffBrowsersEx {
	static WebDriver d;

	public static void main(String[] args) throws Exception {
		openBrowser(BrowserType.Chrome);
		Instant starttime = Instant.now();
		d.get("https://www.amazon.in/");
		Instant endtime = Instant.now();
		System.out.println(Duration.between(starttime, endtime));
		WebElement ele = d.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		highlight.highlight(ele, d);
		Thread.sleep(2000);
		d.quit();
	}

	public static WebDriver openBrowser(BrowserType browser) throws Exception {
		if (browser == BrowserType.Chrome) {
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
			
		}
		else if(browser == BrowserType.Edge) {
			WebDriverManager.edgedriver().setup();
			d = new EdgeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
	}
		else {
			throw new Exception("Browser Not Found");
		}
		return d;
	}
}