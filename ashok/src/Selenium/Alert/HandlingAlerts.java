package Selenium.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium.Browsers.AUTDiffBrowsersEx;
import Selenium.Browsers.BrowserType;
import handlingwindows.windowhandleExample;

public class HandlingAlerts {
	static WebDriver d;

	public static void main(String[] args) throws Exception {
		d = AUTDiffBrowsersEx.openBrowser(BrowserType.Chrome);
		d.get("https://demo.automationtesting.in/Alerts.html");
		acceptAlert();

	}

	public static void acceptAlert() throws Exception {
		windowhandleExample.clickEle(By.xpath("//li//a[text()='Alert with OK ']"), d);
		windowhandleExample.clickEle(By.xpath("//button[contains(text(),'click the button to display an  alert box:']"),
				d);
		Alert alt = d.switchTo().alert();
		Thread.sleep(3000);
		waitForAlert();
		System.out.println(alt.getText());
		alt.accept();

	}
	public static void accept_and_dismiss_alert() throws Exception{
		for (int i = 0; i<=1; i++) {
			windowhandleExample.clickEle(By.xpath("//a[@text(),'Alert with OK & Cancel ']"),d);
			windowhandleExample.clickEle(By.xpath("//button[contains(text(),'click the button to display a confirm box')]"),d);
			Alert alt = d.switchTo().alert();
			Thread.sleep(3000);
			waitForAlert();
			if (i == 0) {
				alt.accept();
				Thread.sleep(3000);
				String text = d.findElement(By.xpath("//div//p[@id='demo']")).getText();
				System.out.println(text);
			}
		}
	}

	private static void waitForAlert() {
		// TODO Auto-generated method stub
		
	}
}
