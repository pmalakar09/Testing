package com.prasenjit.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserLaunch {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pmala\\Documents\\My Workplace\\Documents\\Study_Materials\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		System.out.println(driver.getTitle());
//		driver.close();
//		driver.quit();
//	}
	@BeforeTest
	public void setExtent(){
		
	}
	@Test (priority=0)
	public void extendRepot1(){
		//ExtentHtmlReporter reporte = new 
		System.out.println("Test1 Case Pass");
	}
	@Test (priority=1)
	public void extendRepot2(){
		System.out.println("Test2 Case Pass");
	}

}
