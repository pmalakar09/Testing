package com.prasenjit.selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.classpath.BshClassPath.GeneratedClassSource;

public class Base {
	public static WebDriver driver;

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pmala\\Documents\\My Workplace\\Documents\\Study_Materials\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	public void failed(String testMethodeName) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,
					new File(System.getProperty("user.dir")+"\\screenshots\\" + testMethodeName + "_"+new SimpleDateFormat("yyyy.MM.dd.HH.mm.sss").format(new Date())+ ".jpg"));
			//System.out.println("Dir: "+System.getProperty("user.dir"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
