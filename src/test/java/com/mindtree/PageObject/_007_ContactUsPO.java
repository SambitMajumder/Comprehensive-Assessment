package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore._007_ContactUsUI;

public class _007_ContactUsPO {
	public WebDriver driver;

	public _007_ContactUsPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement contact(WebDriver driver) {
		return driver.findElement(_007_ContactUsUI.contact);
	}
	
	public static WebElement name(WebDriver driver) {
		return driver.findElement(_007_ContactUsUI.name);
	}
	
	public static WebElement email(WebDriver driver) {
		return driver.findElement(_007_ContactUsUI.email);
	}
	
	public static WebElement msg(WebDriver driver) {
		return driver.findElement(_007_ContactUsUI.msg);
	}
	
	public static WebElement btn(WebDriver driver) {
		return driver.findElement(_007_ContactUsUI.btn);
	}
	
	public static WebElement success(WebDriver driver) {
		return driver.findElement(_007_ContactUsUI.success);
	}
	
	
}
