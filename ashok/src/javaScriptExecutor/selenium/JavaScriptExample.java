package javaScriptExecutor.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import filepload.selenium.BaseClass;

public class JavaScriptExample extends BaseClass{
	public static void main(String[] args) throws Exception {
	getBrowser("Chrome", "https://demo.automationtesting.in/Register.html");
	Thread.sleep(3000);
	System.out.println(getDriver().getTitle());
	JavascriptExecutor js = ((JavascriptExecutor)getDriver()); 
	WebElement ele = (WebElement)js.executeScript("return document.getElementById('checkbox1');,");
	clickElement((By) ele);
	
	
	
	
}
}
