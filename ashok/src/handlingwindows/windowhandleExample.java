package handlingwindows;
import Selenium.Browsers.AUTDiffBrowsersEx;

import Selenium.Browsers.BrowserType;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Selenium.Browsers.BrowserType;



public class windowhandleExample {
	static WebDriver d;
	public static void main(String[] args) throws Exception {
		AUTDiffBrowsersEx.openBrowser(BrowserType.Chrome);
		d.get("https://demo.automationtesting.in/Windows.html");
		clickEle(By.xpath(""), d);
		
		
	}
	
	
		


	public static void clickEle(By by,WebDriver d) {
		getElement(by, d).click();
	}
	public static WebElement getElement(By by,WebDriver d) {
		return wait(by, d);
	}
	public static WebElement wait(By by,WebDriver d) {
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	public static String getparentwnd(WebDriver d) {
		return d.getWindowHandle();
	}
	
}