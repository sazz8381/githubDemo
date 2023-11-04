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

public class DataProviderEx3 {
	static WebDriver d;
	
	
	@DataProvider(name="SingleDimdp")
	public Object[] SingleDimdp()
	{
		Object data[]={"admin","admin123"};
		return data;	
	}
	
	@Test (dataProvider ="SingleDimdp")
	public void readtes(String uname){
		System.out.println(uname);
	}

}