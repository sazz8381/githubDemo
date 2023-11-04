package com.Selenium.TestNg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataProviderExample {
	static WebDriver d;
	
	@DataProvider(name = "Login")
	public Object[][] dp(){
		Object data[][] = new Object[2][2];
		data[0][0]="admin";
		data[0][1]="admin123";	
		data[1][0]="admin";
		data[1][1]="admin123";
		return data;
	}
	
	@Test(dataProvider = "Login")
	public void testlogin(String uname, String pswd)throws Exception{
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Dimension dim = new Dimension(800,500);
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
