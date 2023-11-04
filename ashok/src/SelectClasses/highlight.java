package SelectClasses;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;

public class highlight {
	static WebDriver d;
	
	public static void main(String[] args) {
		System.getProperty("Webdriver.Chrome.driver",".\\BrowserDrivers\\chromedriver.exe");
		d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Instant Starttime = Instant.now();
		d.get("https://demo.automationtesting.in/Register.html");
		Instant endtime = Instant.now();
		System.out.println(Duration.between(Starttime, endtime));
		WebElement ele = d.findElement(By.xpath("//input[@placeholder='First Name']"));
		highlight(ele,d);
	}
	
	public static void highlight(WebElement ele,WebDriver d) {
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].setAttribute('style', 'background : yellow; border : 2px solid red;')", ele);
	}
	
}
