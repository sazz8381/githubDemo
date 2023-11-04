package Selenium.Browsers;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SelectClasses.highlight;

public class ChromeBrowser {
	static WebDriver d;
	public static void main(String[] args) throws Exception {
		System.getProperty("WebDriver.Chrome.driver",".\\BrowserDrivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Instant starttime = Instant.now();
		d.get("https://www.amazon.in/");
		Instant endtime = Instant.now();
		System.out.println(Duration.between(starttime, endtime));
		WebElement ele = d.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		highlight.highlight(ele, d);
		Thread.sleep(2000);
		d.quit();
	
	}
}
