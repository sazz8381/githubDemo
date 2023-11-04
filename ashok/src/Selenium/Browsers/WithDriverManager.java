package Selenium.Browsers;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SelectClasses.highlight;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WithDriverManager {
	static WebDriver d;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Instant starttime = Instant.now();
		d.get("https://www.amazon.in/");
		Instant endtime = Instant.now();
		System.out.println(Duration.between(starttime, endtime));
		WebElement ele = d.findElement(By.xpath("//i[@class=\"hm-icon nav-sprite\"]"));
		ele.click();
		Thread.sleep(2000);
		WebElement ele1 = d.findElement(By.xpath("//a[@class=\"hmenu-item\"]"));
		ele1.click();
		highlight.highlight(ele1, d);
		Thread.sleep(2000);
		d.quit();
	
	}
}
