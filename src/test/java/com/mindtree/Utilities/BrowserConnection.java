package com.mindtree.Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConnection {
	public static WebDriver driver;

	public static void intializeDriver() throws IOException, InterruptedException {
		/*System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();*/
		ReadPropertyFile readOb = new ReadPropertyFile();
		
		if (readOb.getBrowserName().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", readOb.getDriver());
			driver = new ChromeDriver();
		} else if (readOb.getBrowserName().equalsIgnoreCase("firefox")) {
			// code for Fire Fox Browser
		} else {
			// code for IE
		}
		Thread.sleep(7000);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}