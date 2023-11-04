package com.Selenium.TestNg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {
	static WebDriver d;
	private int count = 1;
	
	@DataProvider(name="dp")
	public Object[][] dp()
	{
		Object data[][]={{"admin","admin123"},{"admin","admin1234"}};
		return data;	
	}
	
	@Test (dataProvider ="dp")
	public void readtestdata(String uname, String pswd) {
		System.out.println("Iteration= "+count++);
		System.out.println("username="+uname);
		System.out.println("password="+pswd);
	}
}
