package com.prasenjit.selenium;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenShotTest extends Base {
	@BeforeMethod
	public void setup() {
		initialization();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void takeSS1() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void takeSS2(){
		Assert.assertEquals(false, true);
	}
	@Test
	public void takeSS3(){
		Assert.assertEquals(false, true);
	}
}
