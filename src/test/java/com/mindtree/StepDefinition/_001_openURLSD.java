package com.mindtree.StepDefinition;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.Utilities.BrowserConnection;

import io.cucumber.java.en.Given;

public class _001_openURLSD {
	static WebDriver driver;
	public static Logger Log = LogManager.getLogger(BrowserConnection.class.getName());

	@Given("User Opens the browser")
	public void user_opens_the_browser() throws IOException, InterruptedException {
		BrowserConnection.intializeDriver();
		driver = BrowserConnection.getDriver();
		Log.info("Chrome Browser is launching...");
	}

	@Given("Enter the website URL {string}")
	public void enter_the_website_url(String string) {
		driver.get(string);
		Log.info("Opened the Website URL!");
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
