package xpath.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathParent {
	static WebDriver d;
	public static void main(String[] args) {
		System.getProperty("WebDriver.Chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://www.amazon.in");
		WebElement ele = null;
		List<WebElement> wele= null;
		
		//identify parent Ele by Using Parent Axis
		ele = d.findElement(By.xpath(""));
	}
}
