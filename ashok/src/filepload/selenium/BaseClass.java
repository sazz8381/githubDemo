package filepload.selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver d;

	public static void getBrowser(String browser, String url) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
			d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			d.manage().window().maximize();
			d.manage().window().maximize();
			d.get(url);
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
			d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			d.get(url);
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			d = new EdgeDriver();
			d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			d.manage().window().maximize();
			d.get(url);
		} else {
			throw new Exception("No Such Browser Found !!");

		}
	}
	
	
	
	public static WebDriver getDriver() {
		return d;
	}

	public static void tearDown() {
		d.quit();
	}

	public static void enterText(By by, String txt) {
		getElement(by).sendKeys(txt);
	}

	public static void clickElement(By by) {
		getElement(by).click();
	}

	public static WebElement getElement(By by) {
		return waitforElement(by);
	}

	public static WebElement waitforElement(By by) {
		return new WebDriverWait(d, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static WebElement waitforElement(WebElement ele) {
		return new WebDriverWait(d, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ele));
	}

	public static List<WebElement> waitforAllElement(By by) {
		return new WebDriverWait(d, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	}

	public static Actions actobj() {
		Actions act = new Actions(d);
		return act;
	}

	public static void movetoElementandClick(WebElement ele) {
		actobj().moveToElement(ele).pause(Duration.ofSeconds(2)).click().build().perform();
	}

	public static List<WebElement> getallElements(By by) {
		return waitforAllElement(by);

	}

	public static String selectOption(List<WebElement> eles, String txt) {
		for (WebElement option : eles) {
			waitforElement(option);
			String opt = option.getText();
			if (opt.equalsIgnoreCase(txt)) {
				movetoElementandClick(option);
				break;
			}
		}
		return txt;
	}

	public static boolean isDisplayed(WebElement ele) {
		return ele.isDisplayed();
	}

	public static boolean isDisplayed(By by) {
		return d.findElement(by).isDisplayed();
	}

	public static void fileUpload(String filepath) throws Exception {
		Thread.sleep(3000);
		
		StringSelection str = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
	}

}