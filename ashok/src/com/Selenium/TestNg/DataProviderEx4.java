package com.Selenium.TestNg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx4 {
	static WebDriver d;

	@DataProvider(name = "SingleDimdp")
	public Object[] SingleDimdp() {
		Object data[] = { "admin", "admin123" };
		return data;
	}

	@DataProvider(name = "dpIterator")
	public Iterator<String> Singledp() {
	List<String> data = new ArrayList<>();
	data.add(new String("admin"));
	data.add(new String("admin123"));
	data.add(new String("admin"));
	data.add(new String("admin1234"));
		return data.iterator();
	}
	
	@Test(dataProvider ="dpIterator")
	public void readdata(String uname)throws Exception{
		System.out.println(uname);
	}

	
	@DataProvider(name="dpIteratorArray")
	public Iterator<String[]> dpIteratorArray(){
		List<String[]> data = new ArrayList<>();
		String s[]=new String[3];
		s[0]="admin";
		s[1]="admin123";
		s[2]="admin1234";
		data.add(s);
		return data.iterator();
		
	}
	@Test(dataProvider ="dpIterator")
	public void readdata(String[] uname)throws Exception{
		for (String username: uname)
			System.out.println(username);
	}
}