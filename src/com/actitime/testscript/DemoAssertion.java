package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssertion {
	static {
		System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String aTitle="Google";
		String eTitle="soogle";
		if (eTitle.equals(aTitle)) {
			Reporter.log("Title is matching and pass", true);
		}
		else {
			Reporter.log("Title is not matching and fail", true);
		}
		driver.close();
	}
}
