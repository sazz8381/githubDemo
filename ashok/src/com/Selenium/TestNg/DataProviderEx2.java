package com.Selenium.TestNg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEx2 {
	static WebDriver d;
	private int count = 1;
	
	@DataProvider(name="dp")
	public Object[][] dp()
	{
		Object data[][]={{"admin","admin123"},{"admin","admin1234"}};
		return data;	
	}
	
	@Test (dataProvider ="dp")
	public void readtestdata(String uname, String pswd) throws Exception {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Dimension dim = new Dimension(1000,1000);
		d.manage().window().setSize(dim);
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("uname");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("pswd");
		d.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		List<WebElement> ele = d.findElements(By.xpath("//p[text()=\"Invalid credentials\"]"));
		if (ele.size() !=0 && ele.get(0).isDisplayed()) {
			System.out.println("Login Failed");
		}else {
			System.out.println("Login Sucessful");
		}
		Thread.sleep(2000);
		d.quit();
	}
	
	}

