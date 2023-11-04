package com.Selenium.TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DependsOnMethod {
	static WebDriver d;
	@Test (priority =1)
	public void test1()throws Exception{
		WebDriverManager.chromedriver().setup();
		d =new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.manage().window().maximize();
		d.get("https://www.google.com");
		Assert.assertEquals(d.getTitle(), "Google");
		
	}
	
	@Test (priority=2)
	public void test2() throws Exception{
		d.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Automation testing", Keys.ENTER);
		
	}
	@Ignore
	@Test (priority=2)
	public void test3() throws Exception{
		d.findElement(By.xpath("//textarea[@name='q']")).sendKeys("security testing", Keys.ENTER);
		
	}
	@Test (priority = 4, dependsOnMethods= {"test1","test2","test3"},ignoreMissingDependencies = true)
	public void test4() throws Exception{
		d.quit();
	}
}
